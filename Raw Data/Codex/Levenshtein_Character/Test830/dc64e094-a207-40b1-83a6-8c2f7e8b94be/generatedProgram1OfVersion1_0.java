import java.time.Duration;
import java.time.Instant;

public class UserTime {

    private static Instant startTime;

    public static void startTracking() {
        startTime = Instant.now();
    }

    public static void displayUserTime() {
        if (startTime == null) {
            System.out.println("Tracking hasn't started yet.");
            return;
        }

        Instant endTime = Instant.now();
        Duration elapsedTime = Duration.between(startTime, endTime);

        long seconds = elapsedTime.getSeconds();
        long milliseconds = elapsedTime.toMillisPart(); // Java 9+ for millisecond part directly

        // Format the output nicely
        String formattedTime = String.format("%d seconds, %d milliseconds", seconds, milliseconds);
        System.out.println("Elapsed user time: " + formattedTime);

    }


    public static void main(String[] args) throws InterruptedException {

        // Test case 1: Basic usage
        startTracking();
        Thread.sleep(2500);  // Simulate some work (2.5 seconds)
        displayUserTime();



        // Test case 2: Immediate display
        startTracking();
        displayUserTime();  // Should show very little time


        // Test case 3:  No tracking started
        startTime = null; // Reset startTime
        displayUserTime(); // Should handle the case where tracking hasn't begun

        // Test case 4: Longer duration
        startTracking();
        Thread.sleep(10500); // Simulate longer work (10.5 seconds)
        displayUserTime();

        // Test case 5: Sub-millisecond timings (not reliably measurable)
        startTracking();
        displayUserTime();


    }
}
