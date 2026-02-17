import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create two linked lists
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");

        // Method 1: Using addAll() -  most efficient
        LinkedList<String> joinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying original list1
        joinedList1.addAll(list2); 

        System.out.println("Joined List (addAll): " + joinedList1);


        // Method 2: Iterating and adding elements - less efficient
        LinkedList<String> joinedList2 = new LinkedList<>(list1); // Create a copy 
        for (String element : list2) {
            joinedList2.add(element);
        }

        System.out.println("Joined List (Iteration): " + joinedList2);


        //Method 3: Using Java Stream API (Java 8+) - Another efficient approach
        LinkedList<String> joinedList3 = new LinkedList<>();
        list1.stream().forEach(joinedList3::add);
        list2.stream().forEach(joinedList3::add);

        System.out.println("Joined List (Stream API): " + joinedList3);



    }
}
