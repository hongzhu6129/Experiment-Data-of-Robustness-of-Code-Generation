import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOccurrences {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        int target = 2;

        findFirstAndLast(numbers, target);


        //Another example with a String LinkedList
        LinkedList<String> strings = new LinkedList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("banana");
        strings.add("grape");

        String targetString = "banana";

        findFirstAndLast(strings, targetString);


        // Example demonstrating no occurrences:
         LinkedList<Integer> noOccurrencesList = new LinkedList<>();
        noOccurrencesList.add(1);
        noOccurrencesList.add(3);
        noOccurrencesList.add(5);

         findFirstAndLast(noOccurrencesList, target); // Output: Target 2 not found in the list.



    }


    public static <T> void findFirstAndLast(LinkedList<T> list, T target) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        ListIterator<T> iterator = list.listIterator();
        int index = 0;

        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index;
                }
                lastOccurrence = index;
            }
            index++;
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
            System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Target " + target + " not found in the list.");
        }
        System.out.println(); // Add a newline for clarity between different runs.
    }
}

