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
            LocalDate date1 = LocalDate.parse(date1String, DateTimeFormatter.ISO_DATE);
            LocalDate date2 = LocalDate.parse(date2String, DateTimeFormatter.ISO_DATE);

            Period difference = Period.between(date1, date2);

            System.out.println("Difference:");
            System.out.println("Years: " + difference.getYears());
            System.out.println("Months: " + difference.getMonths());
            System.out.println("Days: " + difference.getDays());


        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
