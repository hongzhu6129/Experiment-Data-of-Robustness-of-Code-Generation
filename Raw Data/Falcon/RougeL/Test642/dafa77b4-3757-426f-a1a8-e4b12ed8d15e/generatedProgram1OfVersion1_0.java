import java.util.ArrayList;
import java.util.List;

public class TrackElement {

    public static void main(String[] args) {
        // Sample ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(10); // Duplicate element
        numbers.add(30);


        // Element to track
        int target = 10;

        // Track and print occurrences
        trackElement(numbers, target);


        //Example using contains() to check if an element exists
        if (numbers.contains(target)) {
            System.out.println(target + " exists in the ArrayList.");
        } else {
            System.out.println(target + " does not exist in the ArrayList.");
        }

        // Example using indexOf() to find the first occurrence:
        int firstIndex = numbers.indexOf(target);
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
        } else {
            System.out.println(target + " not found in the list.");
        }

        // Example using lastIndexOf() to find the last occurrence:
        int lastIndex = numbers.lastIndexOf(target);
        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }

    public static void trackElement(List<Integer> list, int target) {
        System.out.println("Tracking element: " + target);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                System.out.println("Found " + target + " at index: " + i);
            }
        }

        if (!list.contains(target)){ //using contains for a final check (if not found)
            System.out.println(target + " is not present in the list.");
        }
    }
}
