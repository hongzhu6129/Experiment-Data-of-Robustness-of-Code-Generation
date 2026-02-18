import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class NewYorkTime {

    public static void main(String[] args) {
        // Get the current time in New York
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        ZonedDateTime nowInNewYork = ZonedDateTime.now(newYorkZoneId);

        // Format the time (optional, but makes it more readable)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = nowInNewYork.format(formatter);


        // Print the current time
        System.out.println("Current time in New York: " + formattedTime); 
    }
}
