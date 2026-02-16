import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Get available zone IDs
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Print zone offsets for some example zones
        printZoneOffset("Asia/Kolkata");
        printZoneOffset("America/New_York");
        printZoneOffset("Europe/London");
        printZoneOffset("UTC");


        // Iterate through all available zones (optional) - comment out if not needed.
         for (String zoneId : zoneIds) {
             printZoneOffset(zoneId);
         }
    }



    private static void printZoneOffset(String zoneIdString) {
        try {
            ZoneId zoneId = ZoneId.of(zoneIdString);
            ZonedDateTime now = ZonedDateTime.now(zoneId);
            ZoneOffset offset = now.getOffset();

            System.out.println("Zone: " + zoneIdString + ", Offset: " + formatOffset(offset.getTotalSeconds()));

        } catch (Exception e) {
            System.err.println("Error processing zone: " + zoneIdString + " - " + e.getMessage());
        }
    }



    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60);  // Use Math.abs to ensure positive minutes

        String offsetString = String.format("%+03d:%02d", hours, minutes); // Format with + sign and leading zeros.

        return  offsetString;
    }
}
