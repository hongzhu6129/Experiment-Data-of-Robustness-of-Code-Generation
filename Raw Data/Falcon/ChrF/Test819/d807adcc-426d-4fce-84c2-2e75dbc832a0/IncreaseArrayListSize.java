import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreaseArrayListSize {

    public static void main(String[] args) {
        // Method 1: Using ensureCapacity() - Most efficient if you know the final size beforehand
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println("Initial size of list1: " + list1.size()); // Output: 2

        // Increase capacity to hold at least 10 elements (doesn't change size, just allocates memory)
        list1.ensureCapacity(10); 
        System.out.println("Size of list1 after ensureCapacity(10): " + list1.size()); // Output: 2 (size remains same)

        // Add more elements
        for (int i = 3; i <= 5; i++) {
            list1.add(i);
        }
        System.out.println("Size of list1 after adding more elements: " + list1.size()); // Output: 5


        // Method 2: Using addAll() with a larger collection -  useful if adding many elements from another source
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        System.out.println("Initial size of list2: " + list2.size()); // Output: 2

        // Create a larger list with extra capacity
        List<Integer> largerList = new ArrayList<>(Collections.nCopies(5, 0)); // Creates a list of 5 zeros
        System.out.println("Size of largerList: " + largerList.size()); // Output: 5

        // Add all elements of list2 to largerList
        largerList.addAll(list2); 
        System.out.println("Size of largerList after addAll(): " + largerList.size()); // Output: 7



        // Method 3: Creating a new ArrayList with larger capacity and copying existing elements - least efficient, mainly for legacy compatibility or very specific needs.

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(100);
        list3.add(200);
        System.out.println("Initial size of list3: " + list3.size()); // Output: 2

        ArrayList<Integer> largerList3 = new ArrayList<>(10); // Create a new list with initial capacity 10
        largerList3.addAll(list3); // copy the existing list 
        System.out.println("Size of largerList3: " + largerList3.size()); // Output: 2 (Size is still 2, but capacity is larger)

    }
}
