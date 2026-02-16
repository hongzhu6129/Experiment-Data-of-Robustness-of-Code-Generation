import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class GetTimeInfo {

    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Print the current time in different formats
        System.out.println("Current Time: " + currentTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Formatted Time (12-hour): " + currentTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted Time (24-hour): " + currentTime.format(formatter));

        // Get specific components of the time
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);


        // Get the hour using ChronoField (alternative way)
        int hourUsingChronoField = currentTime.get(ChronoField.HOUR_OF_DAY);
        System.out.println("Hour (using ChronoField): " + hourUsingChronoField);


        // Example of creating a specific time
        LocalTime specificTime = LocalTime.of(15, 30, 10); // 3:30:10 PM
        System.out.println("Specific Time: " + specificTime);


        // Comparing times
        if (currentTime.isAfter(specificTime)) {
            System.out.println("Current time is after the specified time.");
        } else if (currentTime.isBefore(specificTime)) {
            System.out.println("Current time is before the specified time.");
        } else {
            System.out.println("Current time is the same as the specified time.");
        }

     }
}
