import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current Date and Time: " + formattedDateTime);


        // Alternative, shorter formatting for just date and time:
        System.out.println("Current Date and Time (shorter format): " + now); 

        // If you only want the date:
        System.out.println("Current Date: " + now.toLocalDate());

        // If you only want the time:
        System.out.println("Current Time: " + now.toLocalTime());


    }
}
