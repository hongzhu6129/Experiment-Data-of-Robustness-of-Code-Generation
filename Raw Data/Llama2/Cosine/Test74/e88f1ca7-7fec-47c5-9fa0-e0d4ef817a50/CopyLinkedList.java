import java.util.LinkedList;

public class CopyLinkedList {

    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Alice");
        originalList.add("Bob");
        originalList.add("Charlie");
        originalList.add("David");


        // Method 1: Using the constructor
        LinkedList<String> copiedList1 = new LinkedList<>(originalList);


        // Method 2: Using addAll()
        LinkedList<String> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);
        

        // Method 3: Manual copy (iterative)
        LinkedList<String> copiedList3 = new LinkedList<>();
        for (String name : originalList) {
            copiedList3.add(name);
        }

        // Print the original and copied lists to verify
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Iterative): " + copiedList3);


         //Demonstrate that changes to the copy do not affect the original and vice versa
        copiedList1.removeFirst(); //Remove Alice from copiedList1
        originalList.addLast("Eve");  //Add Eve to the original list

        System.out.println("\nAfter Modifications:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
    }
}
