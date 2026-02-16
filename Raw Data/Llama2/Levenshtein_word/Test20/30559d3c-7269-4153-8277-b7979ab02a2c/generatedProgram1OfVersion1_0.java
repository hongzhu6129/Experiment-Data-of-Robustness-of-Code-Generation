import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("Original ArrayList: " + fruits);

        // Replace the second element (index 1) with "Mango"
        String newElement = "Mango";
        replaceSecondElement(fruits, newElement);


        System.out.println("ArrayList after replacement: " + fruits);



        // Example with an Integer ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nOriginal Integer ArrayList: " + numbers);

        Integer newNumber = 25;
        replaceSecondElement(numbers, newNumber); // Demonstrating with Integer type

        System.out.println("Integer ArrayList after replacement: " + numbers);



        // Handling edge cases: Empty list and list with only one element.
        List<String> emptyList = new ArrayList<>();
        replaceSecondElement(emptyList, "Kiwi");
        System.out.println("\nEmpty list after attempted replacement: " + emptyList); // Remains empty


        List<String> oneElementList = new ArrayList<>();
        oneElementList.add("Peach");
        replaceSecondElement(oneElementList, "Plum");
        System.out.println("List with one element after attempted replacement: " + oneElementList); // Remains unchanged



    }

    private static <T> void replaceSecondElement(List<T> list, T newElement) {
        if (list != null && list.size() >= 2) {  // Check if the list is not null and has at least two elements
            list.set(1, newElement); // Use set() to replace the element at index 1
        } else {
            //Handle the case where the list doesn't have a second element to replace
            // You could throw an exception, print a message, or simply do nothing (as in this example).
            // Doing nothing makes this a robust approach for a variety of input scenarios.

            System.out.println("List does not have a second element to replace."); // Informative message for learning.
        }


    }


}
