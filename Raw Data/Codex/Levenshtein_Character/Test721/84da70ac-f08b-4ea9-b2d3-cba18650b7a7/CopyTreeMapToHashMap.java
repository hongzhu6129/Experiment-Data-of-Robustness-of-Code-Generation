import java.util.TreeMap;
import java.util.HashMap;

public class CopyTreeMapToHashMap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);

        // Copy TreeMap content to a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>(treeMap); // Using the constructor is the most efficient way

        // Print the HashMap to verify the copy
        System.out.println("HashMap: " + hashMap);


        //Alternative method using putAll:  less efficient, but demonstrates another option.
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.putAll(treeMap);
        System.out.println("HashMap2 (putAll method): " + hashMap2);



    }
}
