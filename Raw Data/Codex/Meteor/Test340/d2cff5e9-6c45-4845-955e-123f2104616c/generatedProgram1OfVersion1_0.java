import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Populate list1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // Populate list2
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        // 1. Check if lists are equal using equals()
        boolean isEqual = list1.equals(list2);
        System.out.println("Are lists equal using equals(): " + isEqual);  // Output: true

        // Modify list2 to demonstrate inequality
        list2.add(5); 
        isEqual = list1.equals(list2);
        System.out.println("Are lists equal after modification: " + isEqual); // Output: false


        // Reset list2 for the next comparison (remove the added 5)
        list2.remove(Integer.valueOf(5)); // Remove the Integer object with value 5

         // 2. Compare using Collections.disjoint() - checks for *no* common elements
        boolean disjoint = Collections.disjoint(list1, list2); 
        System.out.println("Are lists disjoint (no common elements): " + disjoint); // Output: false (because they *do* have common elements)


        // Example where disjoint is true:
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(7);
        disjoint = Collections.disjoint(list1, list3);
        System.out.println("Are list1 and list3 disjoint: " + disjoint); // Output: true



        // 3.  Check for containment -  Does list1 contain all elements of list2 (and vice-versa)?

        boolean containsAll = list1.containsAll(list2); // Does list1 contain everything in list2?
        System.out.println("Does list1 contain all elements of list2: " + containsAll); // Output: true (initially)

        list2.add(5);  // Add an element to list2
        containsAll = list1.containsAll(list2);
        System.out.println("Does list1 contain all elements of list2 (after modification): " + containsAll); // Output: false

         // ... and the reverse check:
         containsAll = list2.containsAll(list1);
         System.out.println("Does list2 contain all elements of list1 (after modification): " + containsAll); // Output: true (list2 is now a superset)





    }
}
