import java.util.LinkedList;
import java.util.Collections;

public class SwapLinkedListElements {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original LinkedList: " + list);

        // Swap elements at index 1 and 3
        int index1 = 1;
        int index2 = 3;

        // Check for valid indices
        if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {
           Collections.swap(list, index1, index2); // Use Collections.swap for efficiency


            System.out.println("LinkedList after swapping: " + list);

        } else {
            System.out.println("Invalid indices for swapping.");
        }


         //Example with a LinkedList of Integers:
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);


        System.out.println("Original Integer LinkedList: " + intList);

        int intIndex1 = 0;
        int intIndex2 = 2;

         if (intIndex1 >= 0 && intIndex1 < intList.size() && intIndex2 >= 0 && intIndex2 < intList.size()) {
           Collections.swap(intList, intIndex1, intIndex2); 

            System.out.println("Integer LinkedList after swapping: " + intList);

        } else {
            System.out.println("Invalid indices for swapping.");
        }


    }
}
