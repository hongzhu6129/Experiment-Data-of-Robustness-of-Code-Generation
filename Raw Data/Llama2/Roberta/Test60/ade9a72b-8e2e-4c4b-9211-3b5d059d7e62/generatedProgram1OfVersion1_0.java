import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeBeforeHoursMinutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours to subtract: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the number of minutes to subtract: ");
        int minutes = scanner.nextInt();

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime pastDateTime = currentDateTime.minus(hours, ChronoUnit.HOURS).minus(minutes, ChronoUnit.MINUTES);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedPastDateTime = pastDateTime.format(formatter);

        System.out.println("Date and time " + hours + " hours and " + minutes + " minutes ago: " + formattedPastDateTime);

        scanner.close();
    }
}
