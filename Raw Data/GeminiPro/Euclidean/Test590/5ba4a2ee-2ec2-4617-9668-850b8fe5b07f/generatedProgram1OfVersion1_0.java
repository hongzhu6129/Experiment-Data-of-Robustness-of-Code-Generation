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

        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap


        try {
             swapElements(list, index1, index2);
            System.out.println("Linked List after swapping elements at indices " + index1 + " and " + index2 + ": " + list);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }


         // Example with invalid indices (handling exception):
        index1 = 10;
        index2 = 20;
         try {
             swapElements(list, index1, index2); // This will throw an IndexOutOfBoundsException
             System.out.println("This should not print."); 
         } catch (IndexOutOfBoundsException e) {
             System.err.println("Error: " + e.getMessage());
         }
    }

    private static <T> void swapElements(LinkedList<T> list, int index1, int index2) {

         // Validate indices
         if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
             throw new IndexOutOfBoundsException("Invalid indices. Indices should be within the range of the list.");
         }

        // Get the elements at the specified indices
        T element1 = list.get(index1);
        T element2 = list.get(index2);

        // Swap the elements using set()
        list.set(index1, element2);
        list.set(index2, element1);


    }
}
