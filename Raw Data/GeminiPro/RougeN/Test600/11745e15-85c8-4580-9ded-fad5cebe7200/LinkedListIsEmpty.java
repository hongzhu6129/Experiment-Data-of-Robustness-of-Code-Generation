import java.util.LinkedList;

public class LinkedListIsEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> myList = new LinkedList<>();

        // Check if the list is empty
        boolean isEmpty = myList.isEmpty();

        if (isEmpty) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }


        // Add some elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Check if the list is empty again
        isEmpty = myList.isEmpty();

        if (isEmpty) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }



        //Example with Integer LinkedList
         LinkedList<Integer> numberList = new LinkedList<>();
         if (numberList.isEmpty()) {
            System.out.println("The integer linked list is empty."); //This will print
        }


        numberList.add(1);
        numberList.add(2);

        if (numberList.isEmpty()) {
            System.out.println("The integer linked list is empty."); 
        } else {
             System.out.println("The integer linked list is not empty."); //This will print
        }
    }
}
