import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenDaysBeforeAndAfter {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate 10 days before today
        LocalDate tenDaysBefore = today.minusDays(10);

        // Calculate 10 days after today
        LocalDate tenDaysAfter = today.plusDays(10);

        // Format the dates for output  (You can customize the format)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Print the results
        System.out.println("Today: " + today.format(formatter));
        System.out.println("10 days before: " + tenDaysBefore.format(formatter));
        System.out.println("10 days after: " + tenDaysAfter.format(formatter));

    }
}
