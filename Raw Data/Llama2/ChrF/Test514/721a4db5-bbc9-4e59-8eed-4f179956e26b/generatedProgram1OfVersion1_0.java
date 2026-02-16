import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsetDemo {

    public static void main(String[] args) {
        // Get the current date and time in a specific time zone
        ZonedDateTime nowInKolkata = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Extract the zone offset
        ZoneOffset offset = nowInKolkata.getOffset();

        // Print the formatted offset using the helper method
        System.out.println("Zone offset for Kolkata: " + formatOffset(offset.getTotalSeconds()));


        // Demonstrate with a fixed offset
        ZoneOffset fixedOffset = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println("Fixed offset: " + formatOffset(fixedOffset.getTotalSeconds()));

        // Example with parsing a date string with offset
        String dateString = "2024-03-08T10:30:00+05:30";
        ZonedDateTime parsedDateTime = ZonedDateTime.parse(dateString, DateTimeFormatter.ISO_DATE_TIME);
        ZoneOffset parsedOffset = parsedDateTime.getOffset();
        System.out.println("Parsed offset: " + formatOffset(parsedOffset.getTotalSeconds()));


    }


    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60); // Use absolute value for minutes

        String sign = (hours >= 0) ? "+" : "-";
        return String.format("%s%02d:%02d", sign, Math.abs(hours), minutes); // Use absolute value for hours as well in formatting
    }
}
