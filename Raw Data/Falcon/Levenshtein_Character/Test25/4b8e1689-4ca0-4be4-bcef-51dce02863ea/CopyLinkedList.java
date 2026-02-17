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



        // Method 3: Iterative copying (Manual Node Creation -  If you needed a deep copy with custom Node objects)
        LinkedList<Integer> copiedList3 = new LinkedList<>(); 
        for (Integer value : originalList) {
            copiedList3.add(value); // Integer is immutable, so this effectively a deep copy in this simple example.
        }

        // Print the original and copied lists
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Iterative): " + copiedList3);


        // Demonstrate that changes to the copy don't affect the original (and vice-versa)
        copiedList1.removeFirst();
        originalList.addLast(6);


        System.out.println("\nAfter modifications:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);


    }
}
