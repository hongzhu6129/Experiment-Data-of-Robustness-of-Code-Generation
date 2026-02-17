import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date (e.g., "yyyy-MM-dd")
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(dateFormatter);

        // Print the formatted date
        System.out.println("Current Date: " + formattedDate);


        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time (e.g., "HH:mm:ss")
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);

        // Print the formatted time
        System.out.println("Current Time: " + formattedTime);


    }
}
