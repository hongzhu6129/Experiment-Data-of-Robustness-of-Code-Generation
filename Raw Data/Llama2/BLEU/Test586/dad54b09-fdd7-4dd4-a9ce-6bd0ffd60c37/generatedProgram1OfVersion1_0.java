import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours to go back: ");
        int hoursBack = scanner.nextInt();

        System.out.print("Enter the number of hours to go forward: ");
        int hoursForward = scanner.nextInt();


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime pastTime = now.minus(hoursBack, ChronoUnit.HOURS);
        LocalDateTime futureTime = now.plus(hoursForward, ChronoUnit.HOURS);


        System.out.println("Current Date and Time: " + now.format(formatter));
        System.out.println("Date and Time " + hoursBack + " hours ago: " + pastTime.format(formatter));
        System.out.println("Date and Time " + hoursForward + " hours from now: " + futureTime.format(formatter));

        scanner.close();
    }
}
