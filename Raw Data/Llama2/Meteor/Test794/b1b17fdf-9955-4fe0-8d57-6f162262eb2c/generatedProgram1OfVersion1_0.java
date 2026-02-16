import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        Set<String> availableIDs = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String id : availableIDs) {
            TimeZone tz = TimeZone.getTimeZone(id);

            // Filter and display only UTC/GMT time zones
            if (id.startsWith("Etc/GMT") || id.startsWith("UTC") || id.equals("GMT") || id.equals("GMT0")) {
                System.out.println(id + ": " + tz.getDisplayName());
            }
        }
    }
}
