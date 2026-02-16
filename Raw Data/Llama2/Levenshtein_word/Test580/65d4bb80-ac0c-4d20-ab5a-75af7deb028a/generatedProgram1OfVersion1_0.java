import java.util.TreeMap;

public class TreeMapCopy {

    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();
        sourceTreeMap.put("Apple", 1);
        sourceTreeMap.put("Banana", 2);
        sourceTreeMap.put("Orange", 3);
        sourceTreeMap.put("Grape", 4);

        // Create the destination TreeMap using the putAll() method
        TreeMap<String, Integer> destinationTreeMap = new TreeMap<>();
        destinationTreeMap.putAll(sourceTreeMap);


        // Print the contents of both TreeMaps to verify the copy
        System.out.println("Source TreeMap: " + sourceTreeMap);
        System.out.println("Destination TreeMap: " + destinationTreeMap);


        // Another way - creating a new TreeMap using the constructor:
         TreeMap<String, Integer> anotherCopy = new TreeMap<>(sourceTreeMap);

        System.out.println("Another copy: " + anotherCopy);


    }
}
