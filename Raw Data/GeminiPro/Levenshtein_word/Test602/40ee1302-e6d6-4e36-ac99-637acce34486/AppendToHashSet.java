import java.util.HashSet;

public class AppendToHashSet {

    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element (HashSet doesn't have an append, use add)
        hashSet.add(elementToAppend);


        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);


        // Example with integers:
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numberToAdd = 4;
        numbers.add(numberToAdd);

        System.out.println("Updated HashSet of numbers: " + numbers);



    }
}
