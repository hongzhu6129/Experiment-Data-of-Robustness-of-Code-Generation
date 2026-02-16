import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class MinimumDateValues {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Minimum year is simply the current year.
        int minYear = currentDate.getYear();

        // Minimum month is 1 (January).
        int minMonth = 1;

        // Minimum week of year depends on the locale.  Using Locale.US for standard Monday-start week.
        WeekFields weekFields = WeekFields.of(Locale.US);
        int minWeek = 1;

        // Minimum day of month is 1.
        int minDayOfMonth = 1;

        // Calculate first day of the year, first day of the month, 
        // and first day of the first week for the current locale.

        LocalDate firstOfYear = currentDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate firstOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstOfWeek = currentDate.with(weekFields.dayOfWeek(), 1L); //1L represents Monday

        // Calculate the difference between the current date and the minimum dates in days.
        long daysFromYearStart = ChronoUnit.DAYS.between(firstOfYear, currentDate);
        long daysFromMonthStart = ChronoUnit.DAYS.between(firstOfMonth, currentDate);
        long daysFromWeekStart = ChronoUnit.DAYS.between(firstOfWeek, currentDate);


        System.out.println("Current Date: " + currentDate);
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week of Year (Locale.US): " + minWeek);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


        System.out.println("\nDays since start of year: " + daysFromYearStart);
        System.out.println("Days since start of month: " + daysFromMonthStart);
        System.out.println("Days since start of week: " + daysFromWeekStart);

        // Example of calculating the minimum date overall (first day of the year):
        LocalDate minDateOverall = currentDate.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("\nMinimum Date Overall (First day of year): " + minDateOverall);





    }
}
