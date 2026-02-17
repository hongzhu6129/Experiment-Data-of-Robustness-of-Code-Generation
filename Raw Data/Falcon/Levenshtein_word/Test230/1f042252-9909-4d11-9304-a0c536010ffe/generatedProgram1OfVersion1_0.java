import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class CurrentTimeInAllZones {

    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> zoneIds = ZoneId.availableZoneIds();

        // Print the current time for each zone
        for (String zoneId : zoneIds) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
            System.out.println("Zone: " + zoneId + ", Current Time: " + now);
        }
    }
}
