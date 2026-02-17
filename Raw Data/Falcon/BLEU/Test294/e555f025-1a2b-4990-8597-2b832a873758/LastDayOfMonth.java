import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastDayOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the last day of the current month
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

        // Print the last day of the month
        System.out.println("Last day of the current month: " + lastDayOfMonth);


        // Example with a specific month and year:
        int year = 2024;
        int month = 2; // February

        LocalDate specificDate = LocalDate.of(year, month, 1); // Start with the first day of the month
        LocalDate lastDayOfSpecificMonth = specificDate.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Last day of February 2024: " + lastDayOfSpecificMonth);

    }
}
