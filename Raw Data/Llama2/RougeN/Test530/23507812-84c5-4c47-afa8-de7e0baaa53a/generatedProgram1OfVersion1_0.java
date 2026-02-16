import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TodaysDateAtMidnight {

    public static void main(String[] args) {
        // Get today's date.
        LocalDate today = LocalDate.now();

        // Create a LocalTime object representing midnight (00:00).
        LocalTime midnight = LocalTime.MIDNIGHT;  // or LocalTime.of(0, 0);

        // Combine the date and time to create a LocalDateTime object.
        LocalDateTime todayAtMidnight = LocalDateTime.of(today, midnight);

        // Print the result.
        System.out.println("Today's date at midnight: " + todayAtMidnight);


        //Alternative, slightly more concise approach using atStartOfDay()
        LocalDateTime alternativeMidnight = LocalDate.now().atStartOfDay();
        System.out.println("Today's date at midnight (alternative): " + alternativeMidnight);


    }
}
