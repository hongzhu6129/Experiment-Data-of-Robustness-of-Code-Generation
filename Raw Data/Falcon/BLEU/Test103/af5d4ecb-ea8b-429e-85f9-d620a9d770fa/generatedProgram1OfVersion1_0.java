import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (yyyy-MM-dd):");
        String date1Str = scanner.nextLine();

        System.out.println("Enter the second date (yyyy-MM-dd):");
        String date2Str = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(date1Str, formatter);
            LocalDate date2 = LocalDate.parse(date2Str, formatter);

            Period period = Period.between(date1, date2);

            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());  // Note: This is *only* the months component, not total months. 
                                                                // See explanation below.

            // If you need the *total* number of months, you'll need to calculate it like this:
            int totalMonths = period.getYears() * 12 + period.getMonths();
            System.out.println("Total Months: " + totalMonths);  // This is generally more useful


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}


/*
Explanation about period.getMonths():

Period.between() calculates the difference in terms of years, months, and days. 
period.getMonths() returns *only* the months component of that difference, which will be between 0 and 11.  

For example:
- Difference between 2023-01-01 and 2024-03-01:
  - Years: 1
  - Months: 2  (only the 2 months *after* the full year)
  - Total Months: 14 (1 year * 12 months/year + 2 months)

- Difference between 2023-10-01 and 2024-02-01:
  - Years: 0
  - Months: 4
  - Total Months: 4


So if you need the total difference in months, calculate it using years * 12 + months.
*/
