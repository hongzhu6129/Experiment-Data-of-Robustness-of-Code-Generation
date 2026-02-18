import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to get input from the user)
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();


        // Using YearMonth
        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDay = yearMonth.atDay(1);
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Format the dates for output  (e.g., "yyyy-MM-dd")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String firstDayFormatted = firstDay.format(formatter);
        String lastDayFormatted = lastDay.format(formatter);

        System.out.println("First day of the month: " + firstDayFormatted);
        System.out.println("Last day of the month: " + lastDayFormatted);



        // Example using a specific year and month:
        year = 2024;
        month = 2; // February

        yearMonth = YearMonth.of(year, month);
        firstDay = yearMonth.atDay(1);
        lastDay = yearMonth.atEndOfMonth();

         firstDayFormatted = firstDay.format(formatter);
         lastDayFormatted = lastDay.format(formatter);
        
        System.out.println("\nFirst day of February 2024: " + firstDayFormatted);
        System.out.println("Last day of February 2024: " + lastDayFormatted);

    }
}
