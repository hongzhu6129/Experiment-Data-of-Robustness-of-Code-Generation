import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to get input from the user)
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();


        // Using YearMonth
        YearMonth yearMonth = YearMonth.of(year, month);

        LocalDate firstDay = yearMonth.atDay(1);
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Format the dates for output (optional, but recommended for readability)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("First day of the month: " + firstDay.format(formatter));
        System.out.println("Last day of the month: " + lastDay.format(formatter));



        // Example with user input (commented out, but you can uncomment and use it)
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // ... (rest of the code remains the same) ...

        scanner.close(); // Important to close the scanner
        */
    }
}
