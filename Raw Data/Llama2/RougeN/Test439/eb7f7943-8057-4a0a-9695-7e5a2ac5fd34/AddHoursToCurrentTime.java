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
        System.out.println("New Time after adding " + hoursToAdd + " hours: " + newTime);


        // Demonstrating ChronoUnit for more flexibility (optional)
        System.out.println("\n--- Using ChronoUnit ---");  // Just a separator
        System.out.print("Enter the number of units to add (e.g., hours, minutes): ");
        int amountToAdd = scanner.nextInt();

        System.out.print("Enter the unit type (HOURS, MINUTES, SECONDS): "); // Case-sensitive
        String unitType = scanner.next().toUpperCase();


        try {
            ChronoUnit unit = ChronoUnit.valueOf(unitType);
            LocalTime newTimeChrono = currentTime.plus(amountToAdd, unit);
            System.out.println("New Time using ChronoUnit: " + newTimeChrono);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid unit type entered.");
        }



        scanner.close();
    }
}
