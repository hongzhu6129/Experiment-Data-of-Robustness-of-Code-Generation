import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Date";

        // Append the element to the end of the list
        linkedList.add(elementToAppend); //  Or linkedList.addLast(elementToAppend);  Both are equivalent

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


         // Example with Integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int numToAppend = 40;
        numbers.add(numToAppend);  // Appends 40 to the end

        System.out.println("Updated LinkedList of numbers: " + numbers);


        // Example appending multiple elements:
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Mango");

        String[] moreFruits = {"Grape", "Orange", "Pineapple"};
        // Use addAll to append multiple elements at once
        fruits.addAll(java.util.Arrays.asList(moreFruits));

        System.out.println("Updated fruit list: " + fruits);
    }
}
