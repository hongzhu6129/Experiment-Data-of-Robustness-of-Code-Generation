import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSophisticatedList {

    public static void main(String[] args) {
        // Example of a "sophisticated" list containing different data types
        List<Object> sophisticatedList = new ArrayList<>();
        sophisticatedList.add("Apple");
        sophisticatedList.add(123);
        sophisticatedList.add(45.67);
        sophisticatedList.add("Banana");
        sophisticatedList.add(9);
        sophisticatedList.add("Orange");


        // Sort the list using a custom comparator
        Collections.sort(sophisticatedList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).compareTo((String) o2); // String comparison
                } else if (o1 instanceof Number && o2 instanceof Number) {
                    return Double.compare(((Number) o1).doubleValue(), ((Number) o2).doubleValue()); // Number comparison
                } else if (o1 instanceof String && o2 instanceof Number) {
                   return -1; // Strings before numbers
                } else if (o1 instanceof Number && o2 instanceof String){
                    return 1; // Numbers after Strings
                }
                 else {
                     // Handle other data types or throw an exception if needed
                     return 0; 
                }
            }
        });


        // Print the sorted list
        System.out.println("Sorted list:");
        for (Object item : sophisticatedList) {
            System.out.println(item);
        }


        //Example 2 : Sorting a list of more complex objects.
         List<SophisticatedObject> complexList = new ArrayList<>();
        complexList.add(new SophisticatedObject("Z", 100));
        complexList.add(new SophisticatedObject("A", 10));
        complexList.add(new SophisticatedObject("B", 50));

        Collections.sort(complexList, Comparator.comparing(SophisticatedObject::getName).thenComparing(SophisticatedObject::getValue));


        System.out.println("\nSorted complex list:");
        for(SophisticatedObject obj : complexList){
            System.out.println(obj);
        }
    }

}



// Example of a more complex object
class SophisticatedObject {
    private String name;
    private int value;

    public SophisticatedObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Value: " + value;
    }
}
