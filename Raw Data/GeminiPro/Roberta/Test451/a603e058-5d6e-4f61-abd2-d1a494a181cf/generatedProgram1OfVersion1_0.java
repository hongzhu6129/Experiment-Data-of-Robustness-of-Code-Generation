import java.time.LocalDateTime;
import java.time.ZoneId;

public class GetLocalTime {

    public static void main(String[] args) {
        // Get the current date and time in the system's default time zone
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time (System Default): " + now);

        // Get the current date and time in a specific time zone (e.g., "America/New_York")
        ZoneId zoneId = ZoneId.of("America/New_York"); // Replace with your desired zone
        LocalDateTime newYorkTime = LocalDateTime.now(zoneId);
        System.out.println("Current Date and Time (New York): " + newYorkTime);


        // Get the current date and time in the local time zone (more explicit)
        //  This is typically equivalent to LocalDateTime.now() if your system's default
        //  time zone is correctly set.
        ZoneId localZoneId = ZoneId.systemDefault();
        LocalDateTime localTime = LocalDateTime.now(localZoneId);
        System.out.println("Current Date and Time (Local): " + localTime);




    }
}
