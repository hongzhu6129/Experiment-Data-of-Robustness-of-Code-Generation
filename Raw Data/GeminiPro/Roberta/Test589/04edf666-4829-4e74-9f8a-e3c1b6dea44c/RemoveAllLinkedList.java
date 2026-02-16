import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove all elements using clear()
        linkedList.clear();

        System.out.println("LinkedList after removing all elements: " + linkedList);


        //Alternative method using removeAll() (though clear() is generally preferred for clearing entire list)
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original Numbers LinkedList: " + numbers);

        numbers.removeAll(numbers); // Removes all elements that are present in 'numbers' (which is all of them)

        System.out.println("Numbers LinkedList after removing all elements: " + numbers);


    }
}
