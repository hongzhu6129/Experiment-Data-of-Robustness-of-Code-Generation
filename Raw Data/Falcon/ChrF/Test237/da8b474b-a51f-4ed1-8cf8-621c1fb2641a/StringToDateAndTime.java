import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class StringToDateAndTime {

    public static void main(String[] args) {

        // String to Date and Time Conversion
        String dateTimeString = "2024-03-15T10:30:00";  // Example ISO 8601 format
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // Use appropriate formatter

        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
            System.out.println("Converted Date and Time: " + dateTime);


            // Date and Time to String Conversion
            String formattedDateTimeString = dateTime.format(formatter); // Convert back to string
            System.out.println("Formatted Date and Time String: " + formattedDateTimeString);



            // Demonstrating a different format:
            DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");  //Example
            String customFormattedDateTime = dateTime.format(customFormatter);
            System.out.println("Custom Formatted Date and Time: " + customFormattedDateTime);



            LocalDateTime parsedCustomDateTime = LocalDateTime.parse(customFormattedDateTime, customFormatter);
             System.out.println("Parsed Custom Formatted Date and Time: " + parsedCustomDateTime);



        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date/time: " + e.getMessage());
        }


        // Handling null or empty strings:  Always validate input!
        String nullString = null;
        String emptyString = "";

        try {
            //These will throw NullPointerException if not handled:
            //LocalDateTime.parse(nullString, formatter); 
            //LocalDateTime.parse(emptyString, formatter);

             if(nullString != null && !nullString.isEmpty()) { // Check for null and empty
                  LocalDateTime dt = LocalDateTime.parse(nullString, formatter);
             }
             if(emptyString != null && !emptyString.isEmpty()) { // Check for null and empty
                  LocalDateTime dt = LocalDateTime.parse(emptyString, formatter); 
             }



        }catch(DateTimeParseException | NullPointerException e) { //Multi-catch
             System.err.println("Error handling null or empty string : " + e.getMessage());
        }






    }
}
