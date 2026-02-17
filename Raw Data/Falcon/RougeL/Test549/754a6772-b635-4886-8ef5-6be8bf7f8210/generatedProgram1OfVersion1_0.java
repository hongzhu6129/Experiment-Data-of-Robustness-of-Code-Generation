import java.util.ArrayList;

public class ArrayListTrimCapacity {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>(20); // Initial capacity of 20

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // 3. Checking initial capacity and size
        System.out.println("Initial Capacity: " + getCapacity(fruits)); // Demonstrating how to get capacity (reflection)
        System.out.println("Initial Size: " + fruits.size());


        // 4. Trimming the capacity
        fruits.trimToSize(); // Reduces capacity to match the current size



        // 5. Checking capacity and size after trimming
        System.out.println("Capacity after trimToSize(): " + getCapacity(fruits));
        System.out.println("Size after trimToSize(): " + fruits.size());


        // 6. Explanation and benefits
        System.out.println("\nExplanation:");
        System.out.println("ArrayLists in Java often allocate more memory than initially needed for efficiency.");
        System.out.println("trimToSize() is used to reduce the capacity of the ArrayList to exactly the number of elements it currently holds.");
        System.out.println("This can be useful for saving memory, especially if you know the ArrayList won't be growing further.");
        System.out.println("However, note that if you add more elements after trimming, the ArrayList will have to reallocate memory again, which can be slightly less efficient.");


        // 7. Example showing reallocation after trimming
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        System.out.println("\nCapacity after adding more elements: " + getCapacity(fruits));
        System.out.println("Notice that the capacity increased again after adding more elements.");


        // 8. Alternative for setting an initial capacity more precisely (Java 19 and later)
        System.out.println("\nUsing rightsized() for precise initial capacity (Java 19+):");
        ArrayList<Integer> numbers = ArrayList.of(1, 2, 3, 4, 5);  // Creates an ArrayList with the exact capacity needed
        System.out.println("Capacity of 'numbers': " + getCapacity(numbers));
        System.out.println("This approach avoids unnecessary initial over-allocation.");


    }

    // Helper method to get capacity (using reflection � not usually needed in real code)
    private static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field dataField = ArrayList.class.getDeclaredField("elementData");
            dataField.setAccessible(true);
            return ((Object[]) dataField.get(list)).length;
        } catch (Exception e) {
            return -1; // Error getting capacity
        }
    }
}
