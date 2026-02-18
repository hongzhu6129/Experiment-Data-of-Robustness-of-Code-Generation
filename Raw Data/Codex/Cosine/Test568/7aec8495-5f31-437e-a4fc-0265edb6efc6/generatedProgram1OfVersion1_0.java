import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {

        // Get all available time zone IDs
        Set<String> zoneIds = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String zoneId : zoneIds) {
            // Filter for UTC and GMT time zones (more robust approach)
            if (zoneId.startsWith("Etc/UTC") || zoneId.startsWith("Etc/GMT") || zoneId.equals("UTC") || zoneId.equals("GMT")  || zoneId.contains("GMT")|| zoneId.contains("UTC"))  {
                TimeZone tz = TimeZone.getTimeZone(zoneId);
                System.out.println(zoneId + " (Raw Offset: " + tz.getRawOffset() / (60 * 1000) + " minutes)"); // Display offset in minutes
            }

        }
    }
}
