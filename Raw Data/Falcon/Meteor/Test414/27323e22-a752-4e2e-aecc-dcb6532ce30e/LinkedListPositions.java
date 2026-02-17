import java.util.LinkedList;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");


        // Display elements and their positions using a for loop and get()
        System.out.println("Elements and their positions (using get()):");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at position " + i + ": " + linkedList.get(i));
        }

        System.out.println("\nElements and their positions (using enhanced for loop with index):");
        int index = 0;
        for (String element : linkedList) {
            System.out.println("Element at position " + index + ": " + element);
            index++;
        }



    }
}
