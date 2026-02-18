import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeeklyDates {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the week fields (e.g., first day of the week) based on your locale
        //  Using Locale.US for Sunday as the first day of the week (common in US)
        WeekFields weekFields = WeekFields.of(Locale.US); //  Change Locale as needed


        // Calculate the first day of the current week
        LocalDate firstDayOfWeek = currentDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)); // Using Sunday as start

        // Calculate the last day of the current week (Saturday)
        LocalDate lastDayOfWeek = firstDayOfWeek.plusDays(6);


        // Print the first and last days of the current week
        System.out.println("Current week:");
        System.out.println("First day: " + firstDayOfWeek);
        System.out.println("Last day: " + lastDayOfWeek);

        System.out.println("--------------------");


        // Example: Calculate for several weeks (e.g., next 4 weeks):
        for (int i = 1; i <= 4; i++) {
            firstDayOfWeek = firstDayOfWeek.plusWeeks(1);
            lastDayOfWeek = firstDayOfWeek.plusDays(6);

            System.out.println("Week " + (i+1) + ":"); // +1 to not start at week 0
            System.out.println("First day: " + firstDayOfWeek);
            System.out.println("Last day: " + lastDayOfWeek);
        }

    }
}
