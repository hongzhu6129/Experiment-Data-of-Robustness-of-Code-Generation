import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class GetFirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month
        YearMonth ym = YearMonth.now();

        // Get the first day of the month
        LocalDate firstDay = ym.atDay(1);

        // Get the last day of the month
        LocalDate lastDay = ym.atEndOfMonth();

        // Format the dates for output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String firstDayFormatted = firstDay.format(formatter);
        String lastDayFormatted = lastDay.format(formatter);

        // Print the results
        System.out.println("First day of the month: " + firstDayFormatted);
        System.out.println("Last day of the month: " + lastDayFormatted);


        // Example for a specific month and year:
        YearMonth specificYM = YearMonth.of(2024, 2); // February 2024
        LocalDate specificFirstDay = specificYM.atDay(1);
        LocalDate specificLastDay = specificYM.atEndOfMonth();
        String specificFirstDayFormatted = specificFirstDay.format(formatter);
        String specificLastDayFormatted = specificLastDay.format(formatter);

        System.out.println("\nFirst day of February 2024: " + specificFirstDayFormatted);
        System.out.println("Last day of February 2024: " + specificLastDayFormatted);

    }
}
