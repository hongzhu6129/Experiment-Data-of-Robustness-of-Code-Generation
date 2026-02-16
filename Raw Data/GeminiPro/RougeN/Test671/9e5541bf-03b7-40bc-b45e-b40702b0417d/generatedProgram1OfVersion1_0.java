import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TimelineKeys {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline (key: ZonedDateTime, value: any object)
        TreeMap<ZonedDateTime, String> timeline = new TreeMap<>();

        // Populate the timeline with some sample data
        timeline.put(ZonedDateTime.of(2024, 3, 15, 10, 0, 0, 0, ZoneId.of("UTC")), "Event 1");
        timeline.put(ZonedDateTime.of(2024, 3, 20, 12, 0, 0, 0, ZoneId.of("UTC")), "Event 2");
        timeline.put(ZonedDateTime.of(2024, 3, 25, 9, 0, 0, 0, ZoneId.of("UTC")), "Event 3");
        timeline.put(ZonedDateTime.of(2024, 4, 5, 15, 0, 0, 0, ZoneId.of("UTC")), "Event 4");


        // Get a NavigableSet view of the keys (ZonedDateTime objects)
        NavigableSet<ZonedDateTime> keys = timeline.navigableKeySet();

        // Print the keys
        System.out.println("Keys in the timeline:");
        for (ZonedDateTime key : keys) {
            System.out.println(key); // Or format as needed
        }


        // Example of using NavigableSet methods:

        // Find the first (earliest) key
        ZonedDateTime firstKey = keys.first();
        System.out.println("\nFirst key: " + firstKey);

        // Find the last (latest) key
        ZonedDateTime lastKey = keys.last();
        System.out.println("Last key: " + lastKey);

        // Find the key equal to or immediately before a specific time
        ZonedDateTime beforeKey = keys.floor(ZonedDateTime.of(2024, 3, 22, 0, 0, 0, 0, ZoneId.of("UTC")));
        System.out.println("Key before 2024-03-22: " + beforeKey);



        // Find the key immediately after a specific time
        ZonedDateTime afterKey = keys.higher(ZonedDateTime.of(2024, 3, 20, 12,0,0,0, ZoneId.of("UTC")));
        System.out.println("Key after 2024-03-20 12:00: " + afterKey);


    }
}
