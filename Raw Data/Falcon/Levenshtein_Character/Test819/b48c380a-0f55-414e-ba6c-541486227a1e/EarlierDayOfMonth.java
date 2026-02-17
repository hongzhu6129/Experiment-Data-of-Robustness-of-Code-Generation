import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class EarlierDayOfMonth {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the first day of the current month
        LocalDate firstDayOfMonth = currentDate.with(TemporalAdjusters.firstDayOfMonth());

        // Print the first day of the month
        System.out.println("The earlier day of the current month is: " + firstDayOfMonth);
    }
}
