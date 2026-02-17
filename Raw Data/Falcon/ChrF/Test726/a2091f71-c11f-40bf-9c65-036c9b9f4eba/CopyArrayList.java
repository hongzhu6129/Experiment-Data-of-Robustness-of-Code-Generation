import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {

    public static void main(String[] args) {

        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Method 1: Using the constructor
        ArrayList<String> list2 = new ArrayList<>(list1);

        // Method 2: Using addAll()
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);


        // Method 3: Using Collections.copy() (important considerations below)
        ArrayList<String> list4 = new ArrayList<>();
        // list4 must be at least as large as list1 before using copy
        list4.ensureCapacity(list1.size());  // Important to prevent IndexOutOfBoundsException
        for (int i = 0; i < list1.size(); i++) { // Pre-fill to make it same size
            list4.add(null); // Or some default value appropriate for your type
        }
        Collections.copy(list4, list1);



        // Method 4 - Java 8+ Stream API (creates a new list, doesn't copy into an existing one)
        List<String> list5 = list1.stream().collect(Collectors.toList());



        // Print all the lists to verify
        System.out.println("Original List: " + list1);
        System.out.println("Copy using constructor: " + list2);
        System.out.println("Copy using addAll(): " + list3);
        System.out.println("Copy using Collections.copy(): " + list4);
        System.out.println("Copy using Stream API: " + list5);



        //Demonstrating shallow copy behaviour (important!)
        ArrayList<StringBuilder> mutableList1 = new ArrayList<>();
        mutableList1.add(new StringBuilder("Hello"));

        //Both list6 and list7 will point to the SAME StringBuilder objects
        ArrayList<StringBuilder> list6 = new ArrayList<>(mutableList1);
        ArrayList<StringBuilder> list7 = new ArrayList<>();
        list7.addAll(mutableList1);

        //Modifying an element in the original list also modifies the copies
        mutableList1.get(0).append(" World!");  // This will be reflected in list6 and list7 as well!

        System.out.println("mutableList1: " + mutableList1);
        System.out.println("list6: " + list6);  // See how this has also changed!
        System.out.println("list7: " + list7);  // This one too!


    }
}
