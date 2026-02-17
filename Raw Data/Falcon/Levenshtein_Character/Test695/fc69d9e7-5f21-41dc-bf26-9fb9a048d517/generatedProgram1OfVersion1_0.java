import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Populate list1
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        // Populate list2
        list2.add("banana");
        list2.add("apple");
        list2.add("grape");


        // 1. Check if lists are equal (order matters)
        System.out.println("Lists are equal (order matters): " + list1.equals(list2));


        // 2. Check if lists contain the same elements (order doesn't matter)
        Collections.sort(list1);  // Sort both lists to compare elements regardless of order
        Collections.sort(list2);
        System.out.println("Lists contain same elements (order doesn't matter): " + list1.equals(list2));


        // 3. Find common elements
        ArrayList<String> commonElements = new ArrayList<>(list1); // Create a copy of list1
        commonElements.retainAll(list2); // retainAll keeps only the elements that are also in list2
        System.out.println("Common elements: " + commonElements);



        // 4. Find elements unique to list1
        ArrayList<String> uniqueToList1 = new ArrayList<>(list1);
        uniqueToList1.removeAll(list2);  // removeAll removes elements present in list2 from list1 copy
        System.out.println("Elements unique to list1: " + uniqueToList1);

        // 5. Find elements unique to list2
        ArrayList<String> uniqueToList2 = new ArrayList<>(list2);
        uniqueToList2.removeAll(list1);
        System.out.println("Elements unique to list2: " + uniqueToList2);




        // Example with Integer ArrayLists:
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);

        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(4);


        Collections.sort(numbers1);
        Collections.sort(numbers2);
        System.out.println("Integer lists contain same elements (order doesn't matter): " + numbers1.equals(numbers2));



    }
}
