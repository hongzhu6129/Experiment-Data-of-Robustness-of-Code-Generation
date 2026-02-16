import java.util.LinkedList;

public class LinkedListPeek {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> myList = new LinkedList<>();

        // Add some elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Check if the list is empty before attempting to peek
        if (!myList.isEmpty()) {
            // Retrieve the first element using peek()
            String firstElement = myList.peek();  // Or myList.peekFirst(); they are equivalent

            // Print the first element 
            System.out.println("First element (peeked): " + firstElement);

            // Print the entire list to demonstrate that the element was not removed
            System.out.println("List after peeking: " + myList);


            // Example using peekFirst() - identical functionality to peek()
            String firstElementAgain = myList.peekFirst();
            System.out.println("First element (peekFirst()): " + firstElementAgain);
            System.out.println("List after peekFirst(): " + myList);

        } else {
            System.out.println("The list is empty.");
        }


        //Illustrate difference between peek() and poll()
        if (!myList.isEmpty()) {
            String polledElement = myList.poll(); // Retrieves AND removes the first element
            System.out.println("Polled element: " + polledElement);
            System.out.println("List after polling: " + myList); // Notice "Apple" is now gone
        } else {
            System.out.println("The list is empty after polling.");  //This will execute if the list became empty after the previous poll()
        }

        //element() throws NoSuchElementException if the list is empty - IMPORTANT
        // Demonstrate the element() method (similar to peek(), but throws exception if empty)
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("Mango");

        try {
            String firstElementAnotherList = anotherList.element(); // or anotherList.getFirst(); equivalent.
            System.out.println("First element (element()): " + firstElementAnotherList);

            anotherList.clear(); //Make anotherList empty for demonstration

            //This will throw an exception since the list is now empty:
            String elementFromEmptyList = anotherList.element(); // Comment this line to avoid the exception.
            System.out.println(elementFromEmptyList); // This will not be reached if the exception is thrown


        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }
    }
}
