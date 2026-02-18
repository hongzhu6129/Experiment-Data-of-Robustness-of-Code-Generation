import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeBefore {

    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Example: Subtract 2 hours and 30 minutes
        int hoursToSubtract = 2;
        int minutesToSubtract = 30;


        LocalDateTime pastDateTime = currentDateTime.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);


        // Format the date and time (optional, but recommended for better output)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = pastDateTime.format(formatter);


        // Display the result
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));
        System.out.println("Date and Time " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes ago: " + formattedDateTime);


        // Example with user input (within main method limitations - no error handling):

        if (args.length == 2) { // rudimentary input check
            try {
                hoursToSubtract = Integer.parseInt(args[0]);
                minutesToSubtract = Integer.parseInt(args[1]);

                pastDateTime = currentDateTime.minusHours(hoursToSubtract).minusMinutes(minutesToSubtract);
                formattedDateTime = pastDateTime.format(formatter);

                System.out.println("Date and Time " + hoursToSubtract + " hours and " + minutesToSubtract + " minutes ago: " + formattedDateTime);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide integers for hours and minutes.");
            }

        } else {
            System.out.println("To specify hours and minutes, provide two integer arguments when running the program.");
        }
    }
}
