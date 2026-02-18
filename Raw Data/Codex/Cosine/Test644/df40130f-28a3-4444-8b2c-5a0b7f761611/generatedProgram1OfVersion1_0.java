import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class GetTimeInformation {

    public static void main(String[] args) {
        // Get the current time in the system's default time zone
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Print the current time in different formats
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);


        // Formatting the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); // Example format
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted Time (12-hour format): " + formattedTime);

        formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // 24-hour format
        formattedTime = currentTime.format(formatter);
        System.out.println("Formatted Time (24-hour format): " + formattedTime);



        // Getting specific components of the time
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);


        // Working with Time Zones (Important for accurate global time)
        // Get the current time in a specific time zone
        ZoneId zoneId = ZoneId.of("America/New_York"); // Example: New York time
        LocalTime newYorkTime = LocalTime.now(zoneId);
        System.out.println("Current Time in New York: " + newYorkTime);

        // You can list all available time zones:
        // ZoneId.availableZoneIds().forEach(System.out::println);



        // Example of parsing a time string:
        String timeString = "15:30:45"; // 24-hour format
        LocalTime parsedTime = LocalTime.parse(timeString);
        System.out.println("Parsed Time: " + parsedTime);


        // Calculating time differences (using Duration class � see documentation)
        // ... (Add examples of time difference calculations if needed)


    }
}
