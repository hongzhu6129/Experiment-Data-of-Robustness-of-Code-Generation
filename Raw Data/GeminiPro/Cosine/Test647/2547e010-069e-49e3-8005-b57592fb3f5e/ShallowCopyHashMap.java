import java.util.HashMap;
import java.util.Map;

public class ShallowCopyHashMap {

    public static void main(String[] args) {
        // Create the original HashMap
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("Orange", 3);

        // Create a shallow copy using the putAll() method
        HashMap<String, Integer> shallowCopy = new HashMap<>();
        shallowCopy.putAll(originalMap);


        // Demonstrate that changes to the shallow copy affect the original
        System.out.println("Original Map before modification: " + originalMap);
        System.out.println("Shallow Copy before modification: " + shallowCopy);

        shallowCopy.put("Grape", 4); // Modify the shallow copy
        shallowCopy.remove("Banana");  // Modify the shallow copy

        System.out.println("Original Map after modification: " + originalMap);  // Original remains unchanged (except for mutable objects' internal state if any)
        System.out.println("Shallow Copy after modification: " + shallowCopy);


        // Demonstrate changes to mutable objects within the map affect both
        HashMap<String, StringBuilder> mapWithMutableObjects = new HashMap<>();
        StringBuilder sb1 = new StringBuilder("Value1");
        mapWithMutableObjects.put("Key1", sb1);

        HashMap<String, StringBuilder> shallowCopyMutable = new HashMap<>();
        shallowCopyMutable.putAll(mapWithMutableObjects);

        System.out.println("Original Map with mutable objects before modification: " + mapWithMutableObjects);
        System.out.println("Shallow Copy with mutable objects before modification: " + shallowCopyMutable);

        shallowCopyMutable.get("Key1").append(" - Modified"); // Modify the mutable object in the shallow copy


        System.out.println("Original Map with mutable objects after modification: " + mapWithMutableObjects); // Original's internal state changes
        System.out.println("Shallow Copy with mutable objects after modification: " + shallowCopyMutable);




        // Another way to create a shallow copy using the constructor
        Map<String, Integer> anotherShallowCopy = new HashMap<>(originalMap);
        System.out.println("Another Shallow Copy: " + anotherShallowCopy);

    }
}
