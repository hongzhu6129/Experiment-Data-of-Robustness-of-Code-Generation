import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create the second linked list
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        // Method 1: Using addAll() (most efficient)
        LinkedList<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original
        joinedList1.addAll(list2); 
        System.out.println("Joined List (addAll): " + joinedList1);


        // Method 2: Iterating and adding (less efficient)
        LinkedList<String> joinedList2 = new LinkedList<>(list1);  // Create a copy
        for (String item : list2) {
            joinedList2.add(item);
        }
        System.out.println("Joined List (Iteration): " + joinedList2);
    }
}
