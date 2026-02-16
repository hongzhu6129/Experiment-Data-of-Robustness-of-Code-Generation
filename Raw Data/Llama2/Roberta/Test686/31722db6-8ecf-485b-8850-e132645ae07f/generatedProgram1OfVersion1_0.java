import java.util.Comparator;
import java.util.TreeMap;

public class TreeTimelineSorter {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<String, String> timeline = new TreeMap<>(new TreeTimelineSorter()::compare); // Use method reference for Comparator

        timeline.put("2024-03-15", "Event C");
        timeline.put("2023-10-20", "Event A");
        timeline.put("2024-01-05", "Event B");


        // Print the sorted timeline
        for (String key : timeline.keySet()) {
            System.out.println(key + ": " + timeline.get(key));
        }

    }



    public int compare(String key1, String key2) {

        // Parse the dates into year, month, and day components for accurate comparison
        String[] parts1 = key1.split("-");
        String[] parts2 = key2.split("-");

        int year1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int day1 = Integer.parseInt(parts1[2]);
        
        int year2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int day2 = Integer.parseInt(parts2[2]);

        // Compare years
        int yearComparison = Integer.compare(year1, year2);
        if (yearComparison != 0) {
            return yearComparison;
        }

        // If years are equal, compare months
        int monthComparison = Integer.compare(month1, month2);
        if (monthComparison != 0) {
            return monthComparison;
        }

        // If years and months are equal, compare days
        return Integer.compare(day1, day2);

    }
}
