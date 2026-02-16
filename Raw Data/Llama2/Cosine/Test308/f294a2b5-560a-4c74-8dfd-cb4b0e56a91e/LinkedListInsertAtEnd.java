import java.util.LinkedList;

public class LinkedListInsertAtEnd {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Add some initial elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Original LinkedList: " + myList);

        // Element to insert at the end
        String newElement = "Grape";


        // Method 1: Using add() -  This is the simplest and most common way
        myList.add(newElement);  // add() automatically inserts at the end
        System.out.println("LinkedList after adding (method 1): " + myList);



        // Method 2: Using offerLast() -  Similar to add(), but returns a boolean
        // indicating success (true) or failure (false if capacity restricted, 
        // which doesn't apply to LinkedList).
        boolean success = myList.offerLast("Mango"); // add "Mango" after "Grape"
        System.out.println("LinkedList after adding (method 2): " + myList + ", Success: " + success);


        // Method 3: Using addLast() -  Explicitly adds at the end, equivalent to add()
        myList.addLast("Pineapple"); // add "Pineapple" at the end
        System.out.println("LinkedList after adding (method 3): " + myList );




        // Example demonstrating how to insert a number (int)
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(10);
        numberList.add(20);

        int newNumber = 30;
        numberList.add(newNumber); // Integer autoboxing handles int to Integer conversion
        System.out.println("Number LinkedList: " + numberList);



    }
}
