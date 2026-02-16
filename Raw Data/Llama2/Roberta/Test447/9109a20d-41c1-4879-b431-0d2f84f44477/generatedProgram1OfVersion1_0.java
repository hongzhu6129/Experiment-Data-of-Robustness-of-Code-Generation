import java.util.LinkedList;

public class JoinLinkedLists {

    public static void main(String[] args) {
        // Create two sample LinkedLists
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");


        // Method 1: Using addAll() - Most Efficient
        System.out.println("Method 1: Using addAll()");
        LinkedList<String> combinedList1 = new LinkedList<>(list1); // Create a copy to avoid modifying the original
        combinedList1.addAll(list2); 
        System.out.println("Combined List 1: " + combinedList1);


        // Method 2: Iterating and adding elements individually
        System.out.println("\nMethod 2: Iterating and adding elements");
        LinkedList<String> combinedList2 = new LinkedList<>(list1); // Create a copy
        for (String fruit : list2) {
            combinedList2.add(fruit);
        }
        System.out.println("Combined List 2: " + combinedList2);



        // Method 3:  Using a Stream (Java 8+)  - Demonstrative, but can be less efficient for very large lists
        System.out.println("\nMethod 3: Using a Stream (Java 8+)");
        LinkedList<String> combinedList3 = new LinkedList<>();  //We create a new list here (unlike copying in the earlier methods).
        combinedList3.addAll(list1.stream().toList());  //Add all elements of list1 first
        combinedList3.addAll(list2.stream().toList());  //Add all elements of list2
        System.out.println("Combined List 3: " + combinedList3);


        // Important Note: If you don't need to preserve the original lists, 
        // you can add list2 directly to list1 using list1.addAll(list2).  
        // This modifies list1 in place.
        System.out.println("\nModifying list1 in place:");
        list1.addAll(list2); // list1 is now modified
        System.out.println("Modified list1: " + list1);





    }
}

