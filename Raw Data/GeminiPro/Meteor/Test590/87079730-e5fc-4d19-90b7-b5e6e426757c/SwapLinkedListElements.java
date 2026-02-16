import java.util.LinkedList;

public class SwapLinkedListElements {

    public static void main(String[] args) {
        // Create a sample linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Linked List: " + list);

        // Swap elements at index 1 and 3
        swapElements(list, 1, 3);

        System.out.println("Linked List after swapping: " + list);


        //Example with invalid indices - demonstrating error handling
         LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);


        System.out.println("\nOriginal Linked List 2: " + list2);
        swapElements(list2, 0, 5); //index 5 is out of bounds
        System.out.println("Linked List 2 after attempted swap (with out-of-bounds index): " + list2);




    }


    public static void swapElements(LinkedList<Integer> list, int index1, int index2) {
        // Check for valid indices
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.err.println("Error: Invalid indices for swapping.  No swap performed.");
            return; // Don't proceed if indices are out of bounds
        }

        // Get the elements at the specified indices
        int element1 = list.get(index1);
        int element2 = list.get(index2);

        // Swap the elements using set()
        list.set(index1, element2);
        list.set(index2, element1);
    }
}




