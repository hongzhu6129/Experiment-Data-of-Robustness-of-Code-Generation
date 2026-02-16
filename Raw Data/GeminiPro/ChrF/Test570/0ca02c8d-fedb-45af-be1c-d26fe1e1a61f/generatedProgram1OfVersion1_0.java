import java.util.ArrayList;
import java.util.List;

public class BesideArrayList {

    public static void main(String[] args) {
        // Example usage:

        // Create an ArrayList of integers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create another ArrayList of integers
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // "Beside" an ArrayList can be interpreted as concatenating 
        // or merging two ArrayLists.

        // Method 1: Using addAll()
        List<Integer> combinedList1 = new ArrayList<>(list1); // Create a copy to avoid modifying original list1
        combinedList1.addAll(list2); 

        System.out.println("Combined list using addAll(): " + combinedList1);

        // Method 2:  Creating a new list and adding elements from both
        List<Integer> combinedList2 = new ArrayList<>();
        combinedList2.addAll(list1);
        combinedList2.addAll(list2);

        System.out.println("Combined list by adding all elements: " + combinedList2);



        // Example with Strings:
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("a");
        stringList1.add("b");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("c");
        stringList2.add("d");

        List<String> combinedStringList = new ArrayList<>(stringList1);
        combinedStringList.addAll(stringList2);

        System.out.println("Combined string list: " + combinedStringList);


        // "Beside" could also be interpreted as creating a list of lists (nested list)
        List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(list1);
        nestedList.add(list2);

        System.out.println("Nested List: " + nestedList); 

    }
}
