import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date to display only the date part (yyyy-MM-dd)
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(dateFormatter);

        // Print the current date without time
        System.out.println("Current Date: " + formattedDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time to display only the time part (HH:mm:ss)
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);

         // Print the current time without date
        System.out.println("Current Time: " + formattedTime); 
    }
}
