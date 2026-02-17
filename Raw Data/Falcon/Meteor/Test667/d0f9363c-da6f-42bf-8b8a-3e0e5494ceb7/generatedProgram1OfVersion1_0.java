import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Loop through the weeks of the year (1 to 53, some years have 53 weeks)
        for (int weekOfYear = 1; weekOfYear <= 53; weekOfYear++) {
            try {
                // Calculate the first day of the week (Monday)
                LocalDate firstDayOfWeek = currentDate.with(WeekFields.of(Locale.getDefault()).weekOfYear(), weekOfYear)
                        .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));


                // Calculate the last day of the week (Sunday)
                LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6);


                // Print the dates
                System.out.println("Week " + weekOfYear + ": " + firstDayOfWeek.toString() + " - " + lastDayOfWeek.toString());


                // For efficiency, advance currentDate to the next week to avoid redundant calculations in the next iteration
                currentDate = lastDayOfWeek.plusDays(1);



            } catch (Exception e) {
                // This handles the potential DateTimeException if week 53 doesn't exist in the current year.  We simply break out of the loop.
                break; 
            }
        }
    }
}
