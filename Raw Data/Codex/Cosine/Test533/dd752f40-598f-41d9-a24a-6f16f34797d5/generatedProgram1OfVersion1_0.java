import java.util.TreeMap;
import java.util.Set;

public class TreeMapKeys {

    public static void main(String[] args) {

        // 1. Create a TreeMap
        TreeMap<String, Integer> studentGrades = new TreeMap<>();

        // 2. Populate the TreeMap
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 95);
        studentGrades.put("David", 78);
        studentGrades.put("Eve", 88);


        // 3. Get all keys using keySet()
        Set<String> keys = studentGrades.keySet();

        // 4. Print the keys using a for-each loop
        System.out.println("Using a for-each loop:");
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("\n---\n"); // Separator for clarity


        // 5.  Print keys using Java 8 Stream API (more advanced, optional)
        System.out.println("Using Java 8 Streams:");
        keys.stream().forEach(System.out::println);  // Stream and method reference

        System.out.println("\n---\n"); // Separator


        // 6.  Iterate and access values along with keys (common use case)
        System.out.println("Iterating and accessing values:");
        for(String key : keys){
            int grade = studentGrades.get(key); // Retrieve the value associated with the key
            System.out.println("Student: " + key + ", Grade: " + grade);
        }



        // Example demonstrating the sorted nature of TreeMap
        System.out.println("\n---\n"); // Separator
        System.out.println("Demonstrating sorted order:");

        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(5, "Five");
        numbers.put(2, "Two");
        numbers.put(8, "Eight");
        numbers.put(1, "One");

        for (Integer numKey : numbers.keySet()) {
            System.out.println("Number: " + numKey + ", Name: " + numbers.get(numKey));
        } // Output will be sorted based on the integer keys.



    }
}
