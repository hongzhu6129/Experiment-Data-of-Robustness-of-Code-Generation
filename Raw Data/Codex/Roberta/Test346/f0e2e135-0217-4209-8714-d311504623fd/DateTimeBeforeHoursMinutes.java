import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeBeforeHoursMinutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours to subtract: ");
        int hoursToSubtract = scanner.nextInt();

        System.out.print("Enter the number of minutes to subtract: ");
        int minutesToSubtract = scanner.nextInt();

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime pastDateTime = currentDateTime.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedPastDateTime = pastDateTime.format(formatter);

        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
        System.out.println("Date and Time " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes ago: " + formattedPastDateTime);

        scanner.close(); 
    }
}
