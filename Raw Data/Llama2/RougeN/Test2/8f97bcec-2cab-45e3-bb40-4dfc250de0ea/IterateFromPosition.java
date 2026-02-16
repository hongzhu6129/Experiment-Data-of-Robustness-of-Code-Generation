import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class IterateFromPosition {

    public static void main(String[] args) {
        // Create a sample list
        List<String> involvedList = new ArrayList<>();
        involvedList.add("apple");
        involvedList.add("banana");
        involvedList.add("orange");
        involvedList.add("grape");
        involvedList.add("kiwi");

        // Specify the starting position (index)
        int startPosition = 2; // Start from the 3rd element (index 2)

        // Iterate through the list starting at the specified position using a ListIterator
        ListIterator<String> iterator = involvedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        // Demonstrating alternative using a simple for loop (less flexible, but works for forward iteration only)
        System.out.println("\nUsing a for loop:");
         if (startPosition >= 0 && startPosition < involvedList.size()) { //Important check
             for (int i = startPosition; i < involvedList.size(); i++) {
                 System.out.println(involvedList.get(i));
             }
         } else {
             System.out.println("Invalid start position.");
         }

    }
}
