import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsetExample {

    public static void main(String[] args) {
        // Example 1: Get the current zone offset
        ZonedDateTime now = ZonedDateTime.now();
        ZoneOffset currentOffset = now.getOffset();
        System.out.println("Current Zone Offset: " + formatOffset(currentOffset.getTotalSeconds()));


        // Example 2: Create a ZonedDateTime with a specific offset
        ZoneOffset offset = ZoneOffset.of("+05:30"); // Example: India
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC")).withZoneSameInstant(ZoneId.ofOffset("UTC", offset));
        System.out.println("ZonedDateTime with specific offset: " + zonedDateTime);
        System.out.println("Offset: " + formatOffset(zonedDateTime.getOffset().getTotalSeconds()));

        // Example 3: Extract the zone offset from a ZonedDateTime string
        String dateTimeString = "2024-07-22T10:30:00+02:00";
        ZonedDateTime parsedDateTime = ZonedDateTime.parse(dateTimeString);
        ZoneOffset parsedOffset = parsedDateTime.getOffset();
        System.out.println("Parsed ZonedDateTime: " + parsedDateTime);
        System.out.println("Parsed Offset: " + formatOffset(parsedOffset.getTotalSeconds()));


        // Example 4: Alter the zone offset � Add 2 Hours
        ZonedDateTime plusTwoHours = now.plusHours(2);
        System.out.println("Plus Two hours: " + plusTwoHours + " , Offset: " + formatOffset(plusTwoHours.getOffset().getTotalSeconds()));



    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60); // Use absolute value for minutes
        return String.format("%+03d:%02d", hours, minutes); // Format with leading plus/minus, padding, and colon
    }
}
