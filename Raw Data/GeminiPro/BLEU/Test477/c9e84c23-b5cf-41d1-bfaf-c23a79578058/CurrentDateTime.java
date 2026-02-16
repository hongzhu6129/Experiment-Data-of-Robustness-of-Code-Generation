import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date to display only the date part
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(dateFormatter);

        // Display the formatted date
        System.out.println("Current Date: " + formattedDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();


        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Use "hh:mm:ss a" for 12-hour format with AM/PM

        String formattedTime = currentTime.format(timeFormatter);

        // Print the formatted time:
        System.out.println("Current Time: " + formattedTime);
    }
}
