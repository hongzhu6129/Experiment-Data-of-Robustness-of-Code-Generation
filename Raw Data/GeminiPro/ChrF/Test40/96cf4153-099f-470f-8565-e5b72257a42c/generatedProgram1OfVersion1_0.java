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
        System.out.println("Current Date and Time: " + currentDateTime);


        // Test cases (demonstrated in main for simplicity, ideally would be separate test methods)
        System.out.println(getCurrentDateTime("yyyy-MM-dd")); // Different date format
        System.out.println(getCurrentDateTime("HH:mm:ss")); // Time only
        System.out.println(getCurrentDateTime("EEEE, MMMM dd, yyyy")); // Day of week, month name
        System.out.println(getCurrentDateTime("yyyy/MM/dd'T'HH:mm:ss.SSSZ")); // ISO 8601 format with timezone


        // Corner cases (handling potential exceptions)
        try {
            System.out.println(getCurrentDateTime("yy/M/d")); // Minimal date format
            System.out.println(getCurrentDateTime("yyyy/MMMM/dd HH:mm:ss.SSSSSS")); // More milliseconds than supported (should truncate)


            //Invalid format - expect exception
            System.out.println(getCurrentDateTime("yyyy/MMM/dd/HH")); // Invalid format, expect exception 
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());  // Handle exceptions gracefully
        }

         //Edge case: Year 1 (or any other valid year)
        LocalDateTime specificDateTime = LocalDateTime.of(1, 1, 1, 0, 0, 0, 0);
        DateTimeFormatter formatterEdge = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println("Edge Case (Year 1): " + formatterEdge.format(specificDateTime));





    }
}
