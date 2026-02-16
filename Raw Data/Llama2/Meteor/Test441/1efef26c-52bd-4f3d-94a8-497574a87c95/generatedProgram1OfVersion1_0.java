import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormats {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // yyyy-mm-dd
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss"))); // HH for 24-hour format

        // yyyy-mm-dd hh:mm:ss
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // e mmm yyyy hh:mm:ss.sssz  (e is day-of-week, mmm is abbreviated month)
        System.out.println(now.format(DateTimeFormatter.ofPattern("e MMM yyyy HH:mm:ss.SSSZ")));

        // hh:mm:ss, z (z for time zone abbreviation)
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss, z")));


        // Demonstrating how to handle specific time zones if needed:
        ZoneId zoneId = ZoneId.of("America/New_York");  // Example: New York time zone
        LocalDateTime nowInNewYork = LocalDateTime.now(zoneId);

        System.out.println("New York Time: " + nowInNewYork.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss, z")));
         // Example with sssz (milliseconds and time zone abbreviation)
        System.out.println("Example with SSSZ: " + nowInNewYork.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSZ")));


    }
}
