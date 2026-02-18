import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date and time (yyyy-MM-dd HH:mm:ss.SSSSSSSSS):");
        String firstDateTimeString = scanner.nextLine();

        System.out.println("Enter the second date and time (yyyy-MM-dd HH:mm:ss.SSSSSSSSS):");
        String secondDateTimeString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS");


        try {
            LocalDateTime firstDateTime = LocalDateTime.parse(firstDateTimeString, formatter);
            LocalDateTime secondDateTime = LocalDateTime.parse(secondDateTimeString, formatter);

            Duration duration = Duration.between(firstDateTime, secondDateTime);

            long hours = duration.toHours();
            long minutes = duration.toMinutesPart();
            long milliseconds = duration.toMillisPart();
            long nanoseconds = duration.toNanosPart();
            long days = ChronoUnit.DAYS.between(firstDateTime.toLocalDate(), secondDateTime.toLocalDate());


            System.out.println("Difference:");
            System.out.println("Days: " + days); // Added days
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Milliseconds: " + milliseconds);
            System.out.println("Nanoseconds: " + nanoseconds);


        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date/time format. Please use yyyy-MM-dd HH:mm:ss.SSSSSSSSS");
        }


        scanner.close();
    }
}
