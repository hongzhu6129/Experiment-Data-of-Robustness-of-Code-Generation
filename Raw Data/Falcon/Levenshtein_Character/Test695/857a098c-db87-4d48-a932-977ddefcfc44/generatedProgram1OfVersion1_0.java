import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Example ArrayLists
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("apple");
        list2.add("grape");


        // 1. Check if lists are equal (order matters)
        System.out.println("Are lists equal (order matters)? " + list1.equals(list2)); // Output: false


        // 2. Check if lists contain the same elements (order doesn't matter)
        Collections.sort(list1);  // Sort both lists to compare content regardless of order
        Collections.sort(list2);

        System.out.println("Are lists equal (order doesn't matter)? " + list1.equals(list2)); // Output: false


        // 3. Find common elements
        List<String> commonElements = new ArrayList<>(list1); // Create a copy of list1
        commonElements.retainAll(list2); // retainAll modifies commonElements to keep only elements present in list2

        System.out.println("Common elements: " + commonElements); // Output: [apple, banana]



        // 4. Find elements present in list1 but not in list2
        List<String> list1Unique = new ArrayList<>(list1);
        list1Unique.removeAll(list2);


        System.out.println("Elements in list1 but not in list2: " + list1Unique); // Output: [orange]



        // 5. Find elements present in list2 but not in list1
        List<String> list2Unique = new ArrayList<>(list2);
        list2Unique.removeAll(list1);

        System.out.println("Elements in list2 but not in list1: " + list2Unique); // Output: [grape]



        // 6. Check if list1 is a subset of list2 (all elements of list1 are present in list2)
        System.out.println("Is list1 a subset of list2? " + list2.containsAll(list1)); // Output: false


        // 7. Check if list2 is a subset of list1
        System.out.println("Is list2 a subset of list1? " + list1.containsAll(list2)); // Output: false


        //8.  Combine two ArrayLists (Concatenate)
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);

        System.out.println("Combined List: " + combinedList);  //Output: [apple, banana, orange, apple, banana, grape]

        // OR (more concise but modifies list1 if you don't create a copy first)
        // list1.addAll(list2);
        // System.out.println("Combined List (modifying list1): " + list1);




    }
}
