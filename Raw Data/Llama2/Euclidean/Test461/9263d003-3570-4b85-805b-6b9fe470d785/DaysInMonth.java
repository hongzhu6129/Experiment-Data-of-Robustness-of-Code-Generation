import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        try {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println("Number of days in " + yearMonth + ": " + daysInMonth);


             // Example usage for current month:
            LocalDate currentDate = LocalDate.now();
            int currentMonth = currentDate.getMonthValue();
            int currentYear = currentDate.getYear();
            YearMonth currentYearMonth = YearMonth.of(currentYear, currentMonth);
            int daysInCurrentMonth = currentYearMonth.lengthOfMonth();
            System.out.println("Number of days in the current month (" + currentYearMonth + "): " + daysInCurrentMonth);



        } catch (DateTimeException e) {
            System.out.println("Invalid year or month entered.");
        }

        scanner.close(); 
    }
}
