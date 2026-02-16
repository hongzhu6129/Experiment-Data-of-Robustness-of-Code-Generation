import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);


        // Example with Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Grape");

        Collections.sort(strings);

        System.out.println("Sorted Strings: " + strings);


         // Example with custom objects (requires implementing Comparable)

        ArrayList<MyObject> objects = new ArrayList<>();
        objects.add(new MyObject("Object C", 3));
        objects.add(new MyObject("Object A", 1));
        objects.add(new MyObject("Object B", 2));


        Collections.sort(objects); // This will use the compareTo() method

        System.out.println("Sorted Objects: " + objects);

    }


}

class MyObject implements Comparable<MyObject> {
    String name;
    int value;

    public MyObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(MyObject other) {
        // Sort based on the 'value' field
        return Integer.compare(this.value, other.value);
        // Or sort based on name:
        // return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + value + ")";
    }


}
