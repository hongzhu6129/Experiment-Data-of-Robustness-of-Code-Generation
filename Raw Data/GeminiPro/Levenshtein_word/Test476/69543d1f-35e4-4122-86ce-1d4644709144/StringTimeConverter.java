import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringTimeConverter {

    public static void main(String[] args) {
        // Demonstrate string to LocalDateTime conversion
        String timeString = "2024-03-15T10:30:00"; // Example ISO-8601 format
        LocalDateTime dateTime = stringToLocalDateTime(timeString);

        if (dateTime != null) {
            System.out.println("Converted LocalDateTime: " + dateTime);

            // Demonstrate LocalDateTime to string conversion
            String convertedString = localDateTimeToString(dateTime);
            System.out.println("Converted back to String: " + convertedString);


             // Demonstrate getting the previous time (e.g., one hour before)
            LocalDateTime previousTime = dateTime.minusHours(1);
            System.out.println("Previous time (1 hour before): " + previousTime);
            String previousTimeString = localDateTimeToString(previousTime);
            System.out.println("Previous time as string: " + previousTimeString);
        }



        // Example with a different format and handling potential errors
        String anotherTimeString = "15/03/2024 10:30 AM"; 
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");

        try {
            LocalDateTime anotherDateTime = LocalDateTime.parse(anotherTimeString, customFormatter);
            System.out.println("Another converted LocalDateTime: " + anotherDateTime);
        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }
    }

    public static LocalDateTime stringToLocalDateTime(String timeString) {
        try {
             // Attempt parsing with ISO-8601 format first (most common)
            return LocalDateTime.parse(timeString); 
        } catch (DateTimeParseException e) {
            // If ISO format fails, try a more lenient pattern (adjust as needed)
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                return LocalDateTime.parse(timeString, formatter);
            } catch (DateTimeParseException ex) {
                System.err.println("Error parsing date/time: " + ex.getMessage());
                return null; // Or handle the error differently (e.g., throw an exception)
            }
        }
    }

    public static String localDateTimeToString(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME); // Or specify a custom format
    }
}
