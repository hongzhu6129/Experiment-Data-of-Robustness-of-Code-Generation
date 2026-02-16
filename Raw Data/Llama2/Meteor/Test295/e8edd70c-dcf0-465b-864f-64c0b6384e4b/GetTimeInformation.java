import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GetTimeInformation {

    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time for display
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Print the time information
        System.out.println("Current Time: " + formattedTime);
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
        System.out.println("Nanosecond: " + currentTime.getNano());


        // Example of getting information for a specific time:
        LocalTime specificTime = LocalTime.of(15, 30, 45); // 3:30:45 PM

        //Format
        String formattedSpecificTime = specificTime.format(formatter);

        System.out.println("\nSpecific Time: " + formattedSpecificTime);
        System.out.println("Hour: " + specificTime.getHour());
        System.out.println("Minute: " + specificTime.getMinute());
        System.out.println("Second: " + specificTime.getSecond());


    }
}
