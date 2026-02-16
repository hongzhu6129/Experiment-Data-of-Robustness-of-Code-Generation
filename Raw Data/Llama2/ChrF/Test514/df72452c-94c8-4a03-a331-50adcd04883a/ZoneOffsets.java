import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Get all available zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Iterate through zone IDs and print their offsets
        for (String zoneId : zoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime now = ZonedDateTime.now(zone);
            ZoneOffset offset = now.getOffset();
            System.out.println("Zone: " + zoneId + ", Offset: " + formatOffset(offset.getTotalSeconds()));
        }



        // Examples for specific zones
        System.out.println("New York: " + formatOffset(ZoneId.of("America/New_York").getRules().getOffset(ZonedDateTime.now().toInstant()).getTotalSeconds()));
        System.out.println("London: " + formatOffset(ZoneId.of("Europe/London").getRules().getOffset(ZonedDateTime.now().toInstant()).getTotalSeconds()));
        System.out.println("Tokyo: " + formatOffset(ZoneId.of("Asia/Tokyo").getRules().getOffset(ZonedDateTime.now().toInstant()).getTotalSeconds()));

    }


    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60);
        String sign = (totalSeconds >= 0) ? "+" : "-";
        return String.format("%s%02d:%02d", sign, Math.abs(hours), minutes);

    }
}
