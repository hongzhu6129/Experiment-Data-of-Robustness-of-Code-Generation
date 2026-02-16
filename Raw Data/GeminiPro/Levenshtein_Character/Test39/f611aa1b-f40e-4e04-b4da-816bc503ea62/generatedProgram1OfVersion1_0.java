import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {

    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy"); // Format as requested
        return now.format(formatter);
    }

    public static void main(String[] args) {
        String currentDateTime = getCurrentDateTime();
        System.out.println("Current Date time: " + currentDateTime);
    }
}
