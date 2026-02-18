import java.util.LinkedList;

public class EmblazonLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Element to emblazon (add to the end)
        String elementToEmblazon = "Date";

        // Emblazon the element
        myList.addLast(elementToEmblazon); // or myList.add(elementToEmblazon);  Both achieve the same result.


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + myList);


        //More examples for various data types
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.addLast(3); // Emblazon 3
        System.out.println("Integer List: " + intList);


        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3); // Emblazon 3.3
        System.out.println("Double List: " + doubleList);

    }
}
