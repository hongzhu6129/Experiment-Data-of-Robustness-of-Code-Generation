import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;

public class MinimumDateValues {

    public static void main(String[] args) {
        // Define a list of default holidays (you can customize this list)
        List<LocalDate> holidays = Arrays.asList(
                LocalDate.of(2024, Month.JANUARY, 1),  // New Year's Day
                LocalDate.of(2024, Month.MAY, 27),    // Memorial Day (US)
                LocalDate.of(2024, Month.JULY, 4),     // Independence Day (US)
                LocalDate.of(2024, Month.SEPTEMBER, 2), // Labor Day (US)
                LocalDate.of(2024, Month.DECEMBER, 25) // Christmas Day
        );

        LocalDate now = LocalDate.now();

        int minYear = now.getYear();
        int minMonth = now.getMonthValue();
        int minWeek = now.get(ChronoField.ALIGNED_WEEK_OF_YEAR); // ISO 8601 week number
        int minDay = now.getDayOfMonth();

        for (LocalDate holiday : holidays) {
            minYear = Math.min(minYear, holiday.getYear());
            minMonth = Math.min(minMonth, holiday.getMonthValue());
            minWeek = Math.min(minWeek, holiday.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
            minDay = Math.min(minDay, holiday.getDayOfMonth());
        }


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeek);
        System.out.println("Minimum Day of Month: " + minDay);



    }
}
