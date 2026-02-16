import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("date");


        // Convert LinkedList to ArrayList (Sophisticated List in this context)
        List<String> arrayList = new ArrayList<>(linkedList);


        // Print the ArrayList (demonstrating the conversion)
        System.out.println("ArrayList: " + arrayList);


        // Example of using ArrayList features (demonstrating sophistication)
        // 1. Accessing elements by index:
        System.out.println("Element at index 2: " + arrayList.get(2));

        // 2. Adding an element at a specific index:
        arrayList.add(1, "grape"); // Inserts "grape" at index 1
        System.out.println("ArrayList after insertion: " + arrayList);

        // 3. Removing an element by index:
        arrayList.remove(0);  // Removes the element at index 0 ("apple" in this case)
        System.out.println("ArrayList after removal: " + arrayList);


         //4. Checking if an element exists:
        System.out.println("Contains 'banana'? " + arrayList.contains("banana"));


        // 5. Getting the size of the ArrayList:
        System.out.println("Size of ArrayList: " + arrayList.size());



    }
}
