import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TimelineKeys {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline. 
        // The keys are Instants (representing points in time) and the values can be any relevant data.
        TreeMap<Instant, String> timeline = new TreeMap<>();

        // Add some events to the timeline
        timeline.put(Instant.now(), "Event 1");
        timeline.put(Instant.now().plusSeconds(60), "Event 2");
        timeline.put(Instant.now().minusSeconds(30), "Event 3");
        timeline.put(Instant.now().plusSeconds(120), "Event 4");

        // Get a NavigableSet view of the keys (Instants)
        NavigableSet<Instant> instants = timeline.navigableKeySet();

        // Print the Instants
        System.out.println("Instants in the timeline:");
        for (Instant instant : instants) {
            System.out.println(instant); // Prints the Instant in UTC

            // Convert Instant to a more readable format (e.g., LocalDateTime in your local timezone)
            LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println(localDateTime); 

            // Or, if you need to retain timezone information:
            ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println(zonedDateTime);

             System.out.println("--------"); // Separator for clarity
        }


        // Demonstrate some NavigableSet operations (optional)
        System.out.println("\nNavigableSet Operations:");
        Instant firstInstant = instants.first();  // Earliest instant
        Instant lastInstant = instants.last(); // Latest Instant
        Instant instantBefore = instants.lower(Instant.now());  // Instant before 'now'
        Instant instantAfter = instants.higher(Instant.now()); // Instant after 'now'


        System.out.println("First Instant: " + firstInstant);
        System.out.println("Last Instant: " + lastInstant);

        if (instantBefore != null) {
             System.out.println("Instant before 'now': " + instantBefore);
        }

        if(instantAfter != null) {
            System.out.println("Instant after 'now': " + instantAfter);
        }
    }
}
