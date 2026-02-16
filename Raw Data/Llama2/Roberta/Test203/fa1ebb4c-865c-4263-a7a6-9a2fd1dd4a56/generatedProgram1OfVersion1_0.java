import java.util.TreeSet;

public class RemoveFromTreeSet {

    public static void main(String[] args) {

        // 1. Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2. Adding elements to the TreeSet (TreeSet automatically sorts)
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        System.out.println("Original TreeSet: " + numbers);

        // 3. Removing an element using remove()
        int elementToRemove = 8;
        boolean removed = numbers.remove(elementToRemove); 

        if (removed) {
            System.out.println(elementToRemove + " was removed successfully.");
        } else {
            System.out.println(elementToRemove + " was not found in the TreeSet.");
        }

        System.out.println("TreeSet after removal: " + numbers);


        // 4. Example: Trying to remove an element that doesn't exist
        int nonExistentElement = 10;
        boolean removed2 = numbers.remove(nonExistentElement);
        if(removed2) {
            System.out.println(nonExistentElement + " was removed successfully.");
        } else {
            System.out.println(nonExistentElement + " was not found in the TreeSet.");
        }

        System.out.println("TreeSet after second removal attempt: " + numbers);



        // 5. Removing the first (smallest) element using pollFirst()
        Integer smallest = numbers.pollFirst(); 
        if (smallest != null) {
            System.out.println("Smallest element removed: " + smallest);
        } else {
            System.out.println("The TreeSet is empty. Cannot remove the smallest element.");
        }
        System.out.println("TreeSet after pollFirst(): " + numbers);


        // 6. Removing the last (largest) element using pollLast()
        Integer largest = numbers.pollLast();
        if(largest != null) {
             System.out.println("Largest element removed: " + largest);
        } else {
            System.out.println("The TreeSet is empty. Cannot remove the largest element.");
        }
        System.out.println("TreeSet after pollLast(): " + numbers);




        // 7. Clearing the entire TreeSet (removing all elements).
        numbers.clear();
        System.out.println("TreeSet after clear(): " + numbers); // Output: []

        //8.  Demonstrates handling an empty TreeSet
        boolean removedFromEmptySet = numbers.remove(5);
        System.out.println("Result of removing from an empty TreeSet: "+ removedFromEmptySet); // Output: false because 5 is not present.

    }
}
