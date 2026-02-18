import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers (you can change the type as needed)
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some sample numbers to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);


        // Sort the ArrayList in ascending order (natural order for Integers)
        Collections.sort(numbers); 

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);



        // Example of sorting in descending order:
        ArrayList<Integer> numbersDescending = new ArrayList<>(numbers); // Create a copy to avoid modifying the original
        Collections.sort(numbersDescending, Collections.reverseOrder()); // Sort in descending order
        System.out.println("Sorted ArrayList (Descending): " + numbersDescending);


        // Example with Strings:
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Orange");
        strings.add("Grape");

        Collections.sort(strings); // Sorts strings alphabetically
        System.out.println("Sorted Strings: " + strings);



        // Example with custom objects (requires implementing Comparable interface):

        ArrayList<MyObject> myObjects = new ArrayList<>();
        myObjects.add(new MyObject("Object C", 3));
        myObjects.add(new MyObject("Object A", 1));
        myObjects.add(new MyObject("Object B", 2));
        

        Collections.sort(myObjects);  // Sorts based on the compareTo method in MyObject
        System.out.println("Sorted MyObjects: " + myObjects);
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
        // Compare based on value.  Change this to sort by name or other criteria:
        return Integer.compare(this.value, other.value);  
        //return this.name.compareTo(other.name);  // To sort by name
    }


    @Override
    public String toString() { // For printing the objects nicely
        return "(" + name + ", " + value + ")";
    }
}
