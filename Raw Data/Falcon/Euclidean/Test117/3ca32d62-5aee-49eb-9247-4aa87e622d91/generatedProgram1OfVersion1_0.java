import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now(); // Start with the current date

        // Loop through the next 12 weeks (adjust as needed)
        for (int i = 0; i < 12; i++) {
            // Get the first day of the week (Monday)
            LocalDate firstDayOfWeek = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

            // Get the last day of the week (Sunday)
            LocalDate lastDayOfWeek = currentDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));


            System.out.println("Week " + (i + 1) + ":");
            System.out.println("First Day: " + firstDayOfWeek.toString());
            System.out.println("Last Day: " + lastDayOfWeek.toString());
            System.out.println("--------------------");

            // Move to the next week
            currentDate = lastDayOfWeek.plusDays(1);


            // Alternative way using WeekFields (if you need to define a different start day)
            // For example, if you want Sunday as the first day of the week:
            WeekFields weekFields = WeekFields.of(Locale.getDefault()); // Or specify a Locale
            LocalDate firstDayAlternative = currentDate.with(weekFields.dayOfWeek(), 1L);
            LocalDate lastDayAlternative = currentDate.with(weekFields.dayOfWeek(), 7L);

            //System.out.println("Alternative First Day: " + firstDayAlternative.toString());
            //System.out.println("Alternative Last Day: " + lastDayAlternative.toString());

        }



    }
}
