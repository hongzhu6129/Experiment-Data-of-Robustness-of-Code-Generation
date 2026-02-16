import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // Method 1: Using the constructor  (most straightforward and generally recommended)
        LinkedList<Integer> copiedList1 = new LinkedList<>(originalList);


        // Method 2: Using addAll()
        LinkedList<Integer> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);

        // Method 3: Manual copy (useful for understanding linked list internals, but less efficient)
        LinkedList<Integer> copiedList3 = new LinkedList<>();
        for (Integer item : originalList) {
            copiedList3.add(item);
        }


        // Print the original and copied lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Manual): " + copiedList3);


        //Demonstrate that the lists are independent (modifying one doesn't affect the other)
        copiedList1.removeFirst();  //remove 1 from copiedList1
        System.out.println("Original List (after modification to copy): " + originalList);
        System.out.println("Copied List 1 (after modification): " + copiedList1);
    }
}
