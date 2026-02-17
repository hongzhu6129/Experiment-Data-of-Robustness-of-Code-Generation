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

        // Remove the specified element
        boolean removed = linkedList.remove(elementToRemove);

        if (removed) {
            System.out.println("LinkedList after removing " + elementToRemove + ": " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }


        // Example removing by index:
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Orange");
        linkedList2.add("Grape");
        linkedList2.add("Mango");

        System.out.println("\nOriginal LinkedList 2: " + linkedList2);
        int indexToRemove = 1; //Remove "Banana"

        String removedElement = linkedList2.remove(indexToRemove); //Returns removed element.


        System.out.println("LinkedList 2 after removing element at index " + indexToRemove + ": " + linkedList2);
        System.out.println("Removed element: "+ removedElement);


        // Demonstrating removing a non-existent element:
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Apple");
        boolean removed3 = linkedList3.remove("Pear");  // Won't be found

        System.out.println("\nOriginal LinkedList 3: " + linkedList3);
         if (removed3) {
            System.out.println("Removed Pear"); // This won't execute
        } else {
            System.out.println("Pear not found in LinkedList 3."); // This will execute
        }




    }
}
