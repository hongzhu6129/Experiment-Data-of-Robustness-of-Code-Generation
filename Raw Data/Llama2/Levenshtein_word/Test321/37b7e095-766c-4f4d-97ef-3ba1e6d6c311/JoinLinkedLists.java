import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create two LinkedLists
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // Populate list1
        list1.add("A");
        list1.add("B");
        list1.add("C");

        // Populate list2
        list2.add("D");
        list2.add("E");
        list2.add("F");

        // Method 1: Using addAll() - appends list2 to the end of list1
        LinkedList<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original list1
        joinedList1.addAll(list2); 

        System.out.println("Joined List (addAll): " + joinedList1);


        // Method 2: Iterating and adding elements individually - more control, allows insertion at any point
        LinkedList<String> joinedList2 = new LinkedList<>(list1); // Create a copy
        for (String element : list2) {
            joinedList2.add(element); // Add each element of list2 to joinedList2
        }

        System.out.println("Joined List (Iteration): " + joinedList2);



        //Example: Inserting list2 at a specific index (e.g., index 2) in list1
        LinkedList<String> joinedList3 = new LinkedList<>(list1); // Create a copy
        joinedList3.addAll(2, list2); // Inserts list2 at index 2

         System.out.println("Joined List (Insertion at Index): " + joinedList3);

    }
}
