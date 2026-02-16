import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class GetFirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month
        YearMonth ym = YearMonth.now();

        // You can also specify a different year and month like this:
        // YearMonth ym = YearMonth.of(2024, 3); // March 2024

        // Get the first day of the month
        LocalDate firstDay = ym.atDay(1);

        // Get the last day of the month
        LocalDate lastDay = ym.atEndOfMonth();

        // Format the dates for output (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedFirstDay = firstDay.format(formatter);
        String formattedLastDay = lastDay.format(formatter);

        // Print the results
        System.out.println("First day of the month: " + formattedFirstDay);
        System.out.println("Last day of the month: " + formattedLastDay);


        // Example of getting the first and last day of a specific month and year:
        int year = 2023;
        int month = 12; // December
        YearMonth specificYM = YearMonth.of(year, month);
        LocalDate specificFirstDay = specificYM.atDay(1);
        LocalDate specificLastDay = specificYM.atEndOfMonth();

        String formattedSpecificFirstDay = specificFirstDay.format(formatter);
        String formattedSpecificLastDay = specificLastDay.format(formatter);

        System.out.println("\nFirst day of " + month + "/" + year + ": " + formattedSpecificFirstDay);
        System.out.println("Last day of " + month + "/" + year + ": " + formattedSpecificLastDay);


    }
}
