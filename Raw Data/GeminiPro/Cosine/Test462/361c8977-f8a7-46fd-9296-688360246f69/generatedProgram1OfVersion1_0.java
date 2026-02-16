import java.time.Year;
import java.time.YearMonth;

public class GetYearInfo {

    public static void main(String[] args) {
        // Get information about the current year
        int currentYear = Year.now().getValue();
        System.out.println("Current Year: " + currentYear);
        System.out.println("Is current year a leap year? " + Year.now().isLeap());

        // Get information about a specific year (e.g., 2024)
        int specificYear = 2024;  // You can change this to any year you want
        Year yearObj = Year.of(specificYear);
        System.out.println("\nInformation about the year " + specificYear + ":");
        System.out.println("Is it a leap year? " + yearObj.isLeap());
        System.out.println("Length of the year (in days): " + yearObj.length());


        // Example of using YearMonth (if you need month information as well)
        YearMonth yearMonth = YearMonth.now();
        System.out.println("\nCurrent YearMonth: " + yearMonth);
        System.out.println("Length of the current month: " + yearMonth.lengthOfMonth());

        // Example of getting a specific YearMonth
        YearMonth specificYearMonth = YearMonth.of(2023, 12); // December 2023
        System.out.println("\nSpecific YearMonth: " + specificYearMonth);  
        System.out.println("Length of the specific month: " + specificYearMonth.lengthOfMonth());


    }
}
