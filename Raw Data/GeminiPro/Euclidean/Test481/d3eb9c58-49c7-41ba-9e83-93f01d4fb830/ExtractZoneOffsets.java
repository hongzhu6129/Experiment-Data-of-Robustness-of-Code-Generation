import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ExtractZoneOffsets {

    public static void main(String[] args) {
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneIdString : allZoneIds) {
            ZoneId zoneId = ZoneId.of(zoneIdString);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            ZoneOffset zoneOffset = zonedDateTime.getOffset();

            int offsetSeconds = zoneOffset.getTotalSeconds();
            String formattedOffset = formatOffset(offsetSeconds);

            System.out.println("Zone ID: " + zoneIdString + ", Offset: " + formattedOffset);
        }
    }

    private static String formatOffset(int offsetSeconds) {
        String sign = offsetSeconds >= 0 ? "+" : "-";
        int absOffsetSeconds = Math.abs(offsetSeconds);
        int hours = absOffsetSeconds / 3600;
        int minutes = (absOffsetSeconds % 3600) / 60;
        int seconds = absOffsetSeconds % 60;

        return String.format("%s%02d:%02d:%02d", sign, hours, minutes, seconds); // Format as +HH:mm:ss or -HH:mm:ss
    }
}
