import java.time.LocalDateTime;
import java.time.Month;
import java.util.TreeMap;

public class CheckTimelineMapping {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline.
        // Keys are LocalDateTime objects (representing points in time), 
        // and values are Strings (representing events or data associated with those times).
        TreeMap<LocalDateTime, String> timeline = new TreeMap<>();

        // Populate the timeline with some sample data.
        timeline.put(LocalDateTime.of(2024, Month.JANUARY, 15, 10, 0), "Event A");
        timeline.put(LocalDateTime.of(2024, Month.FEBRUARY, 20, 12, 30), "Event B");
        timeline.put(LocalDateTime.of(2024, Month.MARCH, 10, 8, 45), "Event C");


        // Value to search for.
        String searchValue = "Event B";

        // Test if the timeline contains a mapping for the specified value.
        boolean containsValue = timeline.containsValue(searchValue);

        // Print the result.
        if (containsValue) {
            System.out.println("The timeline contains a mapping for the value: " + searchValue);

            // Find the key associated with the value (optional):
            for (LocalDateTime key : timeline.keySet()) {
                if (timeline.get(key).equals(searchValue)) {
                    System.out.println("The value is associated with the time: " + key);
                    break;  // Stop once the key is found.
                }
            }
        } else {
            System.out.println("The timeline does not contain a mapping for the value: " + searchValue);
        }



        // Test for a value not in the timeline:
        searchValue = "Event D"; 
         containsValue = timeline.containsValue(searchValue);
        if (containsValue) {
            System.out.println("The timeline contains a mapping for the value: " + searchValue);
        } else {
            System.out.println("The timeline does not contain a mapping for the value: " + searchValue);
        }

    }
}
