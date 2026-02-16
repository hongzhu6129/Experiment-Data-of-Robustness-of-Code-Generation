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
        int specificYear = 2024;
        Month specificMonth = Month.FEBRUARY; 

        System.out.println("\nSpecific Month Information (February 2024):");
        printMonthInfo(specificMonth, specificYear);


        // Get information for a specific month and year provided as command-line arguments.
        if (args.length == 2) {
            try {
                int year = Integer.parseInt(args[0]);
                int monthValue = Integer.parseInt(args[1]); // 1-based month (1 = January, 2 = February, etc.)
                if (monthValue >= 1 && monthValue <= 12) {
                    Month argMonth = Month.of(monthValue);  // Convert int to Month enum
                    System.out.println("\nMonth Information from arguments (Year " + year + ", Month " + monthValue + "):");
                    printMonthInfo(argMonth, year);

                } else {
                    System.err.println("Invalid month value. Please enter a number between 1 and 12.");
                }


            } catch (NumberFormatException e) {
                System.err.println("Invalid year or month. Please provide integers as arguments (year month).");
            }
        }



    }


    public static void printMonthInfo(Month month, int year) {
        System.out.println("Month: " + month.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println("Month Number: " + month.getValue());
        System.out.println("Number of Days: " + YearMonth.of(year, month).lengthOfMonth()); // Account for leap years
    }



}
