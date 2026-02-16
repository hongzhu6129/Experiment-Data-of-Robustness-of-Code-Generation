import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {

    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"); // Customize format as needed
        return now.format(formatter);
    }

    public static void main(String[] args) {
        String currentTime = getCurrentTime();
        System.out.println("Current System Time: " + currentTime);
    }
}
