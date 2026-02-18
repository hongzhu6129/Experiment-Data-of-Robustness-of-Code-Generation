import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArraylist {

    public static void main(String[] args) {

        // 1. Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("Original LinkedList: " + linkedList);

        // 2. Converting LinkedList to ArrayList using the constructor
        ArrayList<String> arrayList1 = new ArrayList<>(linkedList); 

        System.out.println("ArrayList (using constructor): " + arrayList1);


        // 3. Converting LinkedList to ArrayList using addAll() method
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(linkedList);

        System.out.println("ArrayList (using addAll()): " + arrayList2);


        // Example with integers (to demonstrate type compatibility)
        LinkedList<Integer> numbersLinkedList = new LinkedList<>();
        numbersLinkedList.add(10);
        numbersLinkedList.add(20);
        numbersLinkedList.add(30);

        ArrayList<Integer> numbersArrayList = new ArrayList<>(numbersLinkedList);
        System.out.println("ArrayList of integers: " + numbersArrayList);


        // 4. Manual conversion using a loop (for educational purposes)
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (String fruit : linkedList) {  // Enhanced for loop (also called "for-each" loop)
            arrayList3.add(fruit); 
        }

        System.out.println("ArrayList (using manual loop): " + arrayList3);



        /*  Explanation of Key Differences and When to Use Which Method:

        * Constructor Method (new ArrayList<>(linkedList)):  This is generally the most concise and efficient way 
           to convert a LinkedList to an ArrayList. It directly copies the elements during the ArrayList's 
           initialization.

        * addAll() Method: This method is also efficient and is useful when you already have an existing 
          ArrayList and want to add all the elements of a LinkedList to it.

        * Manual Loop: This approach is primarily for demonstrating the underlying logic. In real-world scenarios,
          using the constructor or addAll() is preferred for better performance and readability. 


        *  Why convert between LinkedList and ArrayList?

           -  LinkedLists are better for frequent insertions and deletions within the list (especially in the middle), 
              as these operations are faster in a LinkedList.
           -  ArrayLists are generally better for accessing elements by index (using get()), as this operation is 
              much faster in an ArrayList (O(1) time complexity) compared to a LinkedList (O(n)).

           So, you might convert a LinkedList to an ArrayList if you initially need to do a lot of insertions/deletions
           but later primarily need to access elements by index.  Or you might do the reverse if your usage pattern changes.
        */


    }
}
