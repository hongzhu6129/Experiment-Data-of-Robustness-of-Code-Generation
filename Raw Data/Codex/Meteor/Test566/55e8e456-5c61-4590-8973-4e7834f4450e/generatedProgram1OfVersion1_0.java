import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenDaysBeforeAndAfter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate tenDaysBefore = today.minusDays(10);
        LocalDate tenDaysAfter = today.plusDays(10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedTenDaysBefore = tenDaysBefore.format(formatter);
        String formattedTenDaysAfter = tenDaysAfter.format(formatter);

        System.out.println("10 days before today: " + formattedTenDaysBefore);
        System.out.println("10 days after today: " + formattedTenDaysAfter);
    }
}
