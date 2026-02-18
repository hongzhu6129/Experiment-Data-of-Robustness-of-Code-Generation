import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetChangeDateTime {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time (optional, but recommended for clear output)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Print the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime); 
    }
}
