import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MonthsLeftInYear {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the last day of the current year
        LocalDate endOfYear = LocalDate.of(currentDate.getYear(), Month.DECEMBER, 31);

        // Calculate the number of months remaining
        long monthsLeft = ChronoUnit.MONTHS.between(currentDate, endOfYear) + 1; // Add 1 to include the current month

        System.out.println("Number of months left in the year: " + monthsLeft);
    }
}
