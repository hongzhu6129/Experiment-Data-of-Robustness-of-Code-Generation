import java.util.LinkedList;

public class RemoveAllFromLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements from the LinkedList
        linkedList.clear(); // Most efficient way

        // Alternatively, you could use a loop and removeFirst() or removeLast() repeatedly,
        // but clear() is generally preferred for removing all elements.
        // while (!linkedList.isEmpty()) {
        //     linkedList.removeFirst(); // Or linkedList.removeLast(); 
        // }



        System.out.println("LinkedList after removing all elements: " + linkedList);


        //  Another Example (using Integer)
         LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original numbers LinkedList: " + numbers);
        numbers.clear();
        System.out.println("Numbers LinkedList after clearing: " + numbers);


    }
}
