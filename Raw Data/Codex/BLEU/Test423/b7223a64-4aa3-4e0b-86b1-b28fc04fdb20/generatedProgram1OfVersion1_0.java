import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeTimeline {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<String, String> timeline = new TreeMap<>(new SortTreeTimeline().new TimelineComparator());

        timeline.put("2023-10-27", "Event A");
        timeline.put("2023-10-26", "Event B");
        timeline.put("2023-10-28", "Event C");
        timeline.put("2023-10-26 10:00", "Event D"); // More precise timestamps also work
        timeline.put("2023-10-26 09:00", "Event E");

        // Print the sorted timeline
        for (String key : timeline.keySet()) {
            System.out.println(key + ": " + timeline.get(key));
        }
    }



    class TimelineComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
           return s1.compareTo(s2); // Use String's natural ordering for date-like strings
        }
    }


}
