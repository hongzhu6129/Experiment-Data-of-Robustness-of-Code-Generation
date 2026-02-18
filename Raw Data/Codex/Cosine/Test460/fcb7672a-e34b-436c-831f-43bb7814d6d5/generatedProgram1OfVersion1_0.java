import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class MinimumDateValues {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Year
        int minYear = currentDate.getYear(); // Current year is the minimum

        // Month
        int minMonth = currentDate.getMonthValue(); // Current month is the minimum


        // Week of year (ISO-8601 standard: Week starts on Monday)
        int currentWeekOfYear = currentDate.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        int minWeekOfYear = currentWeekOfYear;


        // Day of month
        int minDayOfMonth = currentDate.getDayOfMonth(); // Current day is the minimum


        // Example of finding minimum values across a set of holidays (Illustrative)
        LocalDate[] holidays = {
                LocalDate.of(2024, Month.DECEMBER, 25), // Christmas
                LocalDate.of(2024, Month.JANUARY, 1),  // New Year's Day
                LocalDate.of(2024, Month.JULY, 4)      // 4th of July
        };

        for (LocalDate holiday : holidays) {
            minYear = Math.min(minYear, holiday.getYear());
            minMonth = Math.min(minMonth, holiday.getMonthValue());
            minWeekOfYear = Math.min(minWeekOfYear, holiday.get(WeekFields.of(Locale.getDefault()).weekOfYear())); //ISO weeks
            minDayOfMonth = Math.min(minDayOfMonth, holiday.getDayOfMonth());
        }


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


        // ---  Additional Calculations (If needed) ---

        // Minimum day of week (e.g., Sunday=7)
        DayOfWeek minDayOfWeek = currentDate.getDayOfWeek();
        for (LocalDate holiday : holidays) {
             if (holiday.getDayOfWeek().getValue() < minDayOfWeek.getValue()) {
                  minDayOfWeek = holiday.getDayOfWeek();
             }
        }
        System.out.println("Minimum Day of Week: " + minDayOfWeek.getValue()); //1=Monday ... 7=Sunday



        // Day of year (1-366):  Not as useful for "minimum" comparisons across years
        int minDayOfYear = currentDate.getDayOfYear();
        for (LocalDate holiday : holidays) {
            minDayOfYear = Math.min(minDayOfYear, holiday.getDayOfYear());
        }
        System.out.println("Minimum Day of Year: " + minDayOfYear);




    }
}
