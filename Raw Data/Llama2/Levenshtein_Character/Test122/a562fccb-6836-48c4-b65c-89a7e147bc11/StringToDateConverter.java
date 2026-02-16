import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateConverter {

    public static void main(String[] args) {
        // String to Date/Time Conversion
        String dateTimeString = "2023-10-27T10:30:00"; // Example ISO-8601 format
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // Adjust format as needed
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            System.out.println("Converted Date/Time: " + dateTime);

            //  Demonstrate with a different format
            String dateTimeString2 = "27/10/2023 10:30"; 
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime dateTime2 = LocalDateTime.parse(dateTimeString2, formatter2);
            System.out.println("Converted Date/Time (different format): " + dateTime2);



        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }

        // Date/Time to String Conversion
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatterIso = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String isoFormattedDateTime = currentDateTime.format(formatterIso);
        System.out.println("ISO Formatted Date/Time: " + isoFormattedDateTime);

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
        String customFormattedDateTime = currentDateTime.format(customFormatter);
        System.out.println("Custom Formatted Date/Time: " + customFormattedDateTime);


    }
}
