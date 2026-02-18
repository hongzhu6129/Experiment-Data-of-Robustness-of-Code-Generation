import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TwoWeeksLater {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the date 2 weeks from today
        LocalDate twoWeeksLater = today.plus(2, ChronoUnit.WEEKS);


        // Format the date for output (optional, but makes it nicer to read)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = twoWeeksLater.format(formatter);

        // Print the date
        System.out.println("The date 2 weeks from today is: " + formattedDate); 
    }
}
