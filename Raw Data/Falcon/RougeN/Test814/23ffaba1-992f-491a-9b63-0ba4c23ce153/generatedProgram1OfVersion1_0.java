import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class StringToTime {

    public static void main(String[] args) {
        // Example 1: String to LocalDateTime
        String timeString = "2024-03-15T10:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.parse(timeString, formatter);

        // Previous time (e.g., 1 hour before)
        LocalDateTime previousTime = dateTime.minus(1, ChronoUnit.HOURS);

        // LocalDateTime to String
        String previousTimeString = previousTime.format(formatter);


        System.out.println("Original time: " + timeString);
        System.out.println("Previous time: " + previousTimeString);


        // Example 2:  Vice-versa (String to Time and back, with a different format)
        String timeString2 = "15/03/2024 10:30 AM";  // Example using a different format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"); // Define the format

        try {
             LocalDateTime dateTime2 = LocalDateTime.parse(timeString2, formatter2); 
             String convertedBackToString = dateTime2.format(formatter2);  // Convert back

            System.out.println("\nOriginal time (different format): " + timeString2);
            System.out.println("Converted back to String: " + convertedBackToString);


        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }


        // Example 3: Handling potential errors during parsing (important)
        String invalidTimeString = "2024-13-15T10:30:00"; // Invalid month

        try {
            LocalDateTime invalidDateTime = LocalDateTime.parse(invalidTimeString, formatter);
        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("\nError parsing invalid date/time: " + e.getMessage());
        }


    }
}
