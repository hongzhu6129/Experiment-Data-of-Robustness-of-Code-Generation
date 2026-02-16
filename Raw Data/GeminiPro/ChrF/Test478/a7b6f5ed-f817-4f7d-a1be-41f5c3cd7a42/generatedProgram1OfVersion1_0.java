import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class CombineDateTime {

    public static void main(String[] args) {
        // Get the current date
        LocalDate date = LocalDate.now();

        // Get the current time
        LocalTime time = LocalTime.now();

        // Combine date and time into a single LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        // Print the combined LocalDateTime object
        System.out.println("Combined LocalDateTime: " + dateTime);


        // Example with specific date and time:
        LocalDate specificDate = LocalDate.of(2024, 10, 26);
        LocalTime specificTime = LocalTime.of(15, 30, 0); // 3:30 PM

        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println("Specific LocalDateTime: " + specificDateTime);


    }
}
