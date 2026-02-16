import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty Linked List
        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.println("Is list1 empty? " + list1.isEmpty()); // Output: true

        // Example 2: Non-Empty Linked List
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("apple");
        list2.add("banana");
        System.out.println("Is list2 empty? " + list2.isEmpty()); // Output: false


        // Example 3:  Illustrating the difference between isEmpty() and size() == 0
        LinkedList<Double> list3 = new LinkedList<>();
        System.out.println("Is list3 empty using isEmpty()? " + list3.isEmpty()); // Output: true
        System.out.println("Is list3 empty using size()? " + (list3.size() == 0)); // Output: true

        list3.add(3.14);
        System.out.println("Is list3 empty using isEmpty()? " + list3.isEmpty()); // Output: false
        System.out.println("Is list3 empty using size()? " + (list3.size() == 0)); // Output: false


    }
}
