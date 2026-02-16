import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start date in yyyy-MM-dd format (e.g., 2023-10-26):");
        String startDateString = scanner.nextLine();

        System.out.println("Enter the end date in yyyy-MM-dd format (e.g., 2024-03-15):");
        String endDateString = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate startDate = LocalDate.parse(startDateString, formatter);
            LocalDate endDate = LocalDate.parse(endDateString, formatter);

            Period period = Period.between(startDate, endDate);

            int years = period.getYears();
            int months = period.getMonths();


            System.out.println("Difference between dates:");
            System.out.println("Years: " + years);
            System.out.println("Months: " + months);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
