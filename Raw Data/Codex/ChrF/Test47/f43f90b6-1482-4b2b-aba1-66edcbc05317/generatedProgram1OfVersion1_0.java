import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class PreviousAndNextFriday {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Get the previous Friday
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        // Get the next Friday
        LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println("Previous Friday: " + previousFriday);
        System.out.println("Next Friday: " + nextFriday);


    }
}
