import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArraylist {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Convert LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);


        // Print the ArrayList (to demonstrate the conversion)
        System.out.println("ArrayList: " + arrayList);


         //Example with Integers
        LinkedList<Integer> numberLinkedList = new LinkedList<>();
        numberLinkedList.add(1);
        numberLinkedList.add(2);
        numberLinkedList.add(3);

        ArrayList<Integer> numberArrayList = new ArrayList<>(numberLinkedList);
        System.out.println("Number ArrayList: " + numberArrayList);
    }
}
