import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zone IDs
        Set<String> zoneIds = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");

        // Iterate through the time zone IDs and display them
        for (String zoneId : zoneIds) {
            TimeZone zone = TimeZone.getTimeZone(zoneId);

            // Check if the time zone is a UTC or GMT zone
            if (zoneId.startsWith("UTC") || zoneId.startsWith("GMT") || zoneId.equals("Etc/UTC") || zoneId.equals("Etc/GMT")) { // Include Etc/UTC and Etc/GMT
                System.out.println(zoneId + " (Raw Offset: " + zone.getRawOffset() / (60 * 1000) + " minutes)"); // Display raw offset in minutes 
            }
        }
    }
}
