import java.util.TreeSet;

public class TreeSetCeilingExample {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);


        // Example 1: Element present in the TreeSet
        int element1 = 30;
        Integer ceiling1 = treeSet.ceiling(element1); 
        System.out.println("Ceiling of " + element1 + ": " + ceiling1); // Output: 30 (because 30 itself is >= 30)

        // Example 2: Element not present, ceiling exists
        int element2 = 25;
        Integer ceiling2 = treeSet.ceiling(element2);
        System.out.println("Ceiling of " + element2 + ": " + ceiling2); // Output: 30 (smallest element >= 25)

        // Example 3: Element greater than all elements in the TreeSet
        int element3 = 60;
        Integer ceiling3 = treeSet.ceiling(element3);
        System.out.println("Ceiling of " + element3 + ": " + ceiling3); // Output: null (no element is >= 60)

        // Example 4: Handling null ceilings (important!)
        int element4 = 60;
        Integer ceiling4 = treeSet.ceiling(element4);
        if (ceiling4 != null) {
            System.out.println("Ceiling of " + element4 + ": " + ceiling4);
        } else {
            System.out.println("No element greater than or equal to " + element4 + " found."); // Output: No element...
        }

        // Example 5: Using ceiling with other data types (e.g., String)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String strElement = "apricot";
        String strCeiling = stringTreeSet.ceiling(strElement);
        System.out.println("Ceiling of \"" + strElement + "\": \"" + strCeiling + "\""); // Output: "banana"


        //Important Note: TreeSet stores elements in sorted order. The ceiling() method
        // leverages this sorted order to efficiently find the least element greater
        //than or equal to the given element (or null if no such element exists).
    }
}
