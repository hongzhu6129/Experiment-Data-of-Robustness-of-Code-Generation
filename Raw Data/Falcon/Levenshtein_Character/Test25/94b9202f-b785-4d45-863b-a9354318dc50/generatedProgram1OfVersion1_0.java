import java.util.LinkedList;
import java.util.List;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the original linked list
        List<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // Method 1: Using the constructor
        List<Integer> copiedList1 = new LinkedList<>(originalList);

        // Method 2: Using addAll()
        List<Integer> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);

        // Method 3: Manual copy (for deeper copies if needed -  important for mutable objects)
        List<Integer> copiedList3 = new LinkedList<>();
        for (Integer item : originalList) {
            copiedList3.add(item); // In this case, autoboxing creates a new Integer, so it's a deep copy for the Integer objects.
        }


        // Print the lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Manual): " + copiedList3);


        // Demonstration for difference with mutable objects inside LinkedList
        List<StringBuilder> mutableList = new LinkedList<>();
        mutableList.add(new StringBuilder("A"));
        mutableList.add(new StringBuilder("B"));


        List<StringBuilder> shallowCopy = new LinkedList<>(mutableList);  //Shallow copy
        List<StringBuilder> deepCopy = new LinkedList<>();

        for (StringBuilder sb : mutableList) {
            deepCopy.add(new StringBuilder(sb)); // Creates new StringBuilders, effectively deep copy.
        }

        // Modify an element in original list to show the difference between shallow and deep copy
        mutableList.get(0).append(" Changed");

        System.out.println("Original List (Mutable): " + mutableList);
        System.out.println("Shallow Copy (Mutable): " + shallowCopy); // The change in the original affects shallow copy!
        System.out.println("Deep Copy (Mutable): " + deepCopy);     // Deep copy remains unaffected.
    }
}
