import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTimeInformation {

    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Print the current time in different formats
        System.out.println("Current Time: " + currentTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted Time (HH:mm:ss): " + currentTime.format(formatter));

        formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); // 12-hour format
        System.out.println("Formatted Time (hh:mm:ss a): " + currentTime.format(formatter));


        // Get specific components of the time
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);


        // Example of working with a specific time (not the current time)
        LocalTime specificTime = LocalTime.of(15, 30, 10); // 3:30:10 PM
        System.out.println("Specific Time: " + specificTime);



        // You can perform calculations with LocalTime as well (e.g., adding or subtracting time)
        LocalTime laterTime = specificTime.plusHours(2); // Add 2 hours
        System.out.println("Specific Time + 2 hours: " + laterTime);



    }
}
