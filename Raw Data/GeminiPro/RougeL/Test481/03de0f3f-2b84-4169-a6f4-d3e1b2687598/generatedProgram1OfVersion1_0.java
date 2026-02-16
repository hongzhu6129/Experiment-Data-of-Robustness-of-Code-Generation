import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Print zone offsets for some example zones
        System.out.println("Los Angeles: " + formatOffset(getOffset("America/Los_Angeles")));
        System.out.println("New York: " + formatOffset(getOffset("America/New_York")));
        System.out.println("London: " + formatOffset(getOffset("Europe/London")));
        System.out.println("Tokyo: " + formatOffset(getOffset("Asia/Tokyo")));

        // Iterate through all zones and print their offsets (optional)
        /*
        for (String zoneId : zoneIds) {
            System.out.println(zoneId + ": " + formatOffset(getOffset(zoneId)));
        }
        */
    }

    private static int getOffset(String zoneId) {
        // Get the current time in the specified zone
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));

        // Get the zone offset
        ZoneOffset offset = now.getOffset();

        // Return the offset in seconds
        return offset.getTotalSeconds();
    }


    private static String formatOffset(int offsetInSeconds) {
        int hours = offsetInSeconds / 3600;
        int minutes = Math.abs((offsetInSeconds % 3600) / 60); // Use absolute value for minutes

        String sign = (offsetInSeconds >= 0) ? "+" : "-";
        return String.format("GMT%s%02d:%02d", sign, Math.abs(hours), minutes); // Use absolute value for hours too for consistent formatting.

    }
}
