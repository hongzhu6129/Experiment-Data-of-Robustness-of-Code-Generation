import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetCurrentAndComingDate {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));


        // Get the coming date (tomorrow)
        LocalDate comingDate = currentDate.plusDays(1);
        System.out.println("Coming Date (Tomorrow): " + comingDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // You can also get dates further in the future
        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("Date Next Week: " + nextWeek.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
