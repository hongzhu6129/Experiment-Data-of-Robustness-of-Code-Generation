import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MonthsLeft {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate endOfYear = LocalDate.of(today.getYear(), Month.DECEMBER, 31);

        long monthsLeft = ChronoUnit.MONTHS.between(today, endOfYear);

        System.out.println("Months left in the year: " + monthsLeft);
    }
}
