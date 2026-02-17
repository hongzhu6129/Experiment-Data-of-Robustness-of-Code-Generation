import java.util.TreeSet;

public class TreeSetHeadSet {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to find the head set for
        int givenElement = 35;

        // Get the head set (elements less than or equal to the given element)
        TreeSet<Integer> headSet = (TreeSet<Integer>) numbers.headSet(givenElement, true); // Inclusive

        // Print the head set
        System.out.println("Head Set (elements less than or equal to " + givenElement + "): " + headSet);



        // Example with a String TreeSet
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");

        String givenFruit = "Mango";  // Inclusive

        TreeSet<String> fruitHeadSet = (TreeSet<String>) fruits.headSet(givenFruit, true);

        System.out.println("Fruit Head Set (elements less than or equal to " + givenFruit + "): " + fruitHeadSet);


        givenFruit = "Grape"; // Demonstrating when the element is not present
        fruitHeadSet = (TreeSet<String>) fruits.headSet(givenFruit, true);
        System.out.println("Fruit Head Set (elements less than or equal to " + givenFruit + "): " + fruitHeadSet); // All elements up to where "Grape" would be



    }
}
