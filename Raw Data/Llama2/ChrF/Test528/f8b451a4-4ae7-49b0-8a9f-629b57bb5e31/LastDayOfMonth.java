import java.time.LocalDate;
import java.time.YearMonth;

public class LastDayOfMonth {

    public static void main(String[] args) {

        // Get the current year and month
        YearMonth currentYearMonth = YearMonth.now();
        LocalDate lastDayOfCurrentMonth = currentYearMonth.atEndOfMonth();
        System.out.println("Last day of the current month: " + lastDayOfCurrentMonth);


        //  For a specific year and month (example: February 2024)
        YearMonth specificYearMonth = YearMonth.of(2024, 2);  // February 2024
        LocalDate lastDayOfSpecificMonth = specificYearMonth.atEndOfMonth();
        System.out.println("Last day of February 2024: " + lastDayOfSpecificMonth);



        // Using LocalDate for the current month (alternative approach)
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfThisMonth = today.withDayOfMonth(today.lengthOfMonth());
        System.out.println("Last day of this month (using LocalDate): " + lastDayOfThisMonth);



        // Get input from command-line arguments (year and month)
        if (args.length == 2) {
            try {
                int year = Integer.parseInt(args[0]);
                int month = Integer.parseInt(args[1]);

                YearMonth userYearMonth = YearMonth.of(year, month);
                LocalDate lastDayOfUserMonth = userYearMonth.atEndOfMonth();
                System.out.println("Last day of " + userYearMonth + ": " + lastDayOfUserMonth);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please provide year and month as integers.");
            }
        } else {
           System.out.println("To find the last day of a specific month, provide the year and month as command-line arguments.");
        }

    }
}
