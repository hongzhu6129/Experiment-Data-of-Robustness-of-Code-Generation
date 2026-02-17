import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Get the current date and time in UTC
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneOffset.UTC);

        // Define some example zone IDs
        String[] zoneIds = {
                "America/New_York",
                "Europe/London",
                "Asia/Tokyo",
                "Australia/Sydney"
        };

        // Print the offsets for each zone
        for (String zoneId : zoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZoneOffset offset = utcDateTime.withZoneSameInstant(zone).getOffset();

            System.out.println(zoneId + ": " + formatOffset(offset.getTotalSeconds()));

        }


    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60);  // Ensure minutes are positive

        String sign = (hours >= 0) ? "+" : "-";
        return String.format("UTC%s%02d:%02d", sign, Math.abs(hours), minutes); // Format as UTC+HH:MM or UTC-HH:MM
    }
}
