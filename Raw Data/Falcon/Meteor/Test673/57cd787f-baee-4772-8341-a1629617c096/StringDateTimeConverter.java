import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {
        // String to Date and Time conversion
        String dateTimeString = "2024-03-15T10:30:00"; // Example ISO-8601 format
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"); // Adjust pattern as needed
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            System.out.println("Converted DateTime: " + dateTime);


            // Demonstrate different formats
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss a");
            String formattedDateTime = dateTime.format(customFormatter);
            System.out.println("Formatted DateTime: " + formattedDateTime); // Example: Mar 15, 2024 10:30:00 AM


        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }


        // Date and Time to String Conversion
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // Default ISO format
        String dateTimeString2 = currentDateTime.format(formatter);
        System.out.println("Current DateTime as String (ISO): " + dateTimeString2);

        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        String formattedDateTime2 = currentDateTime.format(customFormatter2); 
        System.out.println("Current DateTime as String (Custom): " + formattedDateTime2); // Example: Thursday, March 14, 2024


    }
}
