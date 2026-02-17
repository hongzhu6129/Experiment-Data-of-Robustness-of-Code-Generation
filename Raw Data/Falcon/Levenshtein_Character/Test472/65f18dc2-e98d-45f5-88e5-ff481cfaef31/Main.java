import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Get information about the current month
        LocalDate now = LocalDate.now();
        Month currentMonth = now.getMonth();
        int currentMonthValue = currentMonth.getValue();
        int currentMonthLength = currentMonth.length(now.isLeapYear()); // Account for leap years
        String currentMonthName = currentMonth.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault());


        System.out.println("Current Month Information:");
        System.out.println("Name: " + currentMonthName);
        System.out.println("Value: " + currentMonthValue);
        System.out.println("Length (days): " + currentMonthLength);
        System.out.println("First Day of Month: " + now.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("Last Day of Month: " + now.with(TemporalAdjusters.lastDayOfMonth()));


        // Example with a specific month and year
        YearMonth specificMonth = YearMonth.of(2024, 2); // February 2024 (a leap year)
        Month feb2024 = specificMonth.getMonth();
        int feb2024Length = feb2024.length(specificMonth.isLeapYear());
        String feb2024Name = feb2024.getDisplayName(java.time.format.TextStyle.FULL, Locale.getDefault());

        System.out.println("\nSpecific Month Information (February 2024):");
        System.out.println("Name: " + feb2024Name);
        System.out.println("Length (days): " + feb2024Length);

        // Example with custom formatting
        LocalDate specificDate = LocalDate.of(2023, 10, 26);
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String formattedDate = specificDate.format(customFormatter);
        System.out.println("\nFormatted Date (October 2023): " + formattedDate);



    }
}
