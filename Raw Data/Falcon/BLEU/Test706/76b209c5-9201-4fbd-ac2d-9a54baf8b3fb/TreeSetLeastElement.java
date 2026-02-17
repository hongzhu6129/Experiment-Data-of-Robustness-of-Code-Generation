import java.util.TreeSet;

public class TreeSetLeastElement {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet (order doesn't matter, it'll be sorted automatically)
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);


        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty. No least element.");
        } else {
            // Get the least element using first()
            Integer leastElement = numbers.first();
            System.out.println("Least element: " + leastElement);
        }
    }
}
