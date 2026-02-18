import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromList {

    public static void main(String[] args) {
        // Create a sample list
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("grape");
        myList.add("banana"); // Duplicate element

        System.out.println("Original list: " + myList);

        // Element to remove
        String elementToRemove = "banana";

        // Remove all occurrences of the element
        //  Using a while loop and remove(Object) is safer for concurrent modification
        while (myList.remove(elementToRemove)) { 
            // Continue removing until no more instances are found
        }


        // Alternatively, if you only want to remove the *first* occurrence
        // myList.remove(elementToRemove); // Removes the first "banana"


         //Another approach - Create a new list with elements that shouldn't be removed.
        //  This is suitable if concurrent modification is not a concern.
        /*List<String> newList = new ArrayList<>();
        for(String item : myList) {
            if(!item.equals(elementToRemove)) {
                newList.add(item);
            }
        }
        myList = newList;  // Update the original list reference
       */

        System.out.println("List after removing '" + elementToRemove + "': " + myList);


        // Example with an integer list:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        System.out.println("Original numbers list: " + numbers);
        int numToRemove = 2;

        while (numbers.remove(Integer.valueOf(numToRemove))) {  // Autoboxing to Integer object

        }

        System.out.println("Numbers list after removing '" + numToRemove + "': " + numbers);



    }
}
