import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastDayOfPreviousMonth {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfPreviousMonth = today.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of the previous month: " + lastDayOfPreviousMonth);
    }
}
