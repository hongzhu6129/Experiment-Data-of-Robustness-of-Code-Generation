import java.util.TreeSet;

public class RemoveLastTreeSetElement {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Check if the TreeSet is empty
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty. Cannot remove last element.");
            return;
        }

        // Retrieve and remove the last element
        Integer lastElement = numbers.pollLast();


        if (lastElement != null) {
            System.out.println("Removed last element: " + lastElement);
            System.out.println("Updated TreeSet: " + numbers);
        }

    }
}
