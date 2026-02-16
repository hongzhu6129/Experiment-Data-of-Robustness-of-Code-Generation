import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {

        // Get all available time zone IDs
        Set<String> allTimeZones = TimeZone.getAvailableIDs();

        // Display UTC and GMT time zones
        System.out.println("Available UTC and GMT Time Zones:");
        for (String timeZoneID : allTimeZones) {
            if (timeZoneID.startsWith("UTC") || timeZoneID.startsWith("GMT") || timeZoneID.equals("Etc/UTC") || timeZoneID.equals("Etc/GMT")) { // Include variants like Etc/UTC
                 System.out.println(timeZoneID); 
            }
        }
    }
}
