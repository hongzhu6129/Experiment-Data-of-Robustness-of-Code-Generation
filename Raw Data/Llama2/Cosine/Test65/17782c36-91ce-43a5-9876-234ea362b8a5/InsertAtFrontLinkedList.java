import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> myList = new LinkedList<>();

        // Add some initial elements (optional)
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        System.out.println("Original LinkedList: " + myList);

        // Element to insert at the front
        String newElement = "Grape";

        // Insert at the front using addFirst()
        myList.addFirst(newElement);


        System.out.println("LinkedList after inserting at front: " + myList);


        // Example with an Integer LinkedList
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(2);
        numberList.add(4);
        numberList.add(6);

        System.out.println("Original Number LinkedList: " + numberList);

        int newNumber = 0;  // Element to add
        numberList.addFirst(newNumber);

        System.out.println("Number LinkedList after inserting at front: " + numberList);


        //Illustrating edge case: Empty List
        LinkedList<String> emptyList = new LinkedList<>();
        System.out.println("Initially Empty List: " + emptyList);
        emptyList.addFirst("First Element");
        System.out.println("After adding to empty list: " + emptyList);


    }
}
