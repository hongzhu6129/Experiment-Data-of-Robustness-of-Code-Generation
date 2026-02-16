import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static String getCurrentDateTime(String format) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return now.format(formatter);
    }

    public static void main(String[] args) {
        // Example usage:
        String format = "yyyy/MM/dd HH:mm:ss.SSS";
        String currentDateTime = getCurrentDateTime(format);
        System.out.println("Current Date and Time: " + currentDateTime);


        // Test cases
        test("yyyy/MM/dd HH:mm:ss.SSS"); // Example format
        test("yyyy-MM-dd"); // Date only
        test("HH:mm:ss"); // Time only
        test("yyyyMMddHHmmssSSS"); // No separators
        test("EEEE, MMMM dd, yyyy HH:mm:ss a");  // Full date and time with day of the week and AM/PM
        test("yy/M/d H:m:s"); // Shortened version
        test("yyyy/MMM/dd"); // Abbreviated month
       try {
           test("invalid format"); // Invalid format (should throw an exception)
       } catch (Exception e) {
           System.out.println("Invalid format test passed (exception caught).");
       }



    }

    public static void test(String format) {
        try {
             String dateTime = getCurrentDateTime(format);
             System.out.println("Format: \"" + format + "\"  Result: " + dateTime);

        } catch(IllegalArgumentException e) { // DateTimeParseException extends IllegalArgumentException
            System.out.println("Format: \"" + format + "\"  Result: Invalid format");
            throw e; // Re-throw for main method to handle (in our case, to print "Invalid format test passed")

        }
    }
}
