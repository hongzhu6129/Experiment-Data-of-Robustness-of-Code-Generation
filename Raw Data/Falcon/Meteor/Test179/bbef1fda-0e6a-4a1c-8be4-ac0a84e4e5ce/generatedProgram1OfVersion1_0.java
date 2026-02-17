import java.time.ZoneId;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.availableZoneIds();

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String zoneId : allZoneIds) {
            if (zoneId.startsWith("UTC") || zoneId.startsWith("GMT") || zoneId.contains("Etc/GMT") || zoneId.contains("Etc/UTC")) {  // Filter for UTC and GMT zones. Includes variations like Etc/GMT+...
                System.out.println(zoneId);
            }
        }
    }
}
