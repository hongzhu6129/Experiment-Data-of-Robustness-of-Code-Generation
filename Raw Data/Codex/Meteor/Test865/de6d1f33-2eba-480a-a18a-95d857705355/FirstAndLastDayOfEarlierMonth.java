import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstAndLastDayOfEarlierMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the previous month
        LocalDate previousMonth = currentDate.minusMonths(1);

        // Get the first day of the previous month
        LocalDate firstDayOfPreviousMonth = previousMonth.with(TemporalAdjusters.firstDayOfMonth());

        // Get the last day of the previous month
        LocalDate lastDayOfPreviousMonth = previousMonth.with(TemporalAdjusters.lastDayOfMonth());

        // Print the results
        System.out.println("First day of the previous month: " + firstDayOfPreviousMonth);
        System.out.println("Last day of the previous month: " + lastDayOfPreviousMonth);


        // Example of getting the first and last day of a *specific* earlier month (e.g., March 2023)
         int year = 2023;
         int month = 3; // March

         LocalDate specificDate = LocalDate.of(year, month, 1); // Start with the 1st of the month
         LocalDate firstDayOfSpecificMonth = specificDate.with(TemporalAdjusters.firstDayOfMonth());
         LocalDate lastDayOfSpecificMonth = specificDate.with(TemporalAdjusters.lastDayOfMonth());

         System.out.println("\nFirst day of March 2023: " + firstDayOfSpecificMonth);
         System.out.println("Last day of March 2023: " + lastDayOfSpecificMonth);


    }
}
