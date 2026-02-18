import java.util.LinkedList;

public class AppendToList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Date";

        // Append the element using add() - it adds to the end by default
        linkedList.add(elementToAppend);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example appending an integer (LinkedLists can store any object type)
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        int numberToAppend = 4;
        numberList.add(numberToAppend);  // Appending the integer

        System.out.println("Updated Number List: " + numberList);



        // Using offerLast() - explicitly adds to the end (functionally same as add())
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("Red");
        anotherList.add("Green");

        String anotherElement = "Blue";
        anotherList.offerLast(anotherElement); // Using offerLast() for appending

        System.out.println("Another Updated List: " + anotherList);
    }
}
