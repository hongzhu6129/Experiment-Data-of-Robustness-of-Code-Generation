import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        // Method 1: Using LocalDate (for current month)
        LocalDate currentDate = LocalDate.now();
        int daysInCurrentMonth = currentDate.lengthOfMonth();
        System.out.println("Number of days in the current month: " + daysInCurrentMonth);



        // Method 2: Using YearMonth (for any month/year)  more flexible
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year (YYYY):");
        int year = scanner.nextInt();

        System.out.println("Enter month (MM or month name):");
        String monthInput = scanner.next();

        try {
            // Attempt to parse as month number first
            int month = Integer.parseInt(monthInput);
            YearMonth ym = YearMonth.of(year, month);
            int daysInMonth = ym.lengthOfMonth();
            System.out.println("Number of days in " + ym.format(DateTimeFormatter.ofPattern("MMMM yyyy")) + ": " + daysInMonth);

        } catch (NumberFormatException e) {
            try {
                // If parsing as number fails, try parsing as month name
                DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM");
                YearMonth ym = YearMonth.parse(monthInput + " " + year, DateTimeFormatter.ofPattern("MMMM yyyy")); // Parse with year
                int daysInMonth = ym.lengthOfMonth();
                System.out.println("Number of days in " + ym.format(monthFormatter.withLocale(java.util.Locale.ENGLISH)) + " " + year + ": " + daysInMonth);

            } catch (Exception ex) {
                System.out.println("Invalid month input. Please enter a valid month number (MM) or name.");
            }

        }

        scanner.close();


        //Method 3.  Days between the first day of the current month and the first day of the next month.

        LocalDate firstDayOfCurrentMonth = LocalDate.now().withDayOfMonth(1);
        LocalDate firstDayOfNextMonth = firstDayOfCurrentMonth.plusMonths(1);
        long daysBetween = ChronoUnit.DAYS.between(firstDayOfCurrentMonth, firstDayOfNextMonth);
        System.out.println("Days in current month (using ChronoUnit): " + daysBetween);


    }
}
