import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConverter {

    public static void main(String[] args) {

        // String to LocalDateTime
        String dateTimeString = "2024-03-15T10:30:00"; // Example ISO-8601 format
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
            System.out.println("Converted LocalDateTime: " + dateTime);

            // Demonstrate formatting to a different pattern
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a");
            String formattedDateTime = dateTime.format(formatter);
            System.out.println("Formatted LocalDateTime: " + formattedDateTime);


        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }


        // LocalDateTime to String (ISO-8601 format)
        LocalDateTime currentDateTime = LocalDateTime.now();
        String isoDateTimeString = currentDateTime.toString();  // Default ISO format
        System.out.println("Current LocalDateTime (ISO-8601): " + isoDateTimeString);



        // LocalDateTime to String (Custom format)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String customFormattedDateTime = currentDateTime.format(customFormatter);
        System.out.println("Current LocalDateTime (Custom Format): " + customFormattedDateTime);


        // Handling potential exceptions (important for user input)
        String invalidDateString = "2024/03/15 10:30"; // Incorrect format
        try {
            LocalDateTime invalidDateTime = LocalDateTime.parse(invalidDateString, customFormatter); // Specify formatter
            System.out.println(invalidDateTime);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date/time format: " + e.getMessage());
        }


    }
}
