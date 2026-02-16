import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String elementToInsert = "Grape";

        // Insert the element at the end using add()
        linkedList.add(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with Integers
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        int numberToInsert = 40;
        numberList.add(numberToInsert); // add() works for any data type

        System.out.println("Updated Number List: " + numberList);

       //Demonstrating offerLast() which is equivalent to add() for inserting at the end
        LinkedList<Character> charList = new LinkedList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');

       char charToInsert = 'D';
       charList.offerLast(charToInsert);

       System.out.println("Updated Char List using offerLast(): " + charList);

    }
}



