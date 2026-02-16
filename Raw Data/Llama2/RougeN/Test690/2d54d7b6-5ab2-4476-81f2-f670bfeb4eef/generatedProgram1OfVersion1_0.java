import java.time.LocalTime;
import java.time.ZoneId;

public class GetLocalTime {

    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Local Time: " + currentTime);

        // Get the local time in a specific time zone (optional)
        ZoneId zoneId = ZoneId.of("America/New_York"); // Example: New York
        LocalTime newYorkTime = LocalTime.now(zoneId);
        System.out.println("New York Time: " + newYorkTime);


        //Demonstrating getting the change in time (difference) - needs a reference point.
        //For example, calculating the time elapsed since a specific starting time:
        LocalTime startTime = LocalTime.of(9, 0); // Example: 9:00 AM

        // Calculate the duration between start and current time
        java.time.Duration duration = java.time.Duration.between(startTime, currentTime);

        System.out.println("Time elapsed since 9:00 AM: " + duration);
        System.out.println("Time elapsed in minutes: " + duration.toMinutes());

    }
}
