import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to remove
        String elementToRemove = "Orange";

        // Remove the specified element 
        boolean removed = linkedList.remove(elementToRemove); // Removes first occurrence

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }


        // Example removing by index:
        int indexToRemove = 1; //Removes the element at index 1 (second element)
         if (indexToRemove >=0 && indexToRemove < linkedList.size()){
            String removedByIndex = linkedList.remove(indexToRemove);
            System.out.println("LinkedList after removing element at index " + indexToRemove + ": " + linkedList);
            System.out.println("Removed element: " + removedByIndex);

         } else {
            System.out.println("Invalid index. No element removed.");

         }
        
    }
}
