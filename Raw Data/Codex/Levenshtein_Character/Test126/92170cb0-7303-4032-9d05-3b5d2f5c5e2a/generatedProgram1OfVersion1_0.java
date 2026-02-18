import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MonthsLeftInYear {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the year from the current date
        int currentYear = currentDate.getYear();

        // Create a LocalDate object for the end of the current year
        LocalDate endOfYear = LocalDate.of(currentYear, Month.DECEMBER, 31);

        // Calculate the number of months between the current date and the end of the year
        long monthsLeft = ChronoUnit.MONTHS.between(currentDate, endOfYear.plusDays(1)); // Add 1 day to include the last month

        System.out.println("Number of months left in the year: " + monthsLeft); 
    }
}
