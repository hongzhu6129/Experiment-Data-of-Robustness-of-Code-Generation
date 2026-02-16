import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateAndTime {

    public static void main(String[] args) {

        // String to LocalDateTime
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO 8601 format
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
            System.out.println("String converted to LocalDateTime: " + dateTime);


            // Demonstrating custom format parsing
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String customDateTimeString = "2023-10-27 11:45:00";
            LocalDateTime customDateTime = LocalDateTime.parse(customDateTimeString, customFormatter);
            System.out.println("String with custom format converted to LocalDateTime: " + customDateTime);

        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time string: " + e.getMessage());
        }


        // LocalDateTime to String (ISO 8601 format)
        LocalDateTime now = LocalDateTime.now();
        String isoDateString = now.toString();
        System.out.println("LocalDateTime converted to ISO 8601 string: " + isoDateString);


        // LocalDateTime to String (Custom format)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss a"); // Example custom format
        String formattedDateString = now.format(formatter);
        System.out.println("LocalDateTime converted to custom formatted string: " + formattedDateString);
    }
}
