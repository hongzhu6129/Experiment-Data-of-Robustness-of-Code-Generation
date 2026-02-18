import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateFormat {

    public static String getCurrentDateAndTime(String zone) {
        // Get the current date and time in the specified time zone
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zone)); 

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        // Format the date and time
        return now.format(formatter);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Current Date and Time (UTC): " + getCurrentDateAndTime("UTC"));
        System.out.println("Current Date and Time (America/New_York): " + getCurrentDateAndTime("America/New_York"));
        System.out.println("Current Date and Time (Asia/Tokyo): " + getCurrentDateAndTime("Asia/Tokyo"));


        // Corner Case: Invalid Time Zone
         try {
             System.out.println("Current Date and Time (InvalidZone): " + getCurrentDateAndTime("InvalidZone"));
         } catch (Exception e) {
             System.out.println("Error: " + e.getMessage()); // Expecting a ZoneRulesException
         }

        // Corner Case: Edge of second/millisecond change
        // Difficult to test precisely due to execution time variations, but include for awareness
         for(int i=0; i<5; i++){ // Run a few times to increase the chance of hitting an edge
            System.out.println("Rapid calls to demonstrate potential edge case: " + getCurrentDateAndTime("UTC"));
         }


    }
}
