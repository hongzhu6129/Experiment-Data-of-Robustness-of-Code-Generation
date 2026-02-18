import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDepress {

    public static void main(String[] args) {
        // Get the current date and time in a specific time zone
        ZonedDateTime nowInKolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Extract the zone offset
        ZoneOffset offset = nowInKolkata.getOffset();

        // Format the offset using the custom method
        String formattedOffset = formatOffset(offset.getTotalSeconds());


        System.out.println("Current time in Kolkata: " + nowInKolkata.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        System.out.println("Zone offset: " + formattedOffset);


        // Demonstrate with a fixed offset  (example)
        ZoneOffset fixedOffset = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println("Fixed offset (e.g., +05:30): " + formatOffset(fixedOffset.getTotalSeconds()));

         // Demonstrate with another time zone
        ZonedDateTime nowInLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZoneOffset offsetLA = nowInLosAngeles.getOffset();
        System.out.println("Current time in Los Angeles: " + nowInLosAngeles.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        System.out.println("Zone offset for Los Angeles: " + formatOffset(offsetLA.getTotalSeconds()));
    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60); // Use absolute value for minutes

        String sign = (hours >= 0) ? "+" : "-";  // Correct sign handling
        return String.format("%s%02d:%02d", sign, Math.abs(hours), minutes); // Pad with leading zeros


    }
}
