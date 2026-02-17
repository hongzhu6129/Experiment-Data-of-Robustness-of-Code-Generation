import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time (optional, but recommended for readability)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Print the current date and time
        System.out.println("Current Date and Time: " + formattedDateTime);


        // Alternatively, if you just want the time part:
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");  // or "HH:mm:ss.SSS" for milliseconds
        String formattedTime = now.format(timeFormatter);
        System.out.println("Current Time: " + formattedTime);



    }
}
