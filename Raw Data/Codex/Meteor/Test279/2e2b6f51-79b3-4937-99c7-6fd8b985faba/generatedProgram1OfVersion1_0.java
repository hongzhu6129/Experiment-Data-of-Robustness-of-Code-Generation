import java.util.LinkedList;
import java.util.List;

public class JoinLists {

    public static void main(String[] args) {
        // Create two LinkedList objects
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        // Add elements to the first list
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Add elements to the second list
        list2.add("Grape");
        list2.add("Mango");
        list2.add("Pineapple");


        // Join the two lists - Method 1: Using addAll()
        List<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original
        joinedList1.addAll(list2); 

        System.out.println("Joined List (using addAll): " + joinedList1);



        //Join the two lists - Method 2: Iterating and adding
        List<String> joinedList2 = new LinkedList<>();
        for (String item : list1) {
            joinedList2.add(item);
        }
        for (String item : list2) {
            joinedList2.add(item);
        }

        System.out.println("Joined List (using iteration): " + joinedList2);



       // Join the two lists - Method 3: Java 8 Stream API (requires Java 8 or later)  
        List<String> joinedList3 = new LinkedList<>();
        list1.stream().forEach(joinedList3::add);
        list2.stream().forEach(joinedList3::add);

        System.out.println("Joined List (using streams): " + joinedList3);
    }
}
