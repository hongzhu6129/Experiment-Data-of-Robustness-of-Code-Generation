import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {

    public static void main(String[] args) {
        String dateString = "2023-10-27"; // Example date string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Define the date format

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Converted date: " + date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }


        // Example with a different date format:
        String dateString2 = "10/27/2023"; 
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");

        try {
            Date date2 = dateFormat2.parse(dateString2);
            System.out.println("Converted date 2: " + date2);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
        }



        // Handling potential exceptions is crucial
        String invalidDateString = "not-a-date";
        SimpleDateFormat invalidDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
             Date invalidDate = invalidDateFormat.parse(invalidDateString);
             System.out.println(invalidDate); // This line will not be reached if an exception occurs.
        } catch (ParseException e) {
             System.out.println("Invalid date string: " + e.getMessage());
        }
    }
}
