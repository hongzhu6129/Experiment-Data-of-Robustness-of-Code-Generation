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
            LocalDate date1 = LocalDate.parse(date1String, DateTimeFormatter.ISO_DATE);
            LocalDate date2 = LocalDate.parse(date2String, DateTimeFormatter.ISO_DATE);

            // Calculate the period between the two dates
            Period period = Period.between(date1, date2);

            // Extract the difference in years, months, and days
            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.println("Difference:");
            System.out.println("Years: " + years);
            System.out.println("Months: " + months);
            System.out.println("Days: " + days);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
