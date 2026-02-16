import java.util.TimeZone;

public class TimeZones {

    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();

        System.out.println("Available Time Zones (UTC/GMT):");
        for (String id : availableIDs) {
             // Filter for UTC and GMT identifiers. Some may contain "GMT" but not start with it,
            // and others are pure numerical UTC offsets.
            if (id.startsWith("UTC") || id.startsWith("GMT") || id.matches("UTC[+-]\\d+")) {
                TimeZone tz = TimeZone.getTimeZone(id);
                System.out.println(id + " (Raw Offset: " + tz.getRawOffset() / (1000 * 60 * 60) + " hours)"); // Display raw offset for clarity
            }


        }
    }
}
