import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.OffsetDateTime;

public class ZoneOffsetManipulation {

    public static void main(String[] args) {
        // Example 1:  Get and format current zone offset
        ZonedDateTime now = ZonedDateTime.now();
        int offsetSeconds = now.getOffset().getTotalSeconds();
        String formattedOffset = formatOffset(offsetSeconds);
        System.out.println("Current Zone Offset: " + formattedOffset);


        // Example 2: Create a ZonedDateTime with a specific offset
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(5, 30); // Example: +05:30
        ZonedDateTime zonedDateTimeWithOffset = ZonedDateTime.now(offset);
        String formattedOffset2 = formatOffset(zonedDateTimeWithOffset.getOffset().getTotalSeconds());
        System.out.println("Specific Zone Offset: " + formattedOffset2);

        // Example 3:  Extract offset from an OffsetDateTime
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String formattedOffset3 = formatOffset(offsetDateTime.getOffset().getTotalSeconds());
        System.out.println("Offset from OffsetDateTime: " + formattedOffset3);



    }

    private static String formatOffset(int offsetSeconds) {
        String sign = offsetSeconds >= 0 ? "+" : "-";
        int absOffsetSeconds = Math.abs(offsetSeconds);
        int hours = absOffsetSeconds / 3600;
        int minutes = (absOffsetSeconds % 3600) / 60;

        return String.format("%s%02d:%02d", sign, hours, minutes); // Format as +HH:MM or -HH:MM
    }
}
