import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSophisticatedList {

    public static void main(String[] args) {
        // Example of a "sophisticated" list containing different data types
        List<Object> sophisticatedList = new ArrayList<>();
        sophisticatedList.add("apple");
        sophisticatedList.add(123);
        sophisticatedList.add(45.67);
        sophisticatedList.add("banana");
        sophisticatedList.add(9);
        sophisticatedList.add("orange");


        // Sort the list using a custom comparator
        Collections.sort(sophisticatedList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).compareTo((String) o2); // String comparison
                } else if (o1 instanceof Number && o2 instanceof Number) {
                    return Double.compare(((Number) o1).doubleValue(), ((Number) o2).doubleValue()); // Number comparison
                } else if (o1 instanceof String && o2 instanceof Number) {
                    return -1; // Strings before Numbers
                } else if (o1 instanceof Number && o2 instanceof String) {
                    return 1; // Numbers after Strings
                } else {
                  return 0; //Handle other cases as needed. You might want to throw an exception if you only expect Strings and Numbers
                }

            }
        });


        // Print the sorted list
        System.out.println("Sorted list: " + sophisticatedList);


        //Example 2:  A list of more complex objects.
        List<SophisticatedObject> complexList = new ArrayList<>();
        complexList.add(new SophisticatedObject("Z", 10));
        complexList.add(new SophisticatedObject("A", 1));
        complexList.add(new SophisticatedObject("B", 5));


        Collections.sort(complexList, Comparator.comparing(SophisticatedObject::getName).thenComparing(SophisticatedObject::getValue));

        System.out.println("Sorted Complex List: " + complexList);

    }



}


class SophisticatedObject {  //Example custom class
    String name;
    int value;

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
        return "{" + name + ", " + value + "}";
    }
}
