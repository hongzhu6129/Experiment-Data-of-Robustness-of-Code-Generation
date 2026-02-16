import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-indexed)
        int insertionIndex = 1; 

        // Check if the index is valid
        if (insertionIndex >= 0 && insertionIndex <= linkedList.size()) {
            linkedList.add(insertionIndex, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("Invalid insertion index. Index should be between 0 and " + linkedList.size());
        }


         // Example 2: Insert at the beginning
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int element = 5;
        int index = 0;

        if (index >= 0 && index <= numbers.size()) {
            numbers.add(index, element);
            System.out.println("Updated LinkedList (Example 2): " + numbers);
        } else {
            System.out.println("Invalid index (Example 2)");
        }

         //Example 3: Insert at the end
        LinkedList<Double> decimals = new LinkedList<>();
        decimals.add(1.1);
        decimals.add(2.2);

        double decimalElement = 3.3;
        int endIndex = decimals.size(); // Insert at the end

        if (endIndex >= 0 && endIndex <= decimals.size()) {
             decimals.add(endIndex, decimalElement);
             System.out.println("Updated LinkedList (Example 3): " + decimals);
        } else {
            System.out.println("Invalid index (Example 3)");
        }

    }
}
