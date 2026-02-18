import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (replace with your desired dates)
        LocalDateTime date1 = LocalDateTime.of(2024, 1, 10, 10, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2024, 1, 10, 12, 30, 15, 500000000);


        // Calculate the difference using Duration
        Duration duration = Duration.between(date1, date2);

        // Extract the difference in various units
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();  // Java 9+ for toMinutesPart(), otherwise calculate manually 
        long millis = duration.toMillisPart();    // Java 9+ for toMillisPart()
        long nanos = duration.toNanosPart();     // Java 9+ for toNanosPart()


        // Pre-Java 9 calculations for minutes, millis, nanos
        if (java.lang.Runtime.version().feature() < 9)  {
            minutes = (duration.toMillis() % (1000 * 60 * 60)) / (1000 * 60);
            millis = (duration.toMillis() % (1000 * 60)) / 1000;
            nanos = duration.toNanos() % 1000_000_000;

        }


        // Print the differences
        System.out.println("Difference between dates:");
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Milliseconds: " + millis);
        System.out.println("Nanoseconds: " + nanos);




        // Alternatively, using ChronoUnit (more flexible if you only need specific units)
        long hours2 = ChronoUnit.HOURS.between(date1, date2);
        long minutes2 = ChronoUnit.MINUTES.between(date1, date2) % 60; // Total minutes modulo 60 to get minutes part
        // ... similar for other units if needed

        System.out.println("\nUsing ChronoUnit (example with hours and minutes):");
        System.out.println("Hours: " + hours2);
        System.out.println("Minutes: " + minutes2);

    }
}
