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

            System.out.println("Difference:");
            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());


        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
