import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateConverter {

    public static void main(String[] args) {

        // String to Date/Time Conversion
        String dateString = "2024-03-15 10:30:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);
            System.out.println("Converted DateTime: " + dateTime);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing date/time: " + e.getMessage());
        }


        // Date/Time to String Conversion
        LocalDateTime now = LocalDateTime.now();  // Get the current date and time

        // Format the current date and time using the same pattern
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date/Time: " + formattedDateTime);

        // Demonstrate formatting to a different pattern 
        DateTimeFormatter differentFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        String differentFormat = now.format(differentFormatter);
        System.out.println("Formatted with different pattern: " + differentFormat);



    }
}
