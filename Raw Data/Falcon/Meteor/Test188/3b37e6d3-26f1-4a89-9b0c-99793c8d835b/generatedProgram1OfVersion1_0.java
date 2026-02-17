import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Alice");
        namesLinkedList.add("Bob");
        namesLinkedList.add("Charlie");
        namesLinkedList.add("David");

        String[] namesArray = convertToArray(namesLinkedList);

        System.out.println(Arrays.toString(namesArray)); // Output: [Alice, Bob, Charlie, David]


        // Example with an empty LinkedList
        LinkedList<String> emptyList = new LinkedList<>();
        String[] emptyArray = convertToArray(emptyList);
        System.out.println(Arrays.toString(emptyArray)); // Output: []


        // Example with a LinkedList of Integers (demonstrating generic method)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] numbersArray = convertToArray(numbers); 
        System.out.println(Arrays.toString(numbersArray)); // Output: [1, 2, 3]


    }

    // Generic method to convert a LinkedList to an array
    public static <T> T[] convertToArray(LinkedList<T> linkedList) {
        if (linkedList == null) {
            return null; // Or handle null as needed
        }

        // Create an ArrayList to store the elements temporarily
        ArrayList<T> arrayList = new ArrayList<>(linkedList);


        // Create an array of the correct type and size.  The slightly tricky part.
        @SuppressWarnings("unchecked") // This is safe because we know the type from the LinkedList.
        T[] array = (T[]) java.lang.reflect.Array.newInstance(
                linkedList.getFirst().getClass(), // Get the class of the elements
                linkedList.size()
        );



        //  Convert from ArrayList to Array.  toArray() with argument is more efficient than without.
        return arrayList.toArray(array);

    }
}
