import java.util.ArrayList;
import java.util.List;

public class ExtractPortionArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("grape");
        originalList.add("mango");

        // Define the start and end indices for the portion to extract
        int startIndex = 1;
        int endIndex = 4; // Exclusive

        // Validate indices (optional, but good practice)
        if (startIndex < 0 || endIndex > originalList.size() || startIndex >= endIndex) {
            System.out.println("Invalid start or end indices.");
            return; // Exit the program
        }


        // Method 1: Using subList() (most efficient)
        List<String> extractedPortion1 = originalList.subList(startIndex, endIndex);

        System.out.println("Extracted portion (using subList): " + extractedPortion1);



        // Method 2: Using a loop (more flexible if you need to modify elements during extraction)
        ArrayList<String> extractedPortion2 = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            extractedPortion2.add(originalList.get(i));
        }
        System.out.println("Extracted portion (using loop): " + extractedPortion2);



        //Important Note about subList():
        //subList() returns a *view* of the original list, not a new list.  Modifications to the sublist
        //will affect the original list, and vice versa. If you need a truly independent copy, use:

        List<String> independentCopy = new ArrayList<>(originalList.subList(startIndex, endIndex));
        System.out.println("Independent copy (using subList and constructor): " + independentCopy);


    }
}
