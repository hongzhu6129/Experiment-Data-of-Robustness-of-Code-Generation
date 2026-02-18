import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {

        // String to LocalDateTime
        String dateTimeString = "2024-03-15T10:30:00"; // Example ISO-8601 format
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // Adjust formatter if needed
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            System.out.println("Converted LocalDateTime: " + dateTime);

            // LocalDateTime to String (using a custom format)
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = dateTime.format(customFormatter);
            System.out.println("Formatted String: " + formattedDateTime);


            // Demonstrate another conversion with a different date/time format:
            String dateString2 = "03/15/2024 14:45"; // Example US format
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
            LocalDateTime dateTime2 = LocalDateTime.parse(dateString2, formatter2);
            System.out.println("Converted LocalDateTime 2: " + dateTime2);

            String formattedDateTime2 = dateTime2.format(DateTimeFormatter.ISO_DATE_TIME);
            System.out.println("Formatted String 2 (ISO): " + formattedDateTime2);

        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }




    }
}

