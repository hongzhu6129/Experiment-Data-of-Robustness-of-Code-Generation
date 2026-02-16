import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Insert at the beginning (first position)
        myList.addFirst("Apple");
        myList.addFirst("Banana");

        // Insert at the end (last position)
        myList.addLast("Orange");
        myList.addLast("Grape");

        // Print the LinkedList
        System.out.println(myList); // Output: [Banana, Apple, Orange, Grape]


        // Example with integers
        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.addFirst(10);
        numberList.addLast(20);
        numberList.addFirst(5);
        numberList.addLast(25);

        System.out.println(numberList); // Output: [5, 10, 20, 25]


        // Example with more insertions:
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.addFirst("First");
        anotherList.addLast("Last");
        anotherList.addFirst("Very First");
        anotherList.addLast("Very Last");
        anotherList.addFirst("Firstest");

        System.out.println(anotherList); // Output: [Firstest, Very First, First, Last, Very Last]
    }
}
