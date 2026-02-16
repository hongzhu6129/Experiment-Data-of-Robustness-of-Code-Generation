import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TenDaysBeforeAndToday {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the date 10 days before today
        LocalDate tenDaysAgo = today.minusDays(10);

        // Format the dates for output  (You can customize the format)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedToday = today.format(formatter);
        String formattedTenDaysAgo = tenDaysAgo.format(formatter);

        // Print the dates
        System.out.println("Today's date: " + formattedToday);
        System.out.println("Date 10 days ago: " + formattedTenDaysAgo); 
    }
}
