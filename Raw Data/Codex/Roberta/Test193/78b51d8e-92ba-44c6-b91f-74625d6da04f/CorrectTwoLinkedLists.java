import java.util.LinkedList;

public class CorrectTwoLinkedLists {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4); 
        list1.add(null); // Example of an incorrect element (null)

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(null); // Example of an incorrect element

        System.out.println("Original List 1: " + list1);
        System.out.println("Original List 2: " + list2);

        correctLinkedList(list1);
        correctLinkedList(list2);

        System.out.println("Corrected List 1: " + list1);
        System.out.println("Corrected List 2: " + list2);

    }

    // Method to correct a LinkedList by removing null elements and duplicates
    public static void correctLinkedList(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return; // Nothing to correct
        }


        list.removeIf(item -> item == null); // Remove nulls efficiently

        // Removing duplicates (while preserving order) can be tricky in a single pass within main().
        // A HashSet is usually used for efficient duplicate detection, but that doesn't preserve original order.  
        //  For simplicity, we will use a nested loop approach here (less efficient for very large lists):

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) { 
                    list.remove(j);  // Remove the duplicate
                    j--;  // Adjust index after removal
                }
            }
        }


    }
}



