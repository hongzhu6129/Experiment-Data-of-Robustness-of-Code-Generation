import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentLocalTime {

    public static void main(String[] args) {
        // Get the current local time
        LocalTime currentTime = LocalTime.now();

        // Format the time (optional, but often useful for display)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Example: 24-hour format
        String formattedTime = currentTime.format(formatter);

        // Print the current time
        System.out.println("Current Local Time: " + formattedTime); 
    }
}
