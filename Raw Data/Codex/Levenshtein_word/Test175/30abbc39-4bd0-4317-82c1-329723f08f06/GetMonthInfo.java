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

        System.out.println("Current Month Information:");
        printMonthInfo(currentMonth, currentDate.getYear());


        // Get information for a specific month (e.g., February 2024)
        int year = 2024;
        Month specificMonth = Month.FEBRUARY; // Or Month.of(2) 

        System.out.println("\nSpecific Month Information:");
        printMonthInfo(specificMonth, year);


         // Get information from command-line arguments (optional)
        if (args.length == 2) {
            try {
                year = Integer.parseInt(args[0]);
                int monthValue = Integer.parseInt(args[1]); // 1-12
                specificMonth = Month.of(monthValue);

                System.out.println("\nMonth Information from Arguments:");
                printMonthInfo(specificMonth, year);

            } catch (NumberFormatException e) {
                System.err.println("Invalid year or month input.  Usage: java GetMonthInfo <year> <month(1-12)>");
            } catch (IllegalArgumentException e) { // Invalid month number
                System.err.println("Invalid month number.  Please enter a number between 1 and 12.");

            }
        }



    }

    public static void printMonthInfo(Month month, int year) {
        System.out.println("Month: " + month.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Month Number: " + month.getValue());
        System.out.println("Number of Days: " + YearMonth.of(year, month).lengthOfMonth()); // Account for leap years
        // Add other relevant information as needed (e.g., first day of week, etc.)
    }
}
