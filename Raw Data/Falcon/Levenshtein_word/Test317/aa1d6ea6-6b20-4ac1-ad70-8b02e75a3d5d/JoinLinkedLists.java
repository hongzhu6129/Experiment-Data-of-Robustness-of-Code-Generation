import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create two LinkedLists
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // Populate list1
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Populate list2
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");


        // Method 1: Using addAll() - most efficient
        LinkedList<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original
        joinedList1.addAll(list2); 

        System.out.println("Joined List (addAll): " + joinedList1);


        // Method 2: Using a loop (less efficient, demonstrates iteration)
        LinkedList<String> joinedList2 = new LinkedList<>(list1); // Create a copy

        for (String item : list2) {
            joinedList2.add(item);
        }

        System.out.println("Joined List (loop): " + joinedList2);



        // Method 3: Using Java Stream API (Java 8+) -  can be efficient for very large lists
        //  More advanced, not necessary for basic joining
        LinkedList<String> joinedList3 = new LinkedList<>();
        list1.stream().forEach(joinedList3::add);
        list2.stream().forEach(joinedList3::add);

         System.out.println("Joined List (Stream API): " + joinedList3);


        //Important considerations when joining Linked Lists:
        System.out.println("\n---Important Considerations---");

        // 1. Modifying the original list:  addAll() modifies the list it's called on.
        // Create a copy first if you need to preserve the original lists.  We demonstrated this above.

        //Example of modifying the original:
        list1.addAll(list2);
        System.out.println("list1 after addAll (original modified): " + list1);



        // 2. Joining at a specific position (not just the end)
        LinkedList<String> list4 = new LinkedList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");

        LinkedList<String> list5 = new LinkedList<>();
        list5.add("X");
        list5.add("Y");

        // Insert list5 at index 2 of list4:
        list4.addAll(2, list5); // list4 becomes [A, B, X, Y, C]

        System.out.println("Joining at specific index: " + list4);




    }
}
