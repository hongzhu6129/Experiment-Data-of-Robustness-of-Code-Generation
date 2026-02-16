import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConversion {

    public static void main(String[] args) {

        // String to LocalDateTime
        String dateString = "2023-10-27T10:30:00"; // Example ISO-8601 format
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateString);
            System.out.println("Converted LocalDateTime: " + dateTime);


            // Demonstrating custom formatting during String to LocalDateTime conversion
            String customDateString = "27/10/2023 10:30 AM";
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
            LocalDateTime customDateTime = LocalDateTime.parse(customDateString, customFormatter);
            System.out.println("Converted LocalDateTime (custom format): " + customDateTime);


        } catch (DateTimeParseException e) {
            System.out.println("Invalid date/time format: " + e.getMessage());
        }

        // LocalDateTime to String
        LocalDateTime now = LocalDateTime.now();

        // Default ISO-8601 format
        String isoDateString = now.toString();
        System.out.println("LocalDateTime to String (ISO-8601): " + isoDateString);



        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");
        String formattedDateString = now.format(formatter);
        System.out.println("LocalDateTime to String (custom format): " + formattedDateString);



         // Another common pattern example
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");  // Month/Day/Year Hour:Minute:Second
        String formattedDateString2 = now.format(formatter2);
        System.out.println("LocalDateTime to String (another custom format): " + formattedDateString2);

    }
}
