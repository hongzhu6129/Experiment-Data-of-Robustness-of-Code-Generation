import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CombineDateTime {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get a specific time (or the current time)
        LocalTime specificTime = LocalTime.of(10, 30); // 10:30 AM 
        // Or: LocalTime currentTime = LocalTime.now();


        // Combine date and time into a LocalDateTime object
        LocalDateTime combinedDateTime = LocalDateTime.of(currentDate, specificTime);

        // Print the combined date and time
        System.out.println("Combined Date and Time: " + combinedDateTime);


        // Example with current time:
        LocalDateTime combinedWithCurrentTime = LocalDateTime.of(currentDate, LocalTime.now());
        System.out.println("Combined with Current Time: " + combinedWithCurrentTime);


        // Another way (if you have date and time as strings):
        String dateString = "2024-03-15";
        String timeString = "14:45";

        LocalDate dateFromString = LocalDate.parse(dateString);
        LocalTime timeFromString = LocalTime.parse(timeString);

        LocalDateTime combinedFromString = LocalDateTime.of(dateFromString, timeFromString);
        System.out.println("Combined from Strings: " + combinedFromString);



    }
}
