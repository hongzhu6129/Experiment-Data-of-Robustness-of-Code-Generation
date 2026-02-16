import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyRemoval {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (timeline)
        TreeMap<Integer, String> timeline = new TreeMap<>();

        // Add some sample data
        timeline.put(1, "Event A");
        timeline.put(5, "Event B");
        timeline.put(2, "Event C");
        timeline.put(8, "Event D");
        timeline.put(3, "Event E");

        // Check if the timeline is empty
        if (timeline.isEmpty()) {
            System.out.println("Timeline is empty.");
            return;
        }

        // Get the greatest key
        Integer greatestKey = timeline.lastKey();

        // Get the value associated with the greatest key
        String value = timeline.get(greatestKey);

        // Remove the entry with the greatest key
        timeline.remove(greatestKey);

        // Print the removed key-value pair
        System.out.println("Removed entry: Key = " + greatestKey + ", Value = " + value);

        // Print the updated timeline
        System.out.println("Updated timeline: " + timeline);


        // Example demonstrating handling an empty TreeMap gracefully
        TreeMap<Integer, String> emptyTimeline = new TreeMap<>();
        if(emptyTimeline.isEmpty()){
            System.out.println("Empty timeline encountered. No element to remove.");
        } else {
            Integer gk = emptyTimeline.lastKey();
            String val = emptyTimeline.remove(gk);
            System.out.println("Removed from emptyTimeline: " + gk + ", " + val); //This won't execute as the map is empty.
        }




    }
}
