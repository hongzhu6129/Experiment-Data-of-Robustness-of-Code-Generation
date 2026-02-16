import java.util.ArrayList;
import java.util.List;

public class DisplayListElementsAndPositions {

    public static void main(String[] args) {
        // Create a sample list (you can modify this with your own list)
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("grape");
        myList.add("kiwi");

        // Display elements and their positions
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at position " + i + ": " + myList.get(i));
        }


        // Alternative using enhanced for loop with an index variable (Java 8+)
         int index = 0;
         for (String item : myList) {
             System.out.println("Element at position " + index + ": " + item);
             index++;
         }


         // Alternative using ListIterator (useful if you need to modify the list while iterating):
        /*
        java.util.ListIterator<String> iterator = myList.listIterator();
        while (iterator.hasNext()) {
            int currentIndex = iterator.nextIndex(); // Get the index *before* getting the element
            String currentElement = iterator.next();
            System.out.println("Element at position " + currentIndex + ": " + currentElement);
         }
        */



    }
}
