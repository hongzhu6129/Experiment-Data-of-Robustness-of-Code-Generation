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


        //Demonstrate some other common formats:

        System.out.println(currentDateTime.format(DateTimeFormatter.ISO_DATE_TIME)); // ISO standard

        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a"))); // US style with AM/PM

        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss"))); // Long format with day of the week



    }
}
