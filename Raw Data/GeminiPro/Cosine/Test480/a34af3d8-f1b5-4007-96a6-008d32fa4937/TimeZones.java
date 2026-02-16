import java.util.TimeZone;

public class TimeZones {

    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");

        for (String id : availableIDs) {
            TimeZone tz = TimeZone.getTimeZone(id);

            // Filter and display only UTC/GMT time zones
            if (id.startsWith("Etc/GMT") || id.startsWith("UTC") || id.startsWith("GMT")) {  
                 System.out.println(id + ": " + tz.getDisplayName()); // Optionally display the longer name as well              
            }

           // Alternative using getRawOffset for exact UTC/GMT offsets
            // if (tz.getRawOffset() % (3600 * 1000) == 0) { // Check if the offset is a whole number of hours (like GMT/UTC)
            //     System.out.println(id + ": " + tz.getDisplayName() + " (Offset: " + tz.getRawOffset() / (3600 * 1000) + " hours)");
            //}
        }
    }
}
