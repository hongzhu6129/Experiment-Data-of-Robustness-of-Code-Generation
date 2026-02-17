import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenDaysBeforeAndAfter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 10 days before
        LocalDate tenDaysAgo = today.minusDays(10);
        System.out.println("10 days ago: " + tenDaysAgo.format(formatter));

        // 10 days after
        LocalDate tenDaysLater = today.plusDays(10);
        System.out.println("10 days later: " + tenDaysLater.format(formatter));
    }
}
