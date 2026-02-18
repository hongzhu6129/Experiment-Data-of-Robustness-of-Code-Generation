import java.time.Year;
import java.time.LocalDate;
import java.time.YearMonth;

public class CurrentYearInfo {

    public static void main(String[] args) {
        // Get the current year
        int currentYear = Year.now().getValue();
        System.out.println("Current Year: " + currentYear);

        // Alternatively, use LocalDate
        int currentYear2 = LocalDate.now().getYear();
        System.out.println("Current Year (using LocalDate): " + currentYear2);


        // Get information about a specific year (e.g., 2024)
        int specificYear = 2024;  // You can change this to any year you want

        Year yearObj = Year.of(specificYear);
        System.out.println("\nInformation about the year " + specificYear + ":");
        System.out.println("Is leap year? " + yearObj.isLeap());
        System.out.println("Length of the year: " + yearObj.length());


        // Example:  Get the length of a specific month in a given year
        YearMonth ym = YearMonth.of(specificYear, 2); // February of specificYear
        System.out.println("Length of February in " + specificYear + ": " + ym.lengthOfMonth() + " days");


        // Example of validating year input (error handling, important for robustness)
        try {
             int yearFromInput = Integer.parseInt(args[0]);  // Get year from command-line argument. 
             Year inputYear = Year.of(yearFromInput);
             System.out.println("\nYear provided as input: " + inputYear.getValue());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please provide a year as a command-line argument.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid year input. Please enter a valid integer.");
        } catch (DateTimeException e) {
            System.err.println("Invalid year value.  Year must be within a reasonable range (e.g., 1-9999 typically).");
        }



    }
}
