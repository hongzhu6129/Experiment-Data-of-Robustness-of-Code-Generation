import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {
        // String to Date and Time conversion
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO 8601 format
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
            System.out.println("Converted LocalDateTime: " + dateTime);

            // Demonstrate formatting the LocalDateTime to a different format
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = dateTime.format(customFormatter);
            System.out.println("Formatted LocalDateTime: " + formattedDateTime);


        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time string: " + e.getMessage());
        }



        // Date and Time to String conversion
        LocalDateTime now = LocalDateTime.now();

        // Using ISO_LOCAL_DATE_TIME for a standard format
        String isoDateTimeString = now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("ISO 8601 String: " + isoDateTimeString);


        // Using a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss a"); // Example format
        String formattedString = now.format(formatter);
        System.out.println("Formatted String: " + formattedString);

    }
}
