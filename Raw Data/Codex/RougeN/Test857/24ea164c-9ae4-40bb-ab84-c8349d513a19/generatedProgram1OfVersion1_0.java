import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.println("Is list1 empty? " + list1.isEmpty()); // Output: true

        // Example 2: Non-empty linked list
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("apple");
        list2.add("banana");
        System.out.println("Is list2 empty? " + list2.isEmpty()); // Output: false

        // Example 3: Checking emptiness after removing elements
        LinkedList<Double> list3 = new LinkedList<>();
        list3.add(1.1);
        list3.add(2.2);
        list3.remove(); //remove the head. 
        list3.remove();//remove the head again
        System.out.println("Is list3 empty? " + list3.isEmpty()); // Output: true


        // Example using size to check for empty
        LinkedList<Character> list4 = new LinkedList<>();
        System.out.println("Is list4 empty using size? " + (list4.size() == 0) ); // Output: true

        list4.add('A');

        System.out.println("Is list4 empty using size? " + (list4.size() == 0) ); // Output: false
    }
}
