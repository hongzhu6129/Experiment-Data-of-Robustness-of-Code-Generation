import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> myList = new LinkedList<>();

        // Check if the list is empty using isEmpty()
        if (myList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }

        // Add some elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        // Check again if the list is empty
        if (myList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }


        // Example using size() (alternative approach)
        LinkedList<Integer> anotherList = new LinkedList<>();
        if (anotherList.size() == 0) {
            System.out.println("Another list is empty (using size).");
        } else {
            System.out.println("Another list is not empty (using size).");
        }
    }
}
