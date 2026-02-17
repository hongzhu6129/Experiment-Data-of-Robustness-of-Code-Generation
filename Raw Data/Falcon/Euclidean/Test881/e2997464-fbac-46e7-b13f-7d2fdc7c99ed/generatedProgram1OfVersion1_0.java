import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime {

    public static void main(String[] args) {
        String dateString = "2023-10-27 10:30:00"; // Example date string

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = dateFormat.parse(dateString);

            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String extractedDate = dateFormatter.format(date);

            SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
            String extractedTime = timeFormatter.format(date);


            System.out.println("Original Date String: " + dateString);
            System.out.println("Extracted Date: " + extractedDate);
            System.out.println("Extracted Time: " + extractedTime);



        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }



         //Example with a different date format:

        dateString = "Oct 27, 2023 10:30 AM";  // Different format

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm a"); // Adjusted format
            Date date = dateFormat.parse(dateString);
            
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            String extractedDate = dateFormatter.format(date);

            SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");  // 24-hour format
            String extractedTime = timeFormatter.format(date);
             
            System.out.println("\nOriginal Date String (Different Format): " + dateString);
            System.out.println("Extracted Date: " + extractedDate);
            System.out.println("Extracted Time: " + extractedTime);


        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }



    }
}
