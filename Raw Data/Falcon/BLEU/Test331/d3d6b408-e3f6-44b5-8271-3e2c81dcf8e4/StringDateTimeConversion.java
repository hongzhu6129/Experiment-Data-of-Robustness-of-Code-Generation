import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringDateTimeConversion {

    public static void main(String[] args) {
        // Example string date and time
        String dateTimeString = "2023-10-27T10:30:00";

        // Convert string to LocalDateTime
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString);
            System.out.println("Converted LocalDateTime: " + dateTime);


            // Convert LocalDateTime back to string in a different format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
            String formattedDateTime = dateTime.format(formatter);
            System.out.println("Formatted String: " + formattedDateTime);



            // Example 2: Using a different input format
            String dateTimeString2 = "October 27, 2023 10:30 AM";
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
            LocalDateTime dateTime2 = LocalDateTime.parse(dateTimeString2, formatter2);
            System.out.println("Converted LocalDateTime 2: " + dateTime2);

             //Convert back to ISO format
            String isoFormat = dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            System.out.println("ISO Format: " + isoFormat);

        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());

        }


         // Another example with a different date/time format
        try {
             String dateTimeString3 = "27/10/2023 10:30"; // Example dd/MM/yyyy HH:mm format
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime dateTime3 = LocalDateTime.parse(dateTimeString3, formatter3);
            System.out.println("Converted LocalDateTime 3: " + dateTime3);

        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time 3: " + e.getMessage());

        }



    }
}
