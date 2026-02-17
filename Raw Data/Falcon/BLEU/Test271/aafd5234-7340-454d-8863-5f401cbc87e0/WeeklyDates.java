import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Loop through the weeks of the year (1 to 53 - some years have 53 weeks)
        for (int weekOfYear = 1; weekOfYear <= 53; weekOfYear++) {
            try {
                // Calculate the first day of the week (Monday)
                LocalDate firstDayOfWeek = currentDate.with(WeekFields.of(Locale.getDefault()).weekOfYear(), weekOfYear)
                        .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

                // Calculate the last day of the week (Sunday)
                LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6);

                // Print the dates for the current week
                System.out.println("Week " + weekOfYear + ": " + firstDayOfWeek.toString() + " - " + lastDayOfWeek.toString());


            } catch (Exception e) {
                // Handle the case where week 53 might not exist in the current year/locale
                //  A DateTimeException can be thrown if the resulting date is invalid
                System.out.println("Week " + weekOfYear + " does not exist in this year for the current locale.");
                break; // Stop the loop if we encounter an invalid week number
            }

        }
    }
}
