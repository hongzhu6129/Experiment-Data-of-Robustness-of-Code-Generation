import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create two LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Populate list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Populate list2
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Join list2 to the end of list1 (Method 1: Using addAll())
        list1.addAll(list2); 

        // Print the joined list
        System.out.println("Joined list (using addAll): " + list1);


        // Demonstrate an alternative using a new list (Method 2: Creating a new list)
        LinkedList<Integer> joinedList = new LinkedList<>(list1); // Start with a copy of list1
        // Note: We're re-using list1 from the previous example; if you wanted to
        // start from the original list1 and list2 you'd need to repopulate them
        
        for (Integer num : list2) {
            joinedList.add(num); // Add elements of list2 individually
        }

          System.out.println("Joined list (copying and iterating): " + joinedList);




        // Example with explicit joining node (Method 3:  If you need to join at a specific point)

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(10);
        list4.add(11);
        list4.add(12);

        // Join list4 after the second element (index 1) of list3
        int joinIndex = 1;
        for (int i = 0; i < list4.size(); i++) {
            list3.add(joinIndex + i, list4.get(i));
        }

        System.out.println("Joined list at specific index: " + list3);



    }
}
