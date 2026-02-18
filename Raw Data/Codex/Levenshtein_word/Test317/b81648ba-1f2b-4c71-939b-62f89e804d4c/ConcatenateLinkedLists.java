import java.util.LinkedList;
import java.util.List;

public class ConcatenateLinkedLists {

    public static void main(String[] args) {
        // Create the first linked list
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second linked list
        List<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);


        // Method 1: Using addAll() -  Most efficient
        List<Integer> concatenatedList = new LinkedList<>(list1); // Create a copy to avoid modifying list1
        concatenatedList.addAll(list2); 

        System.out.println("Concatenated list (addAll): " + concatenatedList);


        // Method 2: Manual concatenation (less efficient, demonstrates iteration)
        List<Integer> concatenatedList2 = new LinkedList<>(list1);
        for (Integer element : list2) {
            concatenatedList2.add(element);
        }

        System.out.println("Concatenated list (manual): " + concatenatedList2);



       // Example with Strings (demonstrates generics):
        List<String> stringList1 = new LinkedList<>();
        stringList1.add("Hello");
        stringList1.add("World");

        List<String> stringList2 = new LinkedList<>();
        stringList2.add("Java");

        List<String> concatenatedStrings = new LinkedList<>(stringList1);
        concatenatedStrings.addAll(stringList2);

        System.out.println("Concatenated strings: " + concatenatedStrings);
    }
}
