import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MonthsRemaining {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in yyyy-MM-dd format (e.g., 2024-03-15):");
        String dateString = scanner.nextLine();

        try {
            LocalDate enteredDate = LocalDate.parse(dateString, DateTimeFormatter.ISO_DATE);
            int year = enteredDate.getYear();
            Month enteredMonth = enteredDate.getMonth();
            int remainingMonths = 12 - enteredMonth.getValue();

            System.out.println("Number of months remaining in " + year + " after " + enteredMonth.name() + ": " + remainingMonths);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
