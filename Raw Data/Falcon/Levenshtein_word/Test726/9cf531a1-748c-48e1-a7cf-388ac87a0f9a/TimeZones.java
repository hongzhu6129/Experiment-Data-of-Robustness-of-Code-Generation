import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Print UTC and GMT time borders
        System.out.println("Available Time Zones (UTC and GMT):");

        for (String zoneId : zoneIds) {
            if (zoneId.contains("UTC") || zoneId.contains("GMT")) {
                ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
                System.out.println(zoneId + ": " + now.toString());
            }
        }

     //An alternative approach to find GMT specifically and accounting for the fact that  "GMT" is largely deprecated and replaced by "Etc/GMT":
      System.out.println("\nSpecifically GMT/Etc/GMT zones:");  
       for (String zoneId : ZoneIds.getAvailableZoneIds()) {
            if (zoneId.startsWith("GMT") || zoneId.startsWith("Etc/GMT")) {
                 ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
                System.out.println(zoneId + ": " + now.toString());
            }
        }

    }
}
