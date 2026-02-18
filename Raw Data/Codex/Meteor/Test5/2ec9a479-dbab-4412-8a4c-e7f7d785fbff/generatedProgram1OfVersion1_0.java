import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentTimeInfo {

    public static void main(String[] args) {
        // Get the current time in the system's default time zone
        LocalTime now = LocalTime.now();

        // Print the current time in different formats
        System.out.println("Current Time (Default Format): " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time (HH:mm:ss): " + now.format(formatter));

        formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); // 12-hour format
        System.out.println("Current Time (hh:mm:ss a): " + now.format(formatter));

        // Get the current time in a specific time zone
        ZoneId zoneId = ZoneId.of("America/New_York");  // Example: New York
        LocalTime newYorkTime = LocalTime.now(zoneId);
        System.out.println("Current Time in New York: " + newYorkTime);

        // Calculate time difference 
        LocalTime time1 = LocalTime.of(10, 0, 0);  // 10:00:00
        LocalTime time2 = LocalTime.of(14, 30, 0); // 14:30:00
        long hoursDifference = ChronoUnit.HOURS.between(time1, time2);
        long minutesDifference = ChronoUnit.MINUTES.between(time1, time2);

        System.out.println("Difference between " + time1 + " and " + time2 + ": ");
        System.out.println("Hours: " + hoursDifference);
        System.out.println("Minutes: " + minutesDifference);


        // Convert LocalTime to java.util.Date (if needed for legacy code)
         Date currentDate = new Date();
         System.out.println("Current Date and Time: " + currentDate);

    }
}
