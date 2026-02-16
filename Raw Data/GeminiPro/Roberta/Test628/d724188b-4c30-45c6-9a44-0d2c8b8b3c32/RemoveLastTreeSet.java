import java.util.TreeSet;

public class RemoveLastTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Retrieve and remove the last element
        if (!numbers.isEmpty()) { // Check if the TreeSet is empty before attempting removal
            Integer lastElement = numbers.last();
            numbers.remove(lastElement);

            System.out.println("Removed last element: " + lastElement);
            System.out.println("Remaining elements: " + numbers);
        } else {
            System.out.println("TreeSet is empty. Cannot remove last element.");
        }



        // Another example with strings, demonstrating handling an empty set:
        TreeSet<String> strings = new TreeSet<>();

         // Intentionally leaving it empty

        if (!strings.isEmpty()) {
            String lastString = strings.last();
            strings.remove(lastString);
            System.out.println("Removed last string: " + lastString);
            System.out.println("Remaining strings: " + strings); 
        } else {
            System.out.println("String TreeSet is empty. Cannot remove last element.");
        }

    }
}
