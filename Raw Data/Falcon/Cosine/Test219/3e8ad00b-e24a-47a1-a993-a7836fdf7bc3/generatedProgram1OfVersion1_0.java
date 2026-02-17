import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Display current date
        LocalDate currentDate = now.toLocalDate();
        System.out.println("Current Date: " + currentDate);

        // Display current time without date
        LocalTime currentTime = now.toLocalTime();
        System.out.println("Current Time: " + currentTime);


         // Alternatively, using formatters for more control over output:
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Current Date (formatted): " + now.format(dateFormatter));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // 24-hour format
        System.out.println("Current Time (formatted): " + now.format(timeFormatter));



    }
}
