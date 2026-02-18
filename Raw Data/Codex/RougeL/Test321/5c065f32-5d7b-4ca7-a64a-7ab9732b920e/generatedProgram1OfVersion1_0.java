import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TimeInformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the time in HH:mm:ss format (24-hour format):");
        String timeString = scanner.nextLine();

        try {
            LocalTime time = LocalTime.parse(timeString);

            System.out.println("Hour: " + time.getHour());
            System.out.println("Minute: " + time.getMinute());
            System.out.println("Second: " + time.getSecond());

            DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String formatted12HourTime = time.format(formatter12Hour);
            System.out.println("Time in 12-hour format: " + formatted12HourTime);


        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format. Please use HH:mm:ss format.");
        }

        scanner.close(); 
    }
}
