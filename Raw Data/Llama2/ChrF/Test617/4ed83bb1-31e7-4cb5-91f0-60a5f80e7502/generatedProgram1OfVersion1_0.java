import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextPreviousFriday {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate nextFriday = today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));

        System.out.println("Today: " + today);
        System.out.println("Next Friday: " + nextFriday);
        System.out.println("Previous Friday: " + previousFriday);
    }
}
