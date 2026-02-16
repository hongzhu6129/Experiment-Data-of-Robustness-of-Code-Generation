import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Define some ZoneIds
        ZoneId zoneIdLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId zoneIdLondon = ZoneId.of("Europe/London");

        // Get current time in those zones
        ZonedDateTime nowLosAngeles = ZonedDateTime.now(zoneIdLosAngeles);
        ZonedDateTime nowLondon = ZonedDateTime.now(zoneIdLondon);

        // Extract and format the offsets
        String losAngelesOffset = formatOffset(nowLosAngeles.getOffset().getTotalSeconds());
        String londonOffset = formatOffset(nowLondon.getOffset().getTotalSeconds());


        System.out.println("Los Angeles: " + nowLosAngeles.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME) +  " (Offset: " + losAngelesOffset + ")");
        System.out.println("London: " + nowLondon.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME) + " (Offset: " + londonOffset + ")");


        // Example with a fixed offset
        ZoneOffset fixedOffset = ZoneOffset.ofHoursMinutes(5, 30);  // +5:30
        System.out.println("Fixed Offset: " + formatOffset(fixedOffset.getTotalSeconds()));

    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60);  // Use absolute value for minutes

        String sign = (hours >= 0) ? "+" : "-";
        return String.format("%s%02d:%02d", sign, Math.abs(hours), minutes); // Pad with zeros for consistent formatting
    }
}
