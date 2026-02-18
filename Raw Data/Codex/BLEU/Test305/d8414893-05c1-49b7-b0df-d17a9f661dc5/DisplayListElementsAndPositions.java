import java.util.ArrayList;
import java.util.List;

public class DisplayListElementsAndPositions {

    public static void main(String[] args) {
        // Create a sample list (you can replace this with your own list)
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("grape");
        myList.add("kiwi");


        // Display elements and their positions using a for loop and get()
        System.out.println("Using for loop with get():");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at position " + i + ": " + myList.get(i));
        }

        // Display elements and their positions using enhanced for loop (less efficient for getting index)
        System.out.println("\nUsing enhanced for loop (no direct index access):");
        int index = 0; // Manually track the index
        for (String item : myList) {
            System.out.println("Element at position " + index + ": " + item);
            index++;
        }


        // Display elements and their positions using ListIterator (more versatile if you need to modify the list)
        System.out.println("\nUsing ListIterator:");
        java.util.ListIterator<String> iterator = myList.listIterator();
        while (iterator.hasNext()) {
           int currentIndex = iterator.nextIndex(); // Get index before retrieving the element
           String item = iterator.next(); 
           System.out.println("Element at position " + currentIndex + ": " + item);

        }



    }
}
