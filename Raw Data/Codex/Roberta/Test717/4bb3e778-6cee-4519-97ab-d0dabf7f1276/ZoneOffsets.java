import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Get the current date and time in a specific time zone
        ZonedDateTime nowLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in Los Angeles: " + nowLosAngeles.format(DateTimeFormatter.ISO_DATE_TIME));

        // Extract the zone offset
        ZoneOffset offsetLA = nowLosAngeles.getOffset();
        System.out.println("Zone offset for Los Angeles: " + formatOffset(offsetLA.getTotalSeconds()));


        ZonedDateTime nowNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + nowNewYork.format(DateTimeFormatter.ISO_DATE_TIME));
        ZoneOffset offsetNY = nowNewYork.getOffset();
        System.out.println("Zone offset for New York: " + formatOffset(offsetNY.getTotalSeconds()));



        // Example with a fixed offset
        ZoneOffset fixedOffset = ZoneOffset.ofHoursMinutes(5, 30); // +5:30
        System.out.println("Fixed offset: " + formatOffset(fixedOffset.getTotalSeconds()));

        // Using ZoneId instead of ZoneOffset
        ZoneId zoneIdKolkata = ZoneId.of("Asia/Kolkata");
        ZonedDateTime nowKolkata = ZonedDateTime.now(zoneIdKolkata);
        System.out.println("Current time in Kolkata: " + nowKolkata.format(DateTimeFormatter.ISO_DATE_TIME));
        ZoneOffset offsetKolkata = nowKolkata.getOffset(); //Get offset from ZoneId
        System.out.println("Zone Offset for Kolkata: " + formatOffset(offsetKolkata.getTotalSeconds()));

    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60); // Use absolute value for minutes
        String sign = (hours >= 0) ? "+" : "-";
        return String.format("UTC%s%02d:%02d", sign, Math.abs(hours), minutes); // Use absolute value for formatting
    }
}
