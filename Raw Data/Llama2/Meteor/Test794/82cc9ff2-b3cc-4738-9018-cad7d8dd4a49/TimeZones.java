import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Time Zones with offset +06:00 and GMT:");
        for (String zoneId : allZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime now = ZonedDateTime.now(zone);

            if (now.getOffset().getTotalSeconds() == 6 * 60 * 60 || zone.getId().equals("GMT") || zone.getId().equals("UTC") || zone.getId().equals("Etc/GMT")) { // Check for +06:00 offset or GMT/UTC
                System.out.println(zone.getId() + ": " + formatter.format(now)); 
            }
        }
    }
}
