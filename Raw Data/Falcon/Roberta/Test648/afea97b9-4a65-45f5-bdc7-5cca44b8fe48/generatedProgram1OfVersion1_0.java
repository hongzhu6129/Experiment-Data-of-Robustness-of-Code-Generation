import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {

        // Display current date without time
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);


        // Change time without date (demonstration)
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime newTime = LocalTime.of(10, 30, 0); // Example: setting time to 10:30:00

        LocalDateTime changedDateTime = currentDateTime.with(newTime); 
        System.out.println("Original Date and Time: " + currentDateTime);        
        System.out.println("Changed Date and Time: " + changedDateTime); // Date remains the same, only time is changed

         // Formatting Date and Time (Optional - for specific output formats)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = changedDateTime.format(formatter);
        System.out.println("Formatted Changed Date and Time: " + formattedDateTime);



    }
}
