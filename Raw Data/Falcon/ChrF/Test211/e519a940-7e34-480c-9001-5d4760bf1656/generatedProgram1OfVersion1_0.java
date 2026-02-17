import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class MidnightDate {

    public static void main(String[] args) {
        // Get today's date.
        LocalDate today = LocalDate.now();

        // Get midnight time (00:00).
        LocalTime midnight = LocalTime.MIDNIGHT; 

        // Combine date and time to create LocalDateTime object at midnight.
        LocalDateTime todayMidnight = LocalDateTime.of(today, midnight);

        // Print the result.
        System.out.println("Today's date at midnight: " + todayMidnight);
    }
}
