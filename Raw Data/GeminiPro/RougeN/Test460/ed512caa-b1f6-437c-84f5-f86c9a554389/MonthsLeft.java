import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MonthsLeft {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the last day of the current year
        LocalDate endOfYear = LocalDate.of(currentDate.getYear(), Month.DECEMBER, 31);

        // Calculate the number of months remaining
        long monthsLeft = ChronoUnit.MONTHS.between(currentDate, endOfYear);
       
        //Alternatively, if you want the remainder of the current month plus the full months left:
        long monthsLeftIncludingCurrent = ChronoUnit.MONTHS.between(currentDate, endOfYear) + 
                 (currentDate.getDayOfMonth() > 1 ? 1 : 0); //add 1 if it's not already the first of the month.

        System.out.println("Months left in the year (excluding the current, unless it's the 1st): " + monthsLeft);
        System.out.println("Months left including the current month (or remainder thereof): " + monthsLeftIncludingCurrent);


    }
}
