import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MonthsLeftInYear {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate endOfYear = LocalDate.of(currentDate.getYear(), Month.DECEMBER, 31);

        long monthsLeft = ChronoUnit.MONTHS.between(currentDate, endOfYear);

        System.out.println("Number of months left in the year: " + monthsLeft);
    }
}
