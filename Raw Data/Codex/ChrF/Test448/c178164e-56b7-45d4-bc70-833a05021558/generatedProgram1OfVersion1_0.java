import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to remove
        String elementToRemove = "Orange";

        // Remove the element using remove()
        boolean removed = linkedList.remove(elementToRemove);

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the LinkedList.");
        }


        // Example demonstrating removing by index:
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("Red");
        anotherList.add("Green");
        anotherList.add("Blue");

        System.out.println("\nAnother LinkedList: " + anotherList);
        int indexToRemove = 1; // Remove the element at index 1 (Green)


        try {
             String removedElement = anotherList.remove(indexToRemove);
             System.out.println("LinkedList after removing element at index " + indexToRemove + ": " + anotherList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.  Index: " + indexToRemove + ", Size: " + anotherList.size());

        }

          // Removing the first element
          LinkedList<String> oneMoreList = new LinkedList<>();
            oneMoreList.add("First");
            oneMoreList.add("Second");
            oneMoreList.add("Third");

            System.out.println("\nOne More LinkedList: " + oneMoreList);
            String first = oneMoreList.removeFirst(); // or oneMoreList.pop();
            System.out.println("List after removing first element (" + first + "): " + oneMoreList);

            //Removing the last element
             LinkedList<String> lastList = new LinkedList<>();
            lastList.add("First");
            lastList.add("Second");
            lastList.add("Third");

            System.out.println("\nLast LinkedList: " + lastList);
            String last = lastList.removeLast(); 
            System.out.println("List after removing last element (" + last + "): " + lastList);





    }
}
