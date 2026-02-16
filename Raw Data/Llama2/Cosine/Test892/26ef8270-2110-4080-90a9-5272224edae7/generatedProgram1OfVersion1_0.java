import java.util.TimeZone;
import java.util.Arrays;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zone IDs
        String[] availableIDs = TimeZone.getAvailableIDs();

        // Sort the IDs for easier readability (optional)
        Arrays.sort(availableIDs);

        // Display the time zones with UTC/GMT offsets
        System.out.println("Available Time Zones (UTC/GMT):");
        for (String id : availableIDs) {
            TimeZone tz = TimeZone.getTimeZone(id);
            int offset = tz.getRawOffset(); // Offset in milliseconds

            // Calculate and format the offset in hours and minutes
            int hours = offset / (60 * 60 * 1000);
            int minutes = Math.abs((offset / (60 * 1000)) % 60);  // Use absolute value for minutes
            String formattedOffset = String.format("UTC%s%02d:%02d", (hours >= 0 ? "+" : "-"), Math.abs(hours), minutes); // Format as UTC+ or UTC-

            System.out.println(id + " : " + formattedOffset );
        }

    }
}

