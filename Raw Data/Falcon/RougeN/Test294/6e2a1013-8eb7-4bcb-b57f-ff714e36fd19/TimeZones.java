import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {

        // Get all available time zone IDs
        Set<String> zoneIds = TimeZone.getAvailableIDs();

        // Print UTC and GMT time zones
        System.out.println("UTC Time Zones:");
        for (String zoneId : zoneIds) {
            if (zoneId.startsWith("UTC") || zoneId.startsWith("Etc/UTC") || zoneId.startsWith("Etc/GMT")) {
                 System.out.println(zoneId);
            }
        }

        System.out.println("\nGMT Time Zones:"); // Added a newline for clarity
        for (String zoneId : zoneIds) {
            if (zoneId.startsWith("GMT") || zoneId.contains("GMT")  || zoneId.startsWith("Etc/GMT") || zoneId.equals("Zulu")) { // Include Etc/GMT and Zulu (another name for GMT)
                 System.out.println(zoneId);
            }
        }
    }
}
