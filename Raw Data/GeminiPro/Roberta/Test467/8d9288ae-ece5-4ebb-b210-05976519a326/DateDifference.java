import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-MM-dd):");
        String date1String = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd):");
        String date2String = scanner.nextLine();

        try {
            // Parse the date strings into LocalDate objects
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(date1String, formatter);
            LocalDate date2 = LocalDate.parse(date2String, formatter);

            // Calculate the period between the two dates
            Period period = Period.between(date1, date2);

            // Print the difference in years, months, and days
            System.out.println("Difference:");
            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days: " + period.getDays());


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        } 
         catch (Exception e) {  // Catch any other potential exceptions
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
             scanner.close(); // Close the scanner in a finally block
        }

    }
}
