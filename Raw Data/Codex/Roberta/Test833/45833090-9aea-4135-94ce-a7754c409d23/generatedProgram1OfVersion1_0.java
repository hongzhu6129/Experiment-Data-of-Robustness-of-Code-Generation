import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {

    public static void main(String[] args) {

        // Method 1: Using addAll()
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Grape");
        list2.add("Mango");
        list2.add("Pineapple");

        List<String> combinedList1 = new ArrayList<>(list1); // Create a copy to avoid modifying the original
        combinedList1.addAll(list2);


        System.out.println("Combined List (addAll): " + combinedList1);



        // Method 2: Using Java 8 Streams (More advanced, requires Java 8+)
        List<String> combinedList2 = new ArrayList<>();
        combinedList2.addAll(list1); // Start with the first list
        list2.stream().forEach(combinedList2::add); // Add elements from the second list using a stream


        System.out.println("Combined List (Streams): " + combinedList2);


         // Example with different data types (Integer)
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(4);


        List<Integer> combinedNumbers = new ArrayList<>(numbers1);
        combinedNumbers.addAll(numbers2);


        System.out.println("Combined Numbers: " + combinedNumbers);



        //Important Note:  addAll() modifies the list it's called on.  If you want to keep the original lists unchanged, create a new list and add the elements of the original lists to it.  This has been demonstrated in the provided examples.
    }
}
