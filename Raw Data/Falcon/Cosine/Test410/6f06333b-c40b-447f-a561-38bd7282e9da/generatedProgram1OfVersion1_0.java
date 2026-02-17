import java.util.TreeSet;

public class TreeSetIteration {

    public static void main(String[] args) {

        // Create a TreeSet (automatically sorts elements)
        TreeSet<String> fruits = new TreeSet<>();

        // Add some elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        System.out.println("Iterating through TreeSet using enhanced for loop (for-each loop):");
        // Method 1: Enhanced for loop (recommended for simplicity)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating through TreeSet using an Iterator:");
        // Method 2: Using an Iterator explicitly
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        System.out.println("\nIterating in descending order using descendingIterator():");
        // Method 3: Iterate in descending order (TreeSet specific)
        java.util.Iterator<String> descendingIterator = fruits.descendingIterator();
        while (descendingIterator.hasNext()) {
            String fruit = descendingIterator.next();
            System.out.println(fruit);
        }


        System.out.println("\nIterating using forEach() method (Java 8 and later):");
        //Method 4: forEach with lambda expression
        fruits.forEach(fruit -> System.out.println(fruit));



        // Example: Checking if an element exists
        String searchFruit = "Apple";
        if (fruits.contains(searchFruit)) {
            System.out.println("\n" + searchFruit + " is present in the TreeSet.");
        } else {
            System.out.println("\n" + searchFruit + " is not present in the TreeSet.");
        }

    }
}
