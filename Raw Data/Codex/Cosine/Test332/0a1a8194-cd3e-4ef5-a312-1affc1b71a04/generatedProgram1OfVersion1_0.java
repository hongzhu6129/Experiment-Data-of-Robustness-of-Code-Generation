import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Convert LinkedList to ArrayList using constructor
        List<String> arrayList = new ArrayList<>(linkedList); 

        // Print the ArrayList (or do other operations with it)
        System.out.println("ArrayList: " + arrayList);


        //Another example, using Integer types:
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);
        List<Integer> intArrayList = new ArrayList<>(intLinkedList);
        System.out.println("Integer ArrayList: " + intArrayList);

    }
}
