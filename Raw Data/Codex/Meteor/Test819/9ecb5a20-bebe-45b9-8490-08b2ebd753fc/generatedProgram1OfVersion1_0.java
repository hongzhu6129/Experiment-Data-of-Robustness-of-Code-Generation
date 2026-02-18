import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AddHoursToCurrentTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours to add: ");
        int hoursToAdd = scanner.nextInt();

        LocalTime currentTime = LocalTime.now();
        LocalTime newTime = currentTime.plusHours(hoursToAdd);

        System.out.println("Current Time: " + currentTime);
        System.out.println("New Time: " + newTime);


        // Alternatively, using ChronoUnit for more flexibility (e.g., adding days, minutes etc.):

        System.out.print("Enter the number of hours to add (using ChronoUnit): ");
        long hoursToAddChrono = scanner.nextLong();  // ChronoUnit can handle larger values

        LocalTime newTimeChrono = currentTime.plus(hoursToAddChrono, ChronoUnit.HOURS);

        System.out.println("New Time (ChronoUnit): " + newTimeChrono);


        scanner.close(); 
    }
}
