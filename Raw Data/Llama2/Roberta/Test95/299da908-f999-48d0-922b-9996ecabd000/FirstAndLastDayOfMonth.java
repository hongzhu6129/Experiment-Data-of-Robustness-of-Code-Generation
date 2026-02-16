import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to accept input)
        YearMonth ym = YearMonth.now(); 

        // Alternatively, get a specific year and month:
        // YearMonth ym = YearMonth.of(2024, 10); // For October 2024, for example


        // Get the first day of the month
        LocalDate firstDay = ym.atDay(1);

        // Get the last day of the month
        LocalDate lastDay = ym.atEndOfMonth();


        // Format and print the dates (optional, but helpful for display)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("First day of the month: " + firstDay.format(formatter));
        System.out.println("Last day of the month: " + lastDay.format(formatter));


    }
}
