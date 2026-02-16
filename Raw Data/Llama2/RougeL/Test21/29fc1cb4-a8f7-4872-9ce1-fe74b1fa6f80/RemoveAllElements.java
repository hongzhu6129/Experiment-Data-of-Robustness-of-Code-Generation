import java.util.ArrayList;
import java.util.List;

public class RemoveAllElements {

    public static void main(String[] args) {
        // Create a sample list (you can replace this with your own list)
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        System.out.println("Original list: " + myList);

        // Remove all elements from the list
        myList.clear();  // This is the most efficient way to remove all elements

        System.out.println("List after removing all elements: " + myList);


        // Demonstrating another approach (less efficient, primarily for illustration):
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        System.out.println("Original number list: " + numberList);

        while (!numberList.isEmpty()) { // Remove elements one by one until the list is empty
            numberList.remove(0); // Removes the element at index 0
        }

        System.out.println("Number list after removing all elements (second approach): " + numberList);
    }
}
