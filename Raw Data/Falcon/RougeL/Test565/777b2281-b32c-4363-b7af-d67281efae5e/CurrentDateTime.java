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
        System.out.println(getCurrentDateTime("yyyy-MM-dd")); // Year-Month-Day
        System.out.println(getCurrentDateTime("HH:mm:ss")); // Hour-Minute-Second
        System.out.println(getCurrentDateTime("EEEE, MMMM dd, yyyy")); // DayOfWeek, Month Day, Year
        System.out.println(getCurrentDateTime("yyyy/MM/dd HH:mm:ss.nnnnnnnnn")); // Nanoseconds (up to 9 digits are supported)


        // Handling incorrect format strings (Exception Cases):
        try {
            System.out.println(getCurrentDateTime("yyyy/MM/dd HHmm:ss")); // Missing space between date and time
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println(getCurrentDateTime("yyyy/MM/tt HH:mm:ss")); // Invalid format specifier 'tt'
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }



    }
}
