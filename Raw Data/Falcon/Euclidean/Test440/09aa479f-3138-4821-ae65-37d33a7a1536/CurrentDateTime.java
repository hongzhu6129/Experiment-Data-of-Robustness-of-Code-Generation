import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format 1:  yyyy-MM-dd HH:mm:ss
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime1 = currentDateTime.format(formatter1);
        System.out.println("Current Date and Time (Format 1): " + formattedDateTime1);


        // Format 2: MM/dd/yyyy HH:mm a  (Example: 10/26/2023 03:45 PM)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a"); // Note lowercase 'hh' for 12-hour format
        String formattedDateTime2 = currentDateTime.format(formatter2);
        System.out.println("Current Date and Time (Format 2): " + formattedDateTime2);



        // Format 3:  EEEE, MMMM dd, yyyy HH:mm:ss z  (Example: Thursday, October 26, 2023 15:45:00 PDT)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss z");
        String formattedDateTime3 = currentDateTime.format(formatter3);
        System.out.println("Current Date and Time (Format 3): " + formattedDateTime3);


       //You can add more formats as needed by creating new DateTimeFormatter objects.

    }
}
