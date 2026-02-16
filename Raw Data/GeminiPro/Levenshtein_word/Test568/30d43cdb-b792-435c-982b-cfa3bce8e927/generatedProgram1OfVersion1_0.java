import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {

    public static void main(String[] args) {
        // Create the first ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Create the second ArrayList
        List<String> list2 = new ArrayList<>();
        list2.add("Grape");
        list2.add("Mango");
        list2.add("Pineapple");


        // Method 1: Using addAll() - Most efficient
        List<String> joinedList1 = new ArrayList<>(list1); // Create a copy to avoid modifying the original
        joinedList1.addAll(list2);

        System.out.println("Joined List (addAll): " + joinedList1);


        // Method 2: Iterating and adding - Less efficient
        List<String> joinedList2 = new ArrayList<>();
        for (String item : list1) {
            joinedList2.add(item);
        }
        for (String item : list2) {
            joinedList2.add(item);
        }
        System.out.println("Joined List (Iteration): " + joinedList2);


        // Method 3: Using Java 8 Streams (More advanced, functional approach)
        List<String> joinedList3 = new ArrayList<>();
        list1.stream().forEach(joinedList3::add); // Add list1 elements
        list2.stream().forEach(joinedList3::add); // Add list2 elements

        System.out.println("Joined List (Streams): " + joinedList3);
    }
}
