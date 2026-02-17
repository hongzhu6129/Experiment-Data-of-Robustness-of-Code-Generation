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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(date1String, formatter);
            LocalDate date2 = LocalDate.parse(date2String, formatter);

            Period period = Period.between(date1, date2);

            int years = period.getYears();
            int months = period.getMonths();


            System.out.println("Difference:");
            System.out.println("Years: " + years);
            System.out.println("Months: " + months);


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
