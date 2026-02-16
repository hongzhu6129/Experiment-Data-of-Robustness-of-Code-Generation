import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class CurrentTimeInAllTimeZones {

    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Get the current date and time in the system's default time zone
        LocalDateTime now = LocalDateTime.now();

        // Formatter for displaying the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");


        System.out.println("Current time in all time zones:");

        // Iterate through all available time zones
        for (String zoneId : allZoneIds) {
            // Convert the current time to the specific time zone
            ZonedDateTime zonedDateTime = now.atZone(ZoneId.of(zoneId));

            // Print the current time in the specific time zone using the formatter
            System.out.println(zonedDateTime.format(formatter) + "  " + zoneId ); 
        }
    }
}
