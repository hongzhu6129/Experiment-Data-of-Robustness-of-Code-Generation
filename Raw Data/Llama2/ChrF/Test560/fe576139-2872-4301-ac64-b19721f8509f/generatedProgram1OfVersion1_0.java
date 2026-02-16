import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Time Zones in +0600 and GMT:");

        for (String zoneId : allZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime now = ZonedDateTime.now(zone);

            if (zone.getRules().getOffset(now.toInstant()).getTotalSeconds() / 3600 == 6 || 
                zone.getRules().getOffset(now.toInstant()).getTotalSeconds() / 3600 == 0) {  //Check for +0600 or GMT/UTC

                System.out.println(zoneId + ": " + formatter.format(now));
            }
        }
    }
}
