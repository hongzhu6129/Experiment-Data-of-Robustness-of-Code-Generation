import java.time.LocalDate;
import java.time.Period;

public class DateComparison {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Calculate date 1 year ago
        LocalDate dateBeforeOneYear = currentDate.minus(Period.ofYears(1));

        // Calculate date 1 year from now
        LocalDate dateAfterOneYear = currentDate.plus(Period.ofYears(1));


        System.out.println("Current Date: " + currentDate);
        System.out.println("Date 1 year ago: " + dateBeforeOneYear);
        System.out.println("Date 1 year from now: " + dateAfterOneYear);


        // Comparisons
        System.out.println("\nComparisons:");

        if (dateBeforeOneYear.isBefore(currentDate)) {
            System.out.println(dateBeforeOneYear + " is before " + currentDate);
        }

        if (dateAfterOneYear.isAfter(currentDate)) {
            System.out.println(dateAfterOneYear + " is after " + currentDate);
        }

    }
}
