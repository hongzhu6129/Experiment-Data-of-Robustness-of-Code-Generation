import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GetCurrentPreviousTime {

    public static void main(String[] args) {

        // Get the current time in the system's default time zone
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Time (System Default Zone): " + now);

        // Get the current time in a specific time zone (e.g., UTC)
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current Time (UTC): " + utcNow);

        // Calculate and print the previous time (e.g., 5 minutes ago)
        LocalDateTime fiveMinutesAgo = now.minus(5, ChronoUnit.MINUTES);
        System.out.println("Time 5 Minutes Ago: " + fiveMinutesAgo);

         // Another example: 1 hour ago in a specified time zone
        ZonedDateTime oneHourAgoUTC = utcNow.minus(1, ChronoUnit.HOURS);
        System.out.println("Time 1 Hour Ago (UTC): " + oneHourAgoUTC);


        // You can get components of the time individually if needed:
        int year = now.getYear();
        int month = now.getMonthValue(); // 1-12
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("Year: " + year);  // Example demonstrating access to individual parts
        // ...Similarly for other components

    }
}
