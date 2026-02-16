import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();

        // Check if the list is empty
        if (list1.isEmpty()) {
            System.out.println("List 1 is empty");
        } else {
            System.out.println("List 1 is not empty");
        }

        // Add some elements to the list
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Check if the list is empty again
        if (list1.isEmpty()) {
            System.out.println("List 1 is empty");
        } else {
            System.out.println("List 1 is not empty");
        }


        //Another Example with a String LinkedList

         LinkedList<String> list2 = new LinkedList<>();
         list2.add("hello");

        if (list2.isEmpty()) {
            System.out.println("List 2 is empty");
        } else {
            System.out.println("List 2 is not empty");
        }

    }
}
