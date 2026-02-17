import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {

    public static void main(String[] args) {
        displayCurrentSystemTime();
    }

    public static void displayCurrentSystemTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current System Time: " + formattedDateTime);
    }
}



