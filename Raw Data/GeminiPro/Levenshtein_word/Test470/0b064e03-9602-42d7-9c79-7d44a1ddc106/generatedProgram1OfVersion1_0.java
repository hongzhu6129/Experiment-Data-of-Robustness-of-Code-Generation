import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextAndPreviousFriday {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Get the next Friday
        LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("Next Friday: " + nextFriday);


        // Get the previous Friday
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Previous Friday: " + previousFriday);

    }
}
