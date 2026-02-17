import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> days = new LinkedList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Specify the starting position (e.g., 2 for Wednesday)
        int startPosition = 2;

        // Iterate through the LinkedList from the specified position
        ListIterator<String> iterator = days.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Example demonstrating handling invalid start positions (out of bounds)
         startPosition = 10; //Invalid Index

         if (startPosition < 0 || startPosition > days.size()) {
             System.out.println("Invalid start position. Position must be between 0 and " + days.size());
         } else {
             iterator = days.listIterator(startPosition);  //Safe to create iterator now
             while (iterator.hasNext()) {
                 System.out.println(iterator.next());
             }
         }

    }
}
