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

        // Method 1: Using the constructor
        LinkedList<Integer> copiedList1 = new LinkedList<>(originalList);

        // Method 2: Using addAll()
        LinkedList<Integer> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);


        // Method 3: Manual copy (Iterative)
        LinkedList<Integer> copiedList3 = new LinkedList<>();
        for (Integer item : originalList) {
            copiedList3.add(item);
        }


        // Print the original and copied lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List (Constructor): " + copiedList1);
        System.out.println("Copied List (addAll): " + copiedList2);
        System.out.println("Copied List (Iterative): " + copiedList3);



         //Demonstrate that changes to the copy do not affect the original
        copiedList1.removeFirst(); //Remove the first element from copiedList1
        System.out.println("\nAfter modifying the copy (copiedList1):");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List (Constructor): " + copiedList1);


    }
}
