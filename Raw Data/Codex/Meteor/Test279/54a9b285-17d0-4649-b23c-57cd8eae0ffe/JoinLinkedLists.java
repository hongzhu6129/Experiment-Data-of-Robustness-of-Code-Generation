import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);


        // Method 1: Using addAll() - most efficient
        LinkedList<Integer> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original
        joinedList1.addAll(list2);

        System.out.println("Joined List (addAll): " + joinedList1);



        // Method 2: Iterating and adding elements individually
        LinkedList<Integer> joinedList2 = new LinkedList<>(list1); // Copy again

        for (Integer element : list2) {
            joinedList2.add(element);
        }

        System.out.println("Joined List (Iteration): " + joinedList2);


        //Method 3: Java 8 Streams (less efficient for LinkedLists but shown for completeness)
         LinkedList<Integer> joinedList3 = new LinkedList<>();
         joinedList3.addAll(list1);
         list2.stream().forEach(joinedList3::add);
        System.out.println("Joined List (Streams): " + joinedList3);



    }
}
