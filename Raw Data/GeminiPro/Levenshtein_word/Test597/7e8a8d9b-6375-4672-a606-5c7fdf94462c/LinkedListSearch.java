import java.util.LinkedList;

public class LinkedListSearch {

    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to search for
        int elementToSearch = 30;

        // Check if the element exists using contains()
        if (numbers.contains(elementToSearch)) {
            System.out.println(elementToSearch + " exists in the linked list.");
        } else {
            System.out.println(elementToSearch + " does not exist in the linked list.");
        }


        // Example searching for an element that doesn't exist:
        elementToSearch = 15;  
        if (numbers.contains(elementToSearch)) {
            System.out.println(elementToSearch + " exists in the linked list.");
        } else {
            System.out.println(elementToSearch + " does not exist in the linked list.");
        }
    }
}
