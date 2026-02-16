import java.util.LinkedList;

public class LinkedListEmptyCheck {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> list1 = new LinkedList<>();

        // Check if the linked list is empty
        if (list1.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list is not empty");
        }

        // Add some elements to the linked list
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Check if the linked list is empty again
        if (list1.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list is not empty");
        }


        //Demonstrate with another list initially containing elements:
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("apple");
        list2.add("banana");

        if (list2.isEmpty()) {
            System.out.println("Linked list 2 is empty");
        } else {
            System.out.println("Linked list 2 is not empty");
        }


        //And another which we empty during the program:

        LinkedList<Double> list3 = new LinkedList<>();
        list3.add(1.1);
        list3.add(2.2);


         if (list3.isEmpty()) {
            System.out.println("Linked list 3 is empty");
        } else {
            System.out.println("Linked list 3 is not empty");
        }

        list3.clear(); // Empty the list


         if (list3.isEmpty()) {
            System.out.println("Linked list 3 is empty");
        } else {
            System.out.println("Linked list 3 is not empty");
        }
    }
}
