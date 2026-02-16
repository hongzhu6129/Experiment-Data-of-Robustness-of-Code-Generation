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


        // Test cases (in main or preferably in a separate test class using a testing framework like JUnit)
        test("yyyy/MM/dd HH:mm:ss.SSS"); // Example format
        test("MM-dd-yyyy HH:mm"); // Different format
        test("yyyyMMdd"); // Date only
        test("HH:mm:ss"); // Time only
        test("yyyy/MMM/dd"); // Month abbreviation
        test("E, MMM dd yyyy HH:mm:ss"); // Day of the week

        // Corner/edge cases: Invalid format strings
        try {
            test("yyyy/MM/ddd HH:mm:ss.SSS"); // Invalid 'ddd'
        } catch (Exception e) {
            System.out.println("Invalid format string resulted in exception: " + e.getMessage());
        }

        try {
             test(null);  // Null format string
        } catch (Exception e) {
            System.out.println("Null format string resulted in exception: " + e.getMessage());
        }


        try {
             test(""); // Empty format string
        } catch (Exception e) {
            System.out.println("Empty format string resulted in exception: " + e.getMessage());
        }

    }

    public static void test(String format) {
        try {
            System.out.println(format + ": " + getCurrentDateTime(format));
        } catch (Exception e) { // Handle potential exceptions due to invalid format strings
            System.out.println("Error with format " + format + ": " + e.getMessage());
            throw e; // Rethrow in test context for visibility/proper test failure
        }
    }

}
