import java.util.TimeZone;
import java.util.Set;

public class TimeZones {

    public static void main(String[] args) {
        // Get all available time zone IDs
        Set<String> availableZoneIds = TimeZone.getAvailableIDs();

        // Iterate through the available time zone IDs
        for (String zoneId : availableZoneIds) {
            // Get the TimeZone object for the current ID
            TimeZone tz = TimeZone.getTimeZone(zoneId);

            // Display the time zone ID, UTC offset, and GMT offset.
            // Note: getRawOffset() returns the offset from UTC in milliseconds.
            // We divide by (1000 * 60 * 60) to get the offset in hours.

            System.out.printf("Time Zone ID: %s, UTC Offset: %d hours, GMT Offset: %d hours\n",
                    zoneId, tz.getRawOffset() / (1000 * 60 * 60), tz.getRawOffset() / (1000 * 60 * 60)); // GMT and UTC offsets are the same

        }
    }
}
