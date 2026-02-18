import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeFormat {

    public static String formatDateTime(String dateTimeString, String format) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));
            return dateTime.format(DateTimeFormatter.ofPattern(format));
        } catch (DateTimeParseException e) {
            return "Invalid DateTime Format"; // Handle parsing errors gracefully
        }
    }

    public static void main(String[] args) {
        String now = "2017/06/16 08:52:03.066";

        // Example formats
        String format1 = "yyyy-MM-dd HH:mm:ss";  // Example 1
        String format2 = "MM/dd/yy hh:mm a";    // Example 2 (12-hour format with AM/PM)
        String format3 = "EEEE, MMMM dd, yyyy"; // Example 3 (Day of week, Month name, etc.)
        String format4 = "yyyyMMddHHmmss";       // Example 4 (Compact format)


        System.out.println(formatDateTime(now, format1)); // Output: 2017-06-16 08:52:03
        System.out.println(formatDateTime(now, format2)); // Output: 06/16/17 08:52 AM
        System.out.println(formatDateTime(now, format3)); // Output: Friday, June 16, 2017
        System.out.println(formatDateTime(now, format4)); // Output: 20170616085203

        // Test Cases (including corner cases)

        // Valid inputs
        test("2024/02/29 12:00:00.000", "yyyy-MM-dd", "2024-02-29"); // Leap year
        test("2023/12/31 23:59:59.999", "HH:mm:ss.SSS", "23:59:59.999"); // End of year
        test("1900/01/01 00:00:00.000", "yyyy/MM/dd", "1900/01/01");  // Start of century

        // Invalid Inputs
        test("2023/13/01 00:00:00.000", "yyyy-MM-dd", "Invalid DateTime Format"); // Invalid month
        test("2023/04/31 00:00:00.000", "yyyy-MM-dd", "Invalid DateTime Format"); // Invalid day
        test("2023/04/15 24:00:00.000", "yyyy-MM-dd", "Invalid DateTime Format"); // Invalid hour
        test("invalid date", "yyyy-MM-dd", "Invalid DateTime Format");            // Completely invalid string
        test("2023/04/15 00:00:00.000", "yyyy/MM/dd/KK", "Invalid DateTime Format"); // Invalid output format (extra 'K')

        test(null, "yyyy-MM-dd", "Invalid DateTime Format"); // Null input


    }


    // Helper function for testing
    public static void test(String input, String format, String expected) {
        String result = formatDateTime(input, format);
        if (result.equals(expected)) {
            System.out.println("Test Passed: " + input + " -> " + result);
        } else {
            System.err.println("Test Failed: " + input + " -> " + result + ", Expected: " + expected);
        }
    }
}




