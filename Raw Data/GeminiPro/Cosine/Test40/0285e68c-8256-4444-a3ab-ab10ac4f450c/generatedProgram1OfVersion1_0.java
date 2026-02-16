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
        System.out.println("Now: " + currentDateTime);


        // Test cases
        System.out.println(getCurrentDateTime("yyyy-MM-dd")); // Different date format
        System.out.println(getCurrentDateTime("HH:mm:ss")); // Time only
        System.out.println(getCurrentDateTime("yyyy/MMM/dd")); // Month abbreviation
        System.out.println(getCurrentDateTime("EEEE, MMMM dd, yyyy")); // Full day and month names

        try {
            System.out.println(getCurrentDateTime("invalid format")); // Invalid format (will throw an exception)
        } catch (Exception e) {
            System.out.println("Exception caught for invalid format: " + e.getMessage());
        }



    }
}
