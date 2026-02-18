import java.util.HashSet;

public class HashSetSize {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");
        hashSet.add("Mango");


        // Get the number of elements in the HashSet using size()
        int size = hashSet.size();

        // Print the size
        System.out.println("The number of elements in the HashSet is: " + size); 
    }
}
