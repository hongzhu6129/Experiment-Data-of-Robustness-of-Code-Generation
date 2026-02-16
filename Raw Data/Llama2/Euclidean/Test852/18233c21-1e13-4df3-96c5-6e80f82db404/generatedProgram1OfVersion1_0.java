import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // Method 1: Using the constructor  (Most efficient for LinkedList)
        LinkedList<Integer> copiedList1 = new LinkedList<>(originalList);


        // Method 2: Using addAll()
        LinkedList<Integer> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);



        // Method 3: Manual copy (illustrative, less efficient)
        LinkedList<Integer> copiedList3 = new LinkedList<>();
        for (Integer item : originalList) {
            copiedList3.add(item);
        }


        // Print the original and copied lists
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List (Constructor): " + copiedList1);
        System.out.println("Copied List (addAll): " + copiedList2);
        System.out.println("Copied List (Manual): " + copiedList3);


        // Demonstrate that changes to the copy don't affect the original (and vice-versa)
        copiedList1.removeFirst();  // Remove the first element from copiedList1

        System.out.println("\nAfter Modification:");
        System.out.println("Original List: " + originalList);         // Original list remains unchanged
        System.out.println("Copied List (Constructor): " + copiedList1); // copiedList1 is modified


        originalList.addLast(6); // Add an element to the original list

        System.out.println("\nAfter Modification 2:");

        System.out.println("Original List: " + originalList);         // originalList is modified
        System.out.println("Copied List (addAll): " + copiedList2); // copiedList2 remains unchanged (from its initial copy state)


    }
}
