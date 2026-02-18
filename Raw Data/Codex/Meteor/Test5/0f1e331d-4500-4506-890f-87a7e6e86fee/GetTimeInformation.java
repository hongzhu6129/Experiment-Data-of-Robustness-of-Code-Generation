import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTimeInformation {

    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Print the current time in different formats
        System.out.println("Current Time: " + currentTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Current Time (12-hour format): " + currentTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time (24-hour format): " + currentTime.format(formatter));


        // Get specific components of the time
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();


        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);


        // Example of checking if the time is before or after a specific time
        LocalTime specificTime = LocalTime.of(12, 30); // 12:30 PM

        if (currentTime.isBefore(specificTime)) {
            System.out.println("Current time is before 12:30 PM");
        } else if (currentTime.isAfter(specificTime)) {
            System.out.println("Current time is after 12:30 PM");
        } else {
            System.out.println("Current time is 12:30 PM");
        }

       // Example of adding or subtracting time
        LocalTime futureTime = currentTime.plusHours(2).plusMinutes(15); // Add 2 hours and 15 minutes
        System.out.println("Time after 2 hours and 15 minutes: " + futureTime);


    }
}
