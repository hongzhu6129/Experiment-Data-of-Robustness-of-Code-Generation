import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("cherry");

        // Method 1: Using the constructor
        LinkedList<String> copiedList1 = new LinkedList<>(originalList);

        // Method 2: Using addAll()
        LinkedList<String> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);


        // Method 3: Manual copy (Iterative)  - Demonstrates underlying logic
        LinkedList<String> copiedList3 = new LinkedList<>();
        for (String item : originalList) {
            copiedList3.add(item);
        }


        // Print the original and copied lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Iterative): " + copiedList3);



        // Demonstrating that changes to the copy don't affect the original (and vice-versa)
        copiedList1.remove("banana");
        originalList.add("grape");


         System.out.println("\nAfter Modifications:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);


    }
}
