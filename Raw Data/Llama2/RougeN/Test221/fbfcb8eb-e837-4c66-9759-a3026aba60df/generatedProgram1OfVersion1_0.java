import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the locale (important for week start day) - using default locale here
        Locale locale = Locale.getDefault(); 
        WeekFields weekFields = WeekFields.of(locale);

        // Loop through weeks of the year (adjust 53 to a higher number if needed for years with more weeks)
        for (int weekNumber = 1; weekNumber <= 53; weekNumber++) {
            try {
                // Calculate the first day of the week
                LocalDate firstDayOfWeek = currentDate.with(weekFields.weekOfYear(), weekNumber)
                        .with(TemporalAdjusters.previousOrSame(weekFields.getFirstDayOfWeek()));

                // Calculate the last day of the week
                LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6); // Add 6 days to the first day

                System.out.println("Week " + weekNumber + ": " + firstDayOfWeek.toString() + " - " + lastDayOfWeek.toString());
            } catch (Exception e) {
               // Handle the case where week 53 (or a higher week number) doesn't exist in the current year.
               // We just break out of the loop because we've reached the end of the weeks in this year.
                break; 
            }
        }
    }
}
