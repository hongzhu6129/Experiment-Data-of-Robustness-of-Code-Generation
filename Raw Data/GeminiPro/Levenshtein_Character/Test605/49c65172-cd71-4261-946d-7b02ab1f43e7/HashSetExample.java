import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Mango");


        // Print the HashSet (order is not guaranteed)
        System.out.println("HashSet: " + hashSet);


        // Check if an element exists
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));
        System.out.println("Contains 'Kiwi'? " + hashSet.contains("Kiwi"));

        // Remove an element
        hashSet.remove("Orange"); 
        System.out.println("HashSet after removing 'Orange': " + hashSet);


        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());



        // Iterate through the HashSet (order not guaranteed)
        System.out.print("Iterating through HashSet: ");
        for (String fruit : hashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();



        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());




         //Example with Integer objects:
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        System.out.println("HashSet of Integers: " + numbers); // Notice no guaranteed order


    }
}
