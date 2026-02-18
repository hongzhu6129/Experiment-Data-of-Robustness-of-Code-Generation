import java.util.HashMap;

public class HashSize {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add some elements to the HashMap
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        hashMap.put("Grape", 4);

        // Get the number of elements (size) of the HashMap
        int size = hashMap.size();

        // Print the size
        System.out.println("The number of elements in the HashMap is: " + size);


        // Another Example using a different data type

        HashMap<Integer, Double> anotherHashMap = new HashMap<>();
        anotherHashMap.put(1, 3.14);
        anotherHashMap.put(2, 2.71);

        System.out.println("Size of anotherHashMap: " + anotherHashMap.size());
    }
}
