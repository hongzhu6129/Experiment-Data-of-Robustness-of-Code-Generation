import java.util.TimeZone;
import java.util.Arrays;

public class TimeZones {

    public static void main(String[] args) {

        // Get all available time zone IDs
        String[] availableIDs = TimeZone.getAvailableIDs();

        // Sort the IDs alphabetically for easier viewing
        Arrays.sort(availableIDs);

        // Print the time zones in UTC/GMT format
        System.out.println("Available Time Zones (UTC/GMT):");
        for (String id : availableIDs) {
            TimeZone tz = TimeZone.getTimeZone(id);
            
            // Extract raw offset and DST offset (both in milliseconds)
            int rawOffset = tz.getRawOffset();
            int dstOffset = tz.getDSTSavings(); 

            // Calculate total offset in hours and minutes
            int totalOffset = rawOffset + dstOffset;
            int offsetHours = totalOffset / (60 * 60 * 1000);
            int offsetMinutes = Math.abs((totalOffset % (60 * 60 * 1000)) / (60 * 1000)); // Use absolute value for minutes

            // Format the output  (+/-HH:MM)
            String offsetString = String.format("%+03d:%02d", offsetHours, offsetMinutes);

            System.out.println(id + " (UTC" + offsetString + ")");
        }
    }
}
