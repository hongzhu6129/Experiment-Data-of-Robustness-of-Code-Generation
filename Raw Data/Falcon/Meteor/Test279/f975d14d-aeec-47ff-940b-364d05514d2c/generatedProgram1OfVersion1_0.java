import java.util.LinkedList;
import java.util.List;

public class JoinLists {

    public static void main(String[] args) {
        // Create two LinkedList objects
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        // Populate list1
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Populate list2
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");


        // Join list2 to list1 (list1 will be modified)
        list1.addAll(list2);

        // Print the combined list
        System.out.println("Joined List: " + list1);


        // Example with Integer lists:
        List<Integer> numList1 = new LinkedList<>();
        List<Integer> numList2 = new LinkedList<>();

        numList1.add(1);
        numList1.add(2);
        numList1.add(3);

        numList2.add(4);
        numList2.add(5);
        numList2.add(6);

        numList1.addAll(numList2);
        System.out.println("Joined Integer List: " + numList1);


        //  Demonstrating creating a new list to hold the joined result:
         List<String> combinedList = new LinkedList<>(list1); // Initialize with list1's contents
         combinedList.addAll(list2); // Add list2's elements. list1 and list2 remain unchanged

         System.out.println("Combined List (preserving originals): " + combinedList);


    }
}
