import java.util.LinkedList;

public class CheckEmptyLinkedList {

    public static void main(String[] args) {
        // Example 1: Empty linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        checkEmpty(list1);

        // Example 2: Non-empty linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        checkEmpty(list2);


        //Example 3: Using isEmpty() directly in main (alternative approach)
        LinkedList<String> list3 = new LinkedList<>();
        System.out.println("List 3 is empty: " + list3.isEmpty());


        LinkedList<String> list4 = new LinkedList<>();
        list4.add("hello");
        System.out.println("List 4 is empty: " + list4.isEmpty());

    }

    public static void checkEmpty(LinkedList<?> list) { 
        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}
