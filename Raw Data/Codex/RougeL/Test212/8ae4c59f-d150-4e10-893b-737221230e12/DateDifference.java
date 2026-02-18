import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (you can change these)
        String date1String = "2024-03-15T10:30:00.123456789";
        String date2String = "2024-03-16T12:45:15.987654321";

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS");


        try {
            // Parse the date strings into LocalDateTime objects
            LocalDateTime date1 = LocalDateTime.parse(date1String, formatter);
            LocalDateTime date2 = LocalDateTime.parse(date2String, formatter);


            // Calculate the difference using Duration and ChronoUnit


            Duration duration = Duration.between(date1, date2);

            long hours = duration.toHours();
            long minutes = duration.toMinutesPart(); 
            long millis = duration.toMillisPart();
            long nanos = duration.toNanosPart();

            System.out.println("Difference between dates:");
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Milliseconds: " + millis);
            System.out.println("Nanoseconds: " + nanos);




        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS");
        }

    }
}
