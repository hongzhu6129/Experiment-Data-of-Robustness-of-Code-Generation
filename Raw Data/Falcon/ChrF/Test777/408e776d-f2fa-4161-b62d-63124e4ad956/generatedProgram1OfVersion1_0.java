import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetMonthInfo {

    public static void main(String[] args) {
        // Get current month information
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        int currentYear = currentDate.getYear();
        YearMonth currentYearMonth = YearMonth.of(currentYear, currentMonth);


        System.out.println("Current Month Information:");
        printMonthInfo(currentYearMonth);

        // Get information for a specific month (e.g., February 2024)
        YearMonth specificMonth = YearMonth.of(2024, Month.FEBRUARY); // Example
        System.out.println("\nSpecific Month Information (February 2024):");
        printMonthInfo(specificMonth);



        //Get information for a month provided as a command line argument (e.g., "2025-03")
        if (args.length > 0) {  //Check if a command line argument is provided
            try {
                YearMonth argMonth = YearMonth.parse(args[0]); // Parse the input string
                System.out.println("\nMonth Information from Command Line Argument:");
                printMonthInfo(argMonth);
            } catch (java.time.format.DateTimeParseException e) {
                System.err.println("Invalid date format. Please use YYYY-MM (e.g., 2025-12).");
            }

        }

    }



    private static void printMonthInfo(YearMonth yearMonth) {
        int year = yearMonth.getYear();
        Month month = yearMonth.getMonth();
        int lengthOfMonth = yearMonth.lengthOfMonth();
        String monthName = month.getDisplayName(TextStyle.FULL, Locale.getDefault()); // Get localized month name


        System.out.println("Year: " + year);
        System.out.println("Month: " + monthName);
        System.out.println("Number of Days: " + lengthOfMonth);


        // Day of the week for the first day of the month (e.g., MONDAY)
        LocalDate firstDayOfMonth = yearMonth.atDay(1);
        String firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("First Day of the Month: " + firstDayOfWeek);

    }
}
