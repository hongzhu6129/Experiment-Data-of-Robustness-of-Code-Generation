import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (replace with your desired dates)
        LocalDateTime date1 = LocalDateTime.of(2024, 1, 10, 10, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2024, 1, 15, 12, 30, 15, 500000000);

        // Calculate the duration between the two dates
        Duration duration = Duration.between(date1, date2);

        // Extract the difference in various units
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();  // Minutes within the hour
        long millis = duration.toMillisPart();   // Milliseconds within the second
        long nanos = duration.toNanosPart();    // Nanoseconds within the second

		// Total Minutes and Milliseconds (if needed)
        long totalMinutes = duration.toMinutes();
        long totalMillis = duration.toMillis();


        // Output the results
        System.out.println("Difference between dates:");
        System.out.println("Hours: " + hours);
        System.out.println("Minutes (within the hour): " + minutes);  // Clarified output
        System.out.println("Total Minutes: " + totalMinutes);
        System.out.println("Milliseconds (within the second): " + millis); // Clarified output
        System.out.println("Total Milliseconds: " + totalMillis);
        System.out.println("Nanoseconds (within the second): " + nanos);  // Clarified output

        // For total difference in nanoseconds, use duration.toNanos() (but might be very large)
        // System.out.println("Nanoseconds: " + duration.toNanos()); 
    }
}
