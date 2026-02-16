import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Define the date format

        try {
            System.out.print("Enter the start date (yyyy-MM-dd): ");
            String startDateString = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(startDateString, formatter);

            System.out.print("Enter the end date (yyyy-MM-dd): ");
            String endDateString = scanner.nextLine();
            LocalDate endDate = LocalDate.parse(endDateString, formatter);


            Period period = Period.between(startDate, endDate);

            int years = period.getYears();
            int months = period.getMonths();


            System.out.println("Years: " + years);
            System.out.println("Months: " + months);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
