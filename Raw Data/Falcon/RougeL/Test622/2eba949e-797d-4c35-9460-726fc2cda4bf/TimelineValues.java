import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TimelineValues {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline (key: date, value: event)
        NavigableMap<LocalDate, String> timeline = new TreeMap<>();

        // Add some events to the timeline
        timeline.put(LocalDate.of(2024, Month.JANUARY, 15), "Event A");
        timeline.put(LocalDate.of(2024, Month.FEBRUARY, 20), "Event B");
        timeline.put(LocalDate.of(2024, Month.MARCH, 10), "Event C");
        timeline.put(LocalDate.of(2024, Month.APRIL, 5), "Event D");

        // Get a Collection view of the values (events)
        Collection<String> values = timeline.values();

        // Print the values (events)
        System.out.println("Timeline Events:");
        for (String event : values) {
            System.out.println(event);
        }
    }
}
