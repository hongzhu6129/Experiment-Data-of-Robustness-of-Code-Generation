import java.util.Arrays;

public class EmptyArray {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.println("Original array: " + Arrays.toString(names));

        // Method 1: Create a new empty array
        names = new String[0]; 

        System.out.println("Emptied array (Method 1): " + Arrays.toString(names));


        // Method 2: If you want to keep the same array object but remove all elements, set all elements to null.  This is generally preferred if you're working with a large array and want to avoid the overhead of creating a new one.
        String[] names2 = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < names2.length; i++) {
            names2[i] = null;
        }

        System.out.println("Emptied array (Method 2): " + Arrays.toString(names2));




        // Method 3 (if using a collection like ArrayList):
        // java.util.ArrayList<String> namesList = new java.util.ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        // namesList.clear(); // This is the most straightforward way to empty an ArrayList
        // System.out.println("Emptied ArrayList: " + namesList);



    }
}
