import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Example ArrayLists
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("grape");


        // 1. Check if lists are equal (same elements in the same order)
        boolean isEqual = list1.equals(list2);
        System.out.println("Lists are equal (order matters): " + isEqual);


        // 2. Check if lists contain the same elements (order doesn't matter)

        boolean containsSameElements = list1.containsAll(list2) && list2.containsAll(list1);
        System.out.println("Lists contain the same elements (order doesn't matter): " + containsSameElements);


        // 3. Find common elements
        List<String> commonElements = new ArrayList<>(list1); // Create a copy to avoid modifying the original
        commonElements.retainAll(list2); // retainAll() keeps only the common elements

        System.out.println("Common elements: " + commonElements);



        // 4. Find differences (elements in list1 but not in list2)
        List<String> difference1 = new ArrayList<>(list1);
        difference1.removeAll(list2);

        System.out.println("Elements in list1 but not in list2: " + difference1);


        // 5. Find differences (elements in list2 but not in list1)
        List<String> difference2 = new ArrayList<>(list2);
        difference2.removeAll(list1);

        System.out.println("Elements in list2 but not in list1: " + difference2);




        // Example with Integer ArrayLists (demonstrating comparison of Integer objects)
        List<Integer> numList1 = new ArrayList<>();
        numList1.add(10);
        numList1.add(20);
        numList1.add(30);


        List<Integer> numList2 = new ArrayList<>();
        numList2.add(10);
        numList2.add(30);
        numList2.add(20); // Different order


        boolean numListEqualOrderMatters = numList1.equals(numList2); // false, order is different
        boolean numListEqualOrderDoesntMatter = numList1.containsAll(numList2) && numList2.containsAll(numList1); // true, same elements



        System.out.println("Integer lists equal (order matters): " + numListEqualOrderMatters);
        System.out.println("Integer lists equal (order doesn't matter): "+ numListEqualOrderDoesntMatter);



    }
}
