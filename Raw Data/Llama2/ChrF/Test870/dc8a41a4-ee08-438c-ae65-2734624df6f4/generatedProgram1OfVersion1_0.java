import java.util.LinkedList;
import java.util.List;

public class CheckEmptyList {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Check if the list is empty using isEmpty()
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }


        // Add some elements to the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty again
        if (linkedList.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }


        // Create another empty list to further demonstrate
        List<Integer> anotherList = new LinkedList<>();

        if (anotherList.isEmpty()) {
            System.out.println("anotherList is empty.");
        } else {
            System.out.println("anotherList is not empty.");
        }



    }
}
