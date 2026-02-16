import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        // Get the element lower than 35 (will return 30)
        Integer lowerThan35 = numbers.lower(35);
        printResult("Lower than 35:", lowerThan35);


        // Get the element lower than 10 (will return null as there's no lower element)
        Integer lowerThan10 = numbers.lower(10);
        printResult("Lower than 10:", lowerThan10);



        // Example with Strings (natural ordering)
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");


        String lowerThanGrape = fruits.lower("Grape");
        printResult("Lower than Grape:", lowerThanGrape); // Output: Apple (because of alphabetical order, not insertion order)

         String lowerThanApple = fruits.lower("Apple");
        printResult("Lower than Apple:", lowerThanApple); // Output: Banana

          String lowerThanBanana = fruits.lower("Banana");
        printResult("Lower than Banana:", lowerThanBanana); // Output: null (no lower element)

    }


    // Helper function to print results clearly
    public static void printResult(String message, Object result) {
        System.out.println(message + (result != null ? result : "null"));
    }
}
