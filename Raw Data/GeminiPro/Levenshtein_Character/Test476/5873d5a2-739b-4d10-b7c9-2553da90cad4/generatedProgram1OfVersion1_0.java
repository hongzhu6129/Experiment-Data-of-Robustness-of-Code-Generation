import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {

        // String to LocalDateTime
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO 8601 format
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            System.out.println("Converted LocalDateTime: " + dateTime);


            // Demonstrate with a custom format string
            String customDateString = "27/Oct/2023 10:30";
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");
            LocalDateTime customDateTime = LocalDateTime.parse(customDateString, customFormatter);
            System.out.println("Converted LocalDateTime (custom format): " + customDateTime);


        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time string: " + e.getMessage());
        }


        // LocalDateTime to String
        LocalDateTime currentDateTime = LocalDateTime.now();

        // ISO format
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String isoString = currentDateTime.format(isoFormatter);
        System.out.println("LocalDateTime to ISO string: " + isoString);

        // Custom format
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss"); //Example
        String customString = currentDateTime.format(customFormatter);
        System.out.println("LocalDateTime to custom string: " + customString);
    }
}
