import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");

        // Method 1: Using the constructor
        LinkedList<String> copiedList1 = new LinkedList<>(originalList);


        // Method 2: Using addAll()
        LinkedList<String> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);


        // Method 3: Iterating and adding each element (Manual Copy)
        LinkedList<String> copiedList3 = new LinkedList<>();
        for (String item : originalList) {
            copiedList3.add(item); 
        }


        // Print the original and copied lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Iteration): " + copiedList3);


        // Demonstrate that changes to the copy don't affect the original (and vice-versa)
        copiedList1.removeFirst();  // Remove "Apple" from copiedList1

        System.out.println("\nAfter modification:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);


        originalList.addLast("Fig"); // Add "Fig" to originalList
        System.out.println("\nAfter another modification:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 2 (addAll): " + copiedList2);




    }
}
