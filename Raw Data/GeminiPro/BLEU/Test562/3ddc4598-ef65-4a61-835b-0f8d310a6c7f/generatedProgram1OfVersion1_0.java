import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {

    public static void main(String[] args) {
        // Create the original ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");


        // Method 1: Using the constructor
        ArrayList<String> copiedList1 = new ArrayList<>(originalList);


        // Method 2: Using addAll()
        ArrayList<String> copiedList2 = new ArrayList<>();
        copiedList2.addAll(originalList);

        // Method 3: Using Collections.copy() (requires equal or larger size in the destination list)
        ArrayList<String> copiedList3 = new ArrayList<>(originalList.size()); // Initialize with sufficient capacity
        Collections.copy(copiedList3, originalList); //This method requires the destination list to have a size equal to or greater than the source list. 
        //In practical scenarios, the source and destination lists might have different initial sizes, and using Collections.copy() directly could be error-prone.


         // Method 4: Manual copy using a loop (Suitable for specific element manipulation or filtering)
        ArrayList<String> copiedList4 = new ArrayList<>();
        for (String item : originalList) {
            copiedList4.add(item); // You could add conditional logic here if needed.
        }



        // Print the copied lists to verify
        System.out.println("Copied List 1 (Constructor): " + copiedList1);
        System.out.println("Copied List 2 (addAll): " + copiedList2);
        System.out.println("Copied List 3 (Collections.copy): " + copiedList3);
        System.out.println("Copied List 4 (Loop): " + copiedList4);

      
    }
}
