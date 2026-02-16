import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the first day of the current month
        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());

        // Get the last day of the current month
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());


        // Print the first and last day of the month
        System.out.println("First day of the month: " + firstDayOfMonth);
        System.out.println("Last day of the month: " + lastDayOfMonth);

         //Get the first and last DAY OF THE WEEK (e.g., Monday, Tuesday) of the month
        DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();
        DayOfWeek lastDayOfWeek = lastDayOfMonth.getDayOfWeek();

        System.out.println("First day of the week this month: " + firstDayOfWeek);
        System.out.println("Last day of the week this month: " + lastDayOfWeek);



        // Example for a specific month and year (optional)
        LocalDate specificDate = LocalDate.of(2024, 2, 15); // Example: February 2024
        LocalDate firstDayOfSpecificMonth = specificDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfSpecificMonth = specificDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("\nFirst day of February 2024: " + firstDayOfSpecificMonth);
        System.out.println("Last day of February 2024: " + lastDayOfSpecificMonth);


    }
}
