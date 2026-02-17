import java.time.Year;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class CurrentYearInfo {

    public static void main(String[] args) {
        // Get current year information
        int currentYear = Year.now().getValue();
        System.out.println("Current Year: " + currentYear);
        System.out.println("Is Leap Year: " + Year.isLeap(currentYear));

        // Example with a specific year (you can change this)
        int specificYear = 2024;
        Year yearObj = Year.of(specificYear);
        System.out.println("\nSpecific Year: " + specificYear);
        System.out.println("Is Leap Year: " + yearObj.isLeap());

        // Get information about a specific date within the year (optional)
        LocalDate specificDate = LocalDate.of(currentYear, 5, 15); // May 15th of current year
        YearMonth yearMonth = YearMonth.from(specificDate);
        DayOfWeek dayOfWeek = specificDate.getDayOfWeek();

        System.out.println("\nExample date: " + specificDate);
        System.out.println("Month: " + yearMonth.getMonth());
        System.out.println("Day of Week: " + dayOfWeek);



    }
}
