import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListPortion {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("cherry");
        originalList.add("date");
        originalList.add("elderberry");

        // Define the start and end indices for the portion to extract
        int startIndex = 1;
        int endIndex = 4; // Exclusive (up to, but not including, this index)

        //Error Handling: Check for valid indices
        if (startIndex < 0 || endIndex > originalList.size() || startIndex >= endIndex) {
            System.err.println("Invalid start or end indices.");
            return; // Exit the program if indices are invalid.
        }

        // Method 1: Using subList() (creates a view, modifications affect original list)
        List<String> subListView = originalList.subList(startIndex, endIndex);
        System.out.println("Sublist (view): " + subListView);

        // Method 2: Creating a new ArrayList (independent copy)
        ArrayList<String> subListCopy = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            subListCopy.add(originalList.get(i));
        }
        System.out.println("Sublist (copy): " + subListCopy);


        //Demonstrate view characteristic of subList():
        subListView.set(0, "grape"); //Modify the sublist view
        System.out.println("Original list after modifying sublist view: " + originalList); //Original list is also modified



        // Example with Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        startIndex = 3;
        endIndex = 7;

        //Error Handling: Check for valid indices
        if (startIndex < 0 || endIndex > numbers.size() || startIndex >= endIndex) {
            System.err.println("Invalid start or end indices.");
            return; // Exit the program if indices are invalid.
        }


        List<Integer> numberSubList = numbers.subList(startIndex, endIndex);
        System.out.println("Number sublist: " + numberSubList);
    }
}
