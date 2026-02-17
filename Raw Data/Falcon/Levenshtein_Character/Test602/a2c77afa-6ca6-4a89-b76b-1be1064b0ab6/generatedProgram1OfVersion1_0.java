import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneOffsetDemo {

    public static void main(String[] args) {
        // Define some ZoneIds
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId london = ZoneId.of("Europe/London");

        // Get current time in specified zones
        ZonedDateTime nowLosAngeles = ZonedDateTime.now(losAngeles);
        ZonedDateTime nowNewYork = ZonedDateTime.now(newYork);
        ZonedDateTime nowLondon = ZonedDateTime.now(london);

        // Extract and format zone offsets
        String losAngelesOffset = formatOffset(nowLosAngeles.getOffset().getTotalSeconds());
        String newYorkOffset = formatOffset(nowNewYork.getOffset().getTotalSeconds());
        String londonOffset = formatOffset(nowLondon.getOffset().getTotalSeconds());

        // Print the offsets
        System.out.println("Los Angeles: " + losAngelesOffset);
        System.out.println("New York: " + newYorkOffset);
        System.out.println("London: " + londonOffset);


        // Example using DateTimeFormatter to directly format with offset
        DateTimeFormatter formatterWithOffset = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        System.out.println("Los Angeles formatted: " + formatterWithOffset.format(nowLosAngeles));
        System.out.println("New York formatted: " + formatterWithOffset.format(nowNewYork));
        System.out.println("London formatted: " + formatterWithOffset.format(nowLondon));

    }

    private static String formatOffset(int offsetInSeconds) {
        int hours = offsetInSeconds / 3600;
        int minutes = Math.abs((offsetInSeconds % 3600) / 60); // Use absolute value for minutes

        String sign = (hours >= 0) ? "+" : "-";
        return String.format("GMT%s%02d:%02d", sign, Math.abs(hours), minutes); // Use absolute value for hours as well for formatting
    }
}
