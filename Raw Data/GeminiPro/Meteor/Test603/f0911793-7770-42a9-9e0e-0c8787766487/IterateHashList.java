import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class IterateHashList {

    public static void main(String[] args) {

        // Demonstrating with a HashSet (since "Hash List" usually implies HashSet)
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        System.out.println("Iterating through HashSet using an Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating through HashSet using enhanced for loop:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }


        // Demonstrating with a HashMap (in case "Hash List" was meant as a HashMap)
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);


        System.out.println("\nIterating through HashMap using an entrySet and enhanced for loop:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating through HashMap using keySet and enhanced for loop:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }


        System.out.println("\nIterating through HashMap using values and enhanced for loop:");
         for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }


    }
}
