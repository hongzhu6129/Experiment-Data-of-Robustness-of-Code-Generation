import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Initial LinkedList: " + languages);

        // Method 1: Using clear() method (most efficient)
        languages.clear(); 

        System.out.println("LinkedList after clear(): " + languages);


        // Re-populate the list for demonstrating other methods
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");



        // Method 2: Using removeAll() method (less efficient for clearing the entire list)
        languages.removeAll(languages); // Removes all elements that are in the list itself.

        System.out.println("LinkedList after removeAll(): " + languages);


         // Re-populate the list for demonstrating the iterative method
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");



        // Method 3: Iterative Removal (Less efficient, mainly for educational purposes)
        while (!languages.isEmpty()) {
            languages.removeFirst(); // or removeLast() depending on which end you want to remove from
        }

        System.out.println("LinkedList after iterative removal: " + languages);



        //Important Note:  For simply clearing an entire LinkedList, the clear() method is the most efficient approach.  The other methods are provided for educational purposes to show alternative ways to manipulate the LinkedList.  removeAll() is generally used to remove a specific set of elements, not necessarily the entire contents.  The iterative approach is primarily to demonstrate the basic operations of removing elements one by one, which can be helpful for understanding how LinkedLists work internally.
    }
}
