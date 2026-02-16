import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Previous time (without date, only time) - assuming previous means one second ago
        LocalDateTime previous = now.minusSeconds(1); 
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String previousTime = previous.format(timeFormatter);

        // Current time (without date, only time)
        String currentTime = now.format(timeFormatter);

        System.out.println("Previous Time (without date): " + previousTime);
        System.out.println("Current Time (without date): " + currentTime);

    }
}
