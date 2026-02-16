import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Add some initial elements
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // Element to append
        String newElement = "date";

        // Append the element to the end of the list
        myList.add(newElement); //  LinkedList's add() method appends by default

        // Print the updated list
        System.out.println("Updated LinkedList: " + myList);


        // Example with integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int newNumber = 4;
        numbers.add(newNumber);

        System.out.println("Updated LinkedList of numbers: " + numbers);


        //  addLast() can also be used (explicitly appends to the end):
        LinkedList<Double> doubles = new LinkedList<>();
        doubles.add(1.1);
        doubles.add(2.2);

        double newDouble = 3.3;
        doubles.addLast(newDouble); // Same effect as add() in this context

        System.out.println("Updated LinkedList of doubles: " + doubles);


    }
}
