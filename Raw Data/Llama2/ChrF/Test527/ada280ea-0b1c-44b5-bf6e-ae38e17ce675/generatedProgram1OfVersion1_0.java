import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeBeforeHours {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours to go back: ");
        int hoursToSubtract = scanner.nextInt();

        System.out.print("Enter the number of minutes to go back (from the current time, not after subtracting hours): ");
        int minutesToSubtract = scanner.nextInt();

        LocalDateTime currentDateTime = LocalDateTime.now();

        LocalDateTime pastDateTime = currentDateTime.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = pastDateTime.format(formatter);

        System.out.println("Date and time " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes ago: " + formattedDateTime);

        scanner.close(); // Close the scanner to release resources
    }
}
