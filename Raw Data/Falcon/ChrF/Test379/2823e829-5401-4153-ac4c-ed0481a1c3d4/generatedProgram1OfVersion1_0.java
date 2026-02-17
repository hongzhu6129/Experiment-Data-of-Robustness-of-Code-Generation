import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Example format

        // Format the date and time
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);



        // ---  More examples of formatting ---

        // Example 2:  A different format
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");
        String formattedDateTime2 = currentDateTime.format(formatter2);
        System.out.println("\nFormatted differently: " + formattedDateTime2);



        // Example 3:  Just the date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = currentDateTime.format(dateFormatter);
        System.out.println("\nJust the date: " + formattedDate);



        // Example 4:  Just the time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a"); // 12-hour format
        String formattedTime = currentDateTime.format(timeFormatter);
        System.out.println("\nJust the time: " + formattedTime);



        // Example 5:  ISO 8601 format (useful for data exchange)
        String isoDateTime = currentDateTime.toString();
        System.out.println("\nISO 8601 Format: " + isoDateTime);

    }
}
