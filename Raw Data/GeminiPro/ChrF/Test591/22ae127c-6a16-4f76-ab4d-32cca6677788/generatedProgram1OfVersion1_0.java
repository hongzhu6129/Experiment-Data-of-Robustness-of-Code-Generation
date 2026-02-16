import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShuffleLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);

        // Shuffle the LinkedList using Collections.shuffle()
        Collections.shuffle(linkedList);

        System.out.println("Shuffled LinkedList: " + linkedList);


        // Example with Strings:
        LinkedList<String> stringLinkedList = new LinkedList<>(List.of("apple", "banana", "cherry", "date"));
        System.out.println("Original String LinkedList: " + stringLinkedList);
        Collections.shuffle(stringLinkedList);
        System.out.println("Shuffled String LinkedList: " + stringLinkedList);
    }
}
