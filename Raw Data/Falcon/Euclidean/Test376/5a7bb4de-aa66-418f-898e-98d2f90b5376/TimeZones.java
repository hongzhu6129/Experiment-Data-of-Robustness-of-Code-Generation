import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println("Available Time Zones (UTC/GMT and others):");

        for (String zoneId : allZoneIds) {
            if (zoneId.startsWith("UTC") || zoneId.startsWith("GMT") || zoneId.contains("Etc/")) { // Focus on UTC, GMT and Etc
                ZoneId zone = ZoneId.of(zoneId);
                ZonedDateTime now = ZonedDateTime.now(zone);
                System.out.println(zoneId + ": " + now.toString()); 
            }
        }
    }
}
