import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsets {

    public static void main(String[] args) {
        // Define some ZoneIds
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId london = ZoneId.of("Europe/London");

        // Get current time in specified zones
        ZonedDateTime nowLosAngeles = ZonedDateTime.now(losAngeles);
        ZonedDateTime nowNewYork = ZonedDateTime.now(newYork);
        ZonedDateTime nowLondon = ZonedDateTime.now(london);


        // Extract and print the offsets using the formatOffset method
        System.out.println("Los Angeles: " + formatOffset(nowLosAngeles.getOffset().getTotalSeconds()));
        System.out.println("New York: " + formatOffset(nowNewYork.getOffset().getTotalSeconds()));
        System.out.println("London: " + formatOffset(nowLondon.getOffset().getTotalSeconds()));



        //Demonstrating with a specific date and time (optional):
        ZonedDateTime specificTime = ZonedDateTime.of(2024, 10, 27, 10, 30, 0, 0, london); // Example date/time
        System.out.println("London (Specific Time): " + formatOffset(specificTime.getOffset().getTotalSeconds()));


    }

    private static String formatOffset(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = Math.abs((totalSeconds % 3600) / 60); // Use absolute value for minutes

        String sign = (hours >= 0) ? "+" : "-";
        return String.format("GMT%s%02d:%02d", sign, Math.abs(hours), minutes); // Pad with zeros for consistent format
    }
}
