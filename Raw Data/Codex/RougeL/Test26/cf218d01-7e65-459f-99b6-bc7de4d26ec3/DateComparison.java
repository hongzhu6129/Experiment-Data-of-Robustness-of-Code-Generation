import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateComparison {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        LocalDate dateBeforeOneYear = currentDate.minusYears(1);
        LocalDate dateAfterOneYear = currentDate.plusYears(1);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Date Before One Year: " + dateBeforeOneYear);
        System.out.println("Date After One Year: " + dateAfterOneYear);


        // Comparisons
        System.out.println("\nComparisons:");

        // isBefore() and isAfter()
        System.out.println("Is dateBeforeOneYear before currentDate? " + dateBeforeOneYear.isBefore(currentDate));
        System.out.println("Is dateAfterOneYear after currentDate? " + dateAfterOneYear.isAfter(currentDate));

        // isEqual()
        System.out.println("Is dateBeforeOneYear equal to currentDate? " + dateBeforeOneYear.isEqual(currentDate));


        // Calculate difference in days
        long daysBefore = ChronoUnit.DAYS.between(dateBeforeOneYear, currentDate);
        long daysAfter = ChronoUnit.DAYS.between(currentDate, dateAfterOneYear);

        System.out.println("Days between dateBeforeOneYear and currentDate: " + daysBefore);
        System.out.println("Days between currentDate and dateAfterOneYear: " + daysAfter);

    }
}
