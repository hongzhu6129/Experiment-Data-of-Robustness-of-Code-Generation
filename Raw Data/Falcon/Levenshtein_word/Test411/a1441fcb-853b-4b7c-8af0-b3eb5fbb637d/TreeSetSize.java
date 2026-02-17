import java.util.TreeSet;

public class TreeSetSize {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        // Get the number of elements using the size() method
        int size = numbers.size();

        // Print the size
        System.out.println("The number of elements in the TreeSet is: " + size); 
    }
}
