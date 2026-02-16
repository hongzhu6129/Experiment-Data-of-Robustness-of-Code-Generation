import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Number of days in " + yearMonth + ": " + daysInMonth);

        scanner.close(); 
    }
}
