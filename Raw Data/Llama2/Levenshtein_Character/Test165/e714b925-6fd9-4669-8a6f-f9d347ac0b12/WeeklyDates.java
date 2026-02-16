import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Loop through the weeks of the year (1 to 53, some years might have 53 weeks)
        for (int week = 1; week <= 53; week++) {
            try {
                // Calculate the first day of the week (Monday)
                LocalDate firstDayOfWeek = currentDate.with(WeekFields.of(Locale.getDefault()).weekOfYear(), week)
                        .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

                // Calculate the last day of the week (Sunday)
                LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6); // Add 6 days to Monday to get Sunday


                System.out.println("Week " + week + ": " + 
                                   firstDayOfWeek.toString() + " - " + 
                                   lastDayOfWeek.toString());

            } catch (Exception e) {
                // Handle potential DateTimeException (e.g., week 53 might not exist in some years)
                // We just break the loop if a week is invalid for the current year/locale
                break; 
            }
        }
    }
}
