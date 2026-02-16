import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        // Create the second linked list
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");

        // Method 1: Using addAll() to join lists
        LinkedList<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying original list1
        joinedList1.addAll(list2); 
        System.out.println("Joined List 1 (addAll): " + joinedList1);


        // Method 2: Iterating and adding elements individually
        LinkedList<String> joinedList2 = new LinkedList<>(list1);  // Create a copy
        for (String element : list2) {
            joinedList2.add(element);
        }
        System.out.println("Joined List 2 (Iteration): " + joinedList2);


        // Example demonstrating joining into the first list directly (modifies list1)
        list1.addAll(list2);  // This modifies the original list1
        System.out.println("Modified List 1 (addAll - Direct Modification): " + list1);



    }
}
