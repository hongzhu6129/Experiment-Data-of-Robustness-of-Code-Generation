import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterateThroughSophisticatedList {

    public static void main(String[] args) {

        // Example of a "sophisticated" list - a list of lists, 
        // containing different data types including custom objects.

        List<Object> sophisticatedList = new ArrayList<>();

        // Adding various elements to the sophisticated list
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        sophisticatedList.add(intList);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        sophisticatedList.add(stringSet);


        Map<String, Double> doubleMap = new HashMap<>();
        doubleMap.put("pi", 3.14159);
        doubleMap.put("e", 2.71828);
        sophisticatedList.add(doubleMap);

        List<MyCustomObject> customObjects = new LinkedList<>();  // Using a LinkedList just for variety
        customObjects.add(new MyCustomObject("Object 1"));
        customObjects.add(new MyCustomObject("Object 2"));
        sophisticatedList.add(customObjects);



        // Iterating through the sophisticated list
        for (Object item : sophisticatedList) {
            if (item instanceof List) {
                System.out.println("Processing a List:");
                for (Object subItem : (List) item) {
                    System.out.println("\t" + subItem);
                }
            } else if (item instanceof Set) {
                System.out.println("Processing a Set:");
                Iterator iterator = ((Set) item).iterator();
                while (iterator.hasNext()) {
                    System.out.println("\t" + iterator.next());
                }

            } else if (item instanceof Map) {
                System.out.println("Processing a Map:");
                for (Map.Entry entry : ((Map<?, ?>) item).entrySet()) {
                    System.out.println("\tKey: " + entry.getKey() + ", Value: " + entry.getValue());
                }
            } else {  // Handle other types, including custom objects
                System.out.println("Processing other type: " + item);

            }
        }

    }



    //  Example of a simple custom object (inner class is fine for this demo)
    private static class MyCustomObject {
        String name;

        public MyCustomObject(String name) {
            this.name = name;
        }


        @Override
        public String toString() { //  Important to override toString for meaningful output!
            return name; 
        }
    }

}
