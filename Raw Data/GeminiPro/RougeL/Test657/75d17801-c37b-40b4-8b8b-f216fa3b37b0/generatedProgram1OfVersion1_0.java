import java.util.TreeMap;

public class TreeTimelineSearch {

    public static void main(String[] args) {
        // Create a TreeMap to represent the timeline.
        // The keys are timestamps (e.g., years, milliseconds since epoch), 
        // and the values are the events associated with those timestamps.
        TreeMap<Integer, String> timeline = new TreeMap<>();

        // Populate the timeline with some sample data
        timeline.put(1950, "Event A");
        timeline.put(1960, "Event B");
        timeline.put(1975, "Event C");
        timeline.put(1980, "Event D");
        timeline.put(2000, "Event E");
        timeline.put(2010, "Event F");


        // Search for a specific value (event)
        String searchValue = "Event C";
        Integer searchKey = null; 

        for (Integer key : timeline.keySet()) {  // Iterate to find the key
            if (timeline.get(key).equals(searchValue)) {
                searchKey = key;
                break; // Exit loop once found
            }
        }


        if (searchKey != null) {
            System.out.println(searchValue + " found at timestamp: " + searchKey);
        } else {
            System.out.println(searchValue + " not found in the timeline.");
        }


        // Search for an event at or before a specific time (floorEntry)
        int searchTime1 = 1978;
        Integer floorKey = timeline.floorKey(searchTime1); // Key equal or less
        if (floorKey != null) {
            System.out.println("Event at or before " + searchTime1 + ": " + timeline.get(floorKey) + " (Time: " + floorKey + ")");
        } else {
            System.out.println("No events found at or before " + searchTime1);
        }

        // Search for an event at or after a specific time (ceilingEntry)
        int searchTime2 = 1978;
        Integer ceilingKey = timeline.ceilingKey(searchTime2);  // key equal or greater
         if (ceilingKey != null) {
            System.out.println("Event at or after " + searchTime2 + ": " + timeline.get(ceilingKey) + " (Time: " + ceilingKey + ")");
        } else {
            System.out.println("No events found at or after " + searchTime2);
        }

    }
}
