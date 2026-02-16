import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("apple");
        list2.add("orange");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("apple");
        list3.add("banana");
        list3.add("grape");


        // Method 1: Using equals() - checks for order and content equality
        System.out.println("Method 1: Using equals()");
        System.out.println("list1.equals(list2): " + list1.equals(list2)); // False (different order)
        System.out.println("list1.equals(list3): " + list1.equals(list3)); // False (different content)

        Collections.sort(list2);  // Sort list2 to match the order of list1
        System.out.println("list1.equals(list2) after sorting list2: " + list1.equals(list2)); // True

        // Method 2: Using containsAll() - checks if one list contains all elements of another (ignores order)
        System.out.println("\nMethod 2: Using containsAll()");
        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // True after sorting list2
        System.out.println("list2.containsAll(list1): " + list2.containsAll(list1)); // True after sorting list2

        // Example with different content
        System.out.println("list1.containsAll(list3): " + list1.containsAll(list3)); // False
        System.out.println("list3.containsAll(list1): " + list3.containsAll(list1)); // False


        // Method 3: Comparing sizes and then using removeAll() to find differences (also ignores order)
        System.out.println("\nMethod 3: Using size() and removeAll()");
        boolean isEqualIgnoringOrder = list1.size() == list2.size() && list1.containsAll(list2); // True after sorting list2

        ArrayList<String> list1Copy = new ArrayList<>(list1);
        list1Copy.removeAll(list3); // list1Copy now contains elements present in list1 but not in list3

        System.out.println("Differences between list1 and list3: " + list1Copy); // [orange]

        ArrayList<String> list3Copy = new ArrayList<>(list3);
        list3Copy.removeAll(list1);
        System.out.println("Differences between list3 and list1: " + list3Copy);  // [grape]


    }
}
