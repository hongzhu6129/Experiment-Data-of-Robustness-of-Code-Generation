import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {

    public static void main(String[] args) {
        // String to Date conversion
        String dateString = "2023-11-20"; // Example date string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Define the date format

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Converted Date: " + date);


            // Date to String Conversion
            SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy"); //  Different output format
            String convertedString = outputFormat.format(date);
            System.out.println("Converted String: " + convertedString);


            //Demonstrating with another date format (e.g., dd/MM/yyyy)
            String dateString2 = "25/12/2024";
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");

            Date date2 = dateFormat2.parse(dateString2);
            System.out.println("Converted Date 2: " + date2);

            SimpleDateFormat outputFormat2 = new SimpleDateFormat("EEEE, MMM dd, yyyy"); // Another output format
            String convertedString2 = outputFormat2.format(date2);
            System.out.println("Converted String 2: " + convertedString2);



        } catch (ParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd or dd/MM/yyyy"); // Handle parsing errors
        }
    }
}
