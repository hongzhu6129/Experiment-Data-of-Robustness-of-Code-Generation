import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zone IDs
        Set<String> timeZoneIds = TimeZone.getAvailableIDs();

        // Iterate through the IDs and display UTC and GMT time zones
        System.out.println("Available UTC and GMT Time Zones:");
        for (String id : timeZoneIds) {
            if (id.startsWith("Etc/UTC") || id.startsWith("Etc/GMT") || id.equals("UTC") || id.equals("GMT")  || id.startsWith("GMT") || id.contains("UTC") || id.contains("GMT") ) { //Broader match to catch variations
                TimeZone tz = TimeZone.getTimeZone(id);
                System.out.println(id + " (Raw Offset: " + tz.getRawOffset() + "ms)"); 
            }
        }
    }
}
