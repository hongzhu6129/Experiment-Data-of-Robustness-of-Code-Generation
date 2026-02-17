import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {

        // String to Date/Time
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO-8601 format
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
            System.out.println("Converted LocalDateTime: " + dateTime);

            // Demonstrate formatting with a custom pattern
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm a");
            String formattedDateTime = dateTime.format(customFormatter);
            System.out.println("Formatted LocalDateTime: " + formattedDateTime);

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date/time format: " + e.getMessage());
        }


        // Date/Time to String
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Using ISO-8601 format (default)
        String isoString = currentDateTime.toString();
        System.out.println("Current LocalDateTime (ISO-8601): " + isoString);


        // Using a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedString = currentDateTime.format(formatter);
        System.out.println("Current LocalDateTime (formatted): " + formattedString);


    }
}
