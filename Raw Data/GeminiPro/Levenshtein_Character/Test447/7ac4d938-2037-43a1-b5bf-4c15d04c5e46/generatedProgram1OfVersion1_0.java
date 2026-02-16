import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to get a specific year/month)
        YearMonth ym = YearMonth.now();

        // Get the first day of the month
        LocalDate firstDay = ym.atDay(1);

        // Get the last day of the month
        LocalDate lastDay = ym.atEndOfMonth();

        // Format the dates for output (optional, but makes it nicer)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Print the results
        System.out.println("First day of the month: " + firstDay.format(formatter));
        System.out.println("Last day of the month: " + lastDay.format(formatter));


        // Example for a specific year and month:
        YearMonth specificYM = YearMonth.of(2024, 2); // February 2024
        LocalDate firstDaySpecific = specificYM.atDay(1);
        LocalDate lastDaySpecific = specificYM.atEndOfMonth();

        System.out.println("\nFirst day of February 2024: " + firstDaySpecific.format(formatter));
        System.out.println("Last day of February 2024: " + lastDaySpecific.format(formatter));

    }
}
