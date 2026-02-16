import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list1 = new LinkedList<>();

        // Check if the list is empty
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }

        // Add some elements to the list
        list1.add("apple");
        list1.add("banana");

        // Check again if the list is empty
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }


        // Example with a null LinkedList (important to handle this case)
        LinkedList<Integer> list2 = null;

        if (list2 == null || list2.isEmpty()) {  // Correct way to check for null or empty
            System.out.println("list2 is null or empty");
        } else {
            System.out.println("list2 is not empty"); // This will not execute
        }



    }
}
