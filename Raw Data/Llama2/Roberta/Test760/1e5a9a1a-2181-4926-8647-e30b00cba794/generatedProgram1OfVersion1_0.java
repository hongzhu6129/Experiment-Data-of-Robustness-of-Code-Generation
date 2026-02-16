import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;

public class MinimumDateValues {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate currentDate = now.toLocalDate();

        // Year (minimum is always 1)
        int minYear = 1;

        // Month (minimum is always 1 representing January)
        int minMonth = 1;


        // Week (minimum is always 1 representing first week of the year).  Note: Week definition can vary by locale.
        // Here we demonstrate a common approach using ISO-8601 standard (Monday as the first day of the week)
        int minWeek = 1;

        // Date (minimum is always 1)
        int minDate = 1;


        // Output
        System.out.println("Current Date: " + currentDate);
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week (ISO-8601): " + minWeek);
        System.out.println("Minimum Date: " + minDate);

         //Illustrative Example: Getting actual date of min week of current year (ISO standard)
         LocalDate firstDayOfWeekYear = currentDate.with(TemporalAdjusters.firstDayOfYear()).with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)); 
         int weekOfYear = firstDayOfWeekYear.get(WeekFields.ISO.weekOfYear()); // Should be 1 or 52/53 if Jan 1st is in last week of previous year


        System.out.println("First day of current year (aligned to Monday): " + firstDayOfWeekYear);
        System.out.println("Week number of first day of year (ISO-8601): " + weekOfYear);




    }
}
