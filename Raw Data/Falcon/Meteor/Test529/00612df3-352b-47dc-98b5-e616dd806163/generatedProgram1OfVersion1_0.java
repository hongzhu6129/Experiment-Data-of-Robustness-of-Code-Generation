import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LastDayOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the YearMonth object for the current date
        YearMonth currentYearMonth = YearMonth.from(currentDate);

        // Get the last day of the current month
        LocalDate lastDayOfMonth = currentYearMonth.atEndOfMonth();

        // Format the date as "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = lastDayOfMonth.format(formatter);


        // Print the last day of the month
        System.out.println("Last day of the current month: " + formattedDate);



    }
}
