import java.util.TreeMap;

public class TreeTimeline {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline. 
        // The keys will be Integer (representing time points) and the values will be String (representing events/values).
        TreeMap<Integer, String> timeline = new TreeMap<>();

        // Associate values with keys (time points).
        timeline.put(1, "Event A");
        timeline.put(5, "Event B");
        timeline.put(3, "Event C"); // TreeMap automatically maintains sorted order based on keys.
        timeline.put(10, "Event D");

        // Print the timeline to verify the associations.
        System.out.println("Timeline:");
        for (Integer time : timeline.keySet()) {
            System.out.println("Time: " + time + ", Value: " + timeline.get(time));
        }


        // Example: Get the value associated with a specific time.
        String valueAtTime3 = timeline.get(3);
        if (valueAtTime3 != null) {
            System.out.println("\nValue at time 3: " + valueAtTime3);
        } else {
            System.out.println("\nNo value found at time 3.");
        }

        // Example: Handling potential nulls (if a key doesn't exist) using getOrDefault
        String valueAtTime7 = timeline.getOrDefault(7, "No event recorded"); // Provides a default value
        System.out.println("\nValue at time 7 (using getOrDefault): " + valueAtTime7);


        //Example: See if a key (time point) exists:
        if (timeline.containsKey(5)) {
            System.out.println("\nTime 5 is present in the timeline.");
        }



        // Example: Removing an entry:
        timeline.remove(5); // Remove "Event B"
        System.out.println("\nTimeline after removing time 5:");

        for (Integer time : timeline.keySet()) {
            System.out.println("Time: " + time + ", Value: " + timeline.get(time));
        }



    }
}
