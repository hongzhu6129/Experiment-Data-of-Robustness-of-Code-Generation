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


        // Demonstrating different formats
        System.out.println(getCurrentDateTime("yyyy-MM-dd")); // Output: YYYY-MM-DD
        System.out.println(getCurrentDateTime("HH:mm:ss")); // Output: HH:MM:SS
        System.out.println(getCurrentDateTime("EEEE, MMMM dd, yyyy")); // Output: DayOfWeek, Month DD, YYYY
        System.out.println(getCurrentDateTime("MM/dd/yy")); // Output: MM/DD/YY  (Two-digit year)

    }
}
