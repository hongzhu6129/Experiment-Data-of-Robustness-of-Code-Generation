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


        // Example with a different format
        String format2 = "EEEE, MMMM dd, yyyy hh:mm:ss a";
        System.out.println(getCurrentDateTime(format2));


        // Example with just the date
        String format3 = "yyyy-MM-dd";
        System.out.println(getCurrentDateTime(format3));


    }
}
