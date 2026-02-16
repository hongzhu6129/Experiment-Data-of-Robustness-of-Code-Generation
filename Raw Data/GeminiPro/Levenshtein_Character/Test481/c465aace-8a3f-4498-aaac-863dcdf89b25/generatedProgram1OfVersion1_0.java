import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZoneOffsets {

    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String zoneIdString : zoneIds) {
            ZoneId zoneId = ZoneId.of(zoneIdString);
            ZonedDateTime now = ZonedDateTime.now(zoneId);
            ZoneOffset offset = now.getOffset();

            int offsetSeconds = offset.getTotalSeconds();
            String formattedOffset = formatOffset(offsetSeconds);

            System.out.println("Zone ID: " + zoneIdString + ", Offset: " + formattedOffset);
        }
    }


    private static String formatOffset(int offsetSeconds) {
        String sign = offsetSeconds >= 0 ? "+" : "-";
        int absoluteOffsetSeconds = Math.abs(offsetSeconds);
        int hours = absoluteOffsetSeconds / 3600;
        int minutes = (absoluteOffsetSeconds % 3600) / 60;
        int seconds = absoluteOffsetSeconds % 60;

        return String.format("%s%02d:%02d:%02d", sign, hours, minutes, seconds); // Format as +HH:mm:ss or -HH:mm:ss
    }
}
