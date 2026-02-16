import java.util.LinkedList;

public class CorrectTwoLinkedLists {

    public static void main(String[] args) {
        // Example usage:

        // Create two linked lists
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4); // Incorrect element

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(5); // Correct element
        list2.add(4);


        // Correct list1 based on list2 (replace incorrect element at index 2)
        correctLinkedList(list1, list2);

        // Print the corrected list
        System.out.println("Corrected List 1: " + list1);


         // Another example with different lengths and different types
        LinkedList<String> stringList1 = new LinkedList<>();
        stringList1.add("apple");
        stringList1.add("banana");
        stringList1.add("cherry"); // Incorrect

        LinkedList<String> stringList2 = new LinkedList<>();
        stringList2.add("apple");
        stringList2.add("orange"); // Correct
       

        correctLinkedList(stringList1, stringList2);
        System.out.println("Corrected String List 1: " + stringList1);



        // Example where list2 is shorter - elements beyond list2's size remain unchanged.
        LinkedList<Double> doubleList1 = new LinkedList<>();
        doubleList1.add(1.1);
        doubleList1.add(2.2);
        doubleList1.add(3.3);
        doubleList1.add(4.4);

        LinkedList<Double> doubleList2 = new LinkedList<>();
        doubleList2.add(1.1);
        doubleList2.add(5.5);



        correctLinkedList(doubleList1, doubleList2);
        System.out.println("Corrected Double List 1: " + doubleList1);

    }


    public static <T> void correctLinkedList(LinkedList<T> list1, LinkedList<T> list2) {
        for (int i = 0; i < list1.size() && i < list2.size(); i++) {
            // Replace element in list1 if different from list2
             list1.set(i, list2.get(i));
        }
    }
}
