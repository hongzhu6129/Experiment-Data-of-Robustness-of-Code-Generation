import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeMixture {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Combine date and time into a LocalDateTime object
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);

        // Print the combined date and time
        System.out.println("Current Date and Time: " + currentDateTime);


        // Example with specific date and time:
        LocalDate specificDate = LocalDate.of(2024, 12, 25); // Christmas 2024
        LocalTime specificTime = LocalTime.of(18, 30); // 6:30 PM

        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println("Specific Date and Time: " + specificDateTime);


    }
}
