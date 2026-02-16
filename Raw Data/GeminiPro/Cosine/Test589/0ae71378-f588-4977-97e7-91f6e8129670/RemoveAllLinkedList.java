import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements using clear()
        linkedList.clear(); 

        System.out.println("LinkedList after removing all elements: " + linkedList);


        //Demonstrating another way to remove all elements (iterative removal)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original numbers LinkedList: " + numbers);

       while (!numbers.isEmpty()) {
            numbers.removeFirst(); // Or numbers.removeLast() - depends which end you want to remove from
        }


        System.out.println("numbers LinkedList after iterative removal: " + numbers);



    }
}
