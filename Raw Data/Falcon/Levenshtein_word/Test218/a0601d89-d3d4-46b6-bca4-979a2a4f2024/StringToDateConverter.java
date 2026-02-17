import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {

    public static void main(String[] args) {
        String dateString = "2023-10-27"; // Example date string
        String format = "yyyy-MM-dd"; // Date format

        try {
            Date date = convertStringToDate(dateString, format);
            System.out.println("Converted date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format or value: " + e.getMessage());
        }


        // Demonstrating different formats
        try {
            Date date2 = convertStringToDate("10/27/2023", "MM/dd/yyyy");
            System.out.println("Converted date2: " + date2);
        } catch (ParseException e) {
            System.out.println("Invalid date format or value: " + e.getMessage());
        }


        try {
            Date date3 = convertStringToDate("Oct 27, 2023", "MMM dd, yyyy");
            System.out.println("Converted date3: " + date3);
        } catch (ParseException e) {
            System.out.println("Invalid date format or value: " + e.getMessage());

        }

    }

    private static Date convertStringToDate(String dateString, String format) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(dateString);
    }
}
