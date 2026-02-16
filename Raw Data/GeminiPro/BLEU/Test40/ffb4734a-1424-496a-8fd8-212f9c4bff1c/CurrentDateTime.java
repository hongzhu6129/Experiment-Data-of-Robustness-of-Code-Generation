import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static String getCurrentDateTime(String format) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return now.format(formatter);
    }

    public static void main(String[] args) {
        String format = "yyyy/MM/dd HH:mm:ss.SSS"; // Example format
        String currentDateTime = getCurrentDateTime(format);
        System.out.println(currentDateTime);


        // Demonstrating different formats:
        System.out.println(getCurrentDateTime("yyyy-MM-dd'T'HH:mm:ss'Z'")); // ISO 8601
        System.out.println(getCurrentDateTime("EEEE, MMMM dd, yyyy HH:mm:ss a")); // Long format
        System.out.println(getCurrentDateTime("MM/dd/yy hh:mm a")); // Short format



    }
}
