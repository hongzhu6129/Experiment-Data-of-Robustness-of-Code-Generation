import java.util.LinkedList;

public class CompareLinkedLists {

    public static void main(String[] args) {
        // Create two linked lists
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // Populate list1
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        // Populate list2 - make it initially the same as list1
        list2.add("apple");
        list2.add("banana");
        list2.add("cherry");


        // Compare the lists using equals()
        boolean areEqual = list1.equals(list2);
        System.out.println("List 1 and List 2 are equal: " + areEqual); // Output: true

        // Modify list2 
        list2.remove("banana"); 

        areEqual = list1.equals(list2);
        System.out.println("List 1 and List 2 are equal (after modification): " + areEqual); // Output: false


        // Example demonstrating different order leads to inequality
        list2.add("banana"); // Add banana back
        list2.addFirst("grape");  // Add at the beginning to change the order


        areEqual = list1.equals(list2);
        System.out.println("List 1 and List 2 are equal (different order): " + areEqual); // Output: false


        // Example demonstrating different data types (comparison will be false)
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);


        // Note: You'll get a compiler error if you uncomment the line below.
        // areEqual = list1.equals(list3); //  Incompatible types: LinkedList<String> and LinkedList<Integer>



       // Using size() and containsAll() for partial comparison (if order doesn't matter):

        LinkedList<String> list4 = new LinkedList<>();
        list4.add("cherry");
        list4.add("banana");


        if(list1.size() >= list4.size() && list1.containsAll(list4)){
            System.out.println("List 1 contains all elements of List 4: true"); // true, even though the order is different.
        } else{
             System.out.println("List 1 contains all elements of List 4: false");
        }






    }
}
