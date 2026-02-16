import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetMonthInfo {

    public static void main(String[] args) {
        // Get information for the current month
        LocalDate currentDate = LocalDate.now();
        int currentMonthValue = currentDate.getMonthValue();
        Month currentMonth = currentDate.getMonth();

        System.out.println("Information for the current month:");
        printMonthInfo(currentMonthValue, currentMonth);


        // Get information for a specific month (e.g., February 2024)
        int specificMonthValue = 2;  // February
        int specificYear = 2024;
        YearMonth specificYearMonth = YearMonth.of(specificYear, specificMonthValue); 
        Month specificMonth = specificYearMonth.getMonth();

        System.out.println("\nInformation for February 2024:");
        printMonthInfo(specificMonthValue, specificMonth);


         // Example getting information for a month from a String representation
        String monthName = "June";
        try {
             Month monthFromString = Month.valueOf(monthName.toUpperCase()); // Case-insensitive
             System.out.println("\nInformation for " + monthName + ":");
             printMonthInfo(monthFromString.getValue(), monthFromString); 
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month name: " + monthName);
        }
    }


    public static void printMonthInfo(int monthValue, Month month) {
        System.out.println("Month Number: " + monthValue);
        System.out.println("Month Name (Full): " + month.getDisplayName(TextStyle.FULL, Locale.DEFAULT));
        System.out.println("Month Name (Short): " + month.getDisplayName(TextStyle.SHORT, Locale.DEFAULT));
        System.out.println("Number of Days (in current/specified year): " + YearMonth.now().atMonth(month).lengthOfMonth()); // Adjust if needed
        System.out.println("---------------------");

    }
}
