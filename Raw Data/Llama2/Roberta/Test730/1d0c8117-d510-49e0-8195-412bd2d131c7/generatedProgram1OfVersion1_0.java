import java.util.TreeSet;

public class TreeSetRemove {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original TreeSet: " + numbers);

        // Retrieve and remove the first element (lowest)
        Integer first = numbers.pollFirst(); 

        if (first != null) {
            System.out.println("Removed first element: " + first);
        } else {
            System.out.println("TreeSet is empty.");
        }

        System.out.println("TreeSet after removal: " + numbers);


         // Retrieve and remove the last element (highest)
        Integer last = numbers.pollLast();

        if (last != null) {
            System.out.println("Removed last element: " + last);
        } else {
            System.out.println("TreeSet is empty.");
        }

        System.out.println("TreeSet after removal: " + numbers);


        // Add some more elements for demonstration of removing a specific element
        numbers.add(60);
        numbers.add(70);

        // Remove a specific element (if present)
        boolean removed30 = numbers.remove(30); // Note: 30 was previously removed

        if (removed30) {
            System.out.println("Removed 30 from the TreeSet.");
        } else {
            System.out.println("30 was not found in the TreeSet."); // This will be printed now
        }


        boolean removed60 = numbers.remove(60);

        if (removed60) {
            System.out.println("Removed 60 from the TreeSet."); // This will be printed
        } else {
            System.out.println("60 was not found in the TreeSet."); 
        }
        System.out.println("TreeSet after removals: " + numbers);



    }
}
