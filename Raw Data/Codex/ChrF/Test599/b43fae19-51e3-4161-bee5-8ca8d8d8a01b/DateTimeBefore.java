import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeBefore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime pastDateTime = currentDateTime.minusHours(hours).minusMinutes(minutes);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedPastDateTime = pastDateTime.format(formatter);

        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
        System.out.println("Date and Time " + hours + " hours and " + minutes + " minutes ago: " + formattedPastDateTime);

        input.close(); // Close the scanner to release resources
    }
}
