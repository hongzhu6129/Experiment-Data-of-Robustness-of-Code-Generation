import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenMonthsBeforeAndAfter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate tenMonthsBefore = today.minusMonths(10);
        LocalDate tenMonthsAfter = today.plusMonths(10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Customize the date format as needed


        System.out.println("Today: " + today.format(formatter));
        System.out.println("10 Months Before: " + tenMonthsBefore.format(formatter));
        System.out.println("10 Months After: " + tenMonthsAfter.format(formatter));

    }
}
