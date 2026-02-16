import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {

    public static String getCurrentTime() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time (you can customize the format)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        return formattedDateTime;
    }

    public static void main(String[] args) {
        String currentTime = getCurrentTime();
        System.out.println("Current System Time: " + currentTime);
    }
}
