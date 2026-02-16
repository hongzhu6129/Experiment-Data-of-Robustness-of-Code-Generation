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

        // Method 2: Using the addAll() method
        LinkedList<String> copiedList2 = new LinkedList<>();
        copiedList2.addAll(originalList);


        // Print the original and copied lists
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);


        //Demonstrate that changes to the copy do *not* affect the original
        copiedList1.remove("banana");
        System.out.println("\nAfter removing \"banana\" from copiedList1:");
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List 1 (Constructor): " + copiedList1);


        //Example with integers (just to show different data type):
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        LinkedList<Integer> copiedNumbers = new LinkedList<>(numbers); 
        System.out.println("\nInteger List: " + numbers);
        System.out.println("Copied Integer List: " + copiedNumbers);
    }
}
