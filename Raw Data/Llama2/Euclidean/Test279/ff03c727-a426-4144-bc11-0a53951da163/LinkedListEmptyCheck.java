import java.util.LinkedList;

public class LinkedListEmptyCheck {

    public static void main(String[] args) {
        // Create a sample linked list
        LinkedList<String> myList = new LinkedList<>();

        // Check if the list is empty using isEmpty()
        if (myList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }

        // Add some elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");


        // Check again if the list is empty
        if (myList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }


         //Another Example using size() method (alternative, but isEmpty() is generally preferred for clarity)
         LinkedList<Integer> anotherList = new LinkedList<>();
         if (anotherList.size() == 0) {
             System.out.println("Another list is empty (using size()).");
         } else {
             System.out.println("Another list is not empty (using size()).");
         }

         anotherList.add(1);
         anotherList.add(2);


         if (anotherList.size() == 0) {
             System.out.println("Another list is empty (using size()).");
         } else {
             System.out.println("Another list is not empty (using size()).");
         }


    }
}
