import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create a source linked list
        LinkedList<String> sourceList = new LinkedList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");

        // Method 1: Using the constructor (most efficient)
        LinkedList<String> copiedList1 = new LinkedList<>(sourceList);


        // Method 2: Using addAll()
        LinkedList<String> copiedList2 = new LinkedList<>();
        copiedList2.addAll(sourceList);

        // Method 3: Iterating and adding elements individually (less efficient)
        LinkedList<String> copiedList3 = new LinkedList<>();
        for (String item : sourceList) {
            copiedList3.add(item);
        }


        // Print the original and copied lists to verify
        System.out.println("Original List: " + sourceList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Iteration): " + copiedList3);


        //Demonstrate that changes to the copy don't affect the original
        copiedList1.removeFirst();  //remove "Apple" from the copy

        System.out.println("\nAfter modifying copiedList1:");
        System.out.println("Original List: " + sourceList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);


    }
}
