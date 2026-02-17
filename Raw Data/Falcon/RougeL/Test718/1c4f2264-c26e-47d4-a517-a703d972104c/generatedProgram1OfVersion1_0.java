import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeInNewYork {

    public static void main(String[] args) {
        // Get the current time in New York (America/New_York time zone)
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/New_York"));

        // Format the time for display  (e.g., "yyyy-MM-dd HH:mm:ss z")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = now.format(formatter);

        // Print the current time
        System.out.println("The current time in New York is: " + formattedDateTime);
    }
}
