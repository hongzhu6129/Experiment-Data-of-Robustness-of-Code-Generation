import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenDaysBeforeAndAfter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // 10 days before
        LocalDate tenDaysBefore = today.minusDays(10);

        // 10 days after
        LocalDate tenDaysAfter = today.plusDays(10);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Customize the format if needed

        System.out.println("Today: " + today.format(formatter));
        System.out.println("10 days before: " + tenDaysBefore.format(formatter));
        System.out.println("10 days after: " + tenDaysAfter.format(formatter));
    }
}
