import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to accept input)
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();

        // Alternatively, get year and month from command-line arguments
        if (args.length == 2) {
            try {
                year = Integer.parseInt(args[0]);
                month = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid year or month. Please provide integers.");
                return; // Exit if invalid input
            }
        }


        // Create a YearMonth object
        YearMonth yearMonth = YearMonth.of(year, month);

        // Get the first day of the month
        LocalDate firstDay = yearMonth.atDay(1);

        // Get the last day of the month
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Format the dates for output (optional, but makes it nicer)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String firstDayFormatted = firstDay.format(formatter);
        String lastDayFormatted = lastDay.format(formatter);



        // Print the results
        System.out.println("First day of the month: " + firstDayFormatted);
        System.out.println("Last day of the month: " + lastDayFormatted);



    }
}
