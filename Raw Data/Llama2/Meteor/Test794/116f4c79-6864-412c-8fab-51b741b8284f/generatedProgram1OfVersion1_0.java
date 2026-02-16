import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {

        Set<String> availableIDs = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String id : availableIDs) {
            // Filter for UTC and GMT zones. Simpler approach than checking raw offsets 
            // since some zones might share the same offset but have different rules.
            if (id.startsWith("UTC") || id.startsWith("GMT") || id.contains("Etc/")) { 
                TimeZone tz = TimeZone.getTimeZone(id);
                System.out.println(id + " (Raw Offset: " + tz.getRawOffset() + ")");
            }
        }
    }
}
