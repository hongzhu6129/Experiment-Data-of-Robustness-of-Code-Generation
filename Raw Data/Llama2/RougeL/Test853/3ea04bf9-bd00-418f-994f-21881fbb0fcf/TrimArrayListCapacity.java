import java.util.ArrayList;

public class TrimArrayListCapacity {

    public static void main(String[] args) {
        // 1. Create an ArrayList with an initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(20); // Initial capacity of 20

        // 2. Add elements to the ArrayList (fewer than the initial capacity)
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // 3. Print initial size and capacity
        System.out.println("Initial size: " + numbers.size()); // Output: 10
        System.out.println("Initial capacity: " + getCapacity(numbers)); // Output: 20 (or higher, depending on implementation)

        // 4. Trim the capacity to the current size using trimToSize()
        numbers.trimToSize();

        // 5. Print size and capacity after trimming
        System.out.println("Size after trimToSize(): " + numbers.size()); // Output: 10
        System.out.println("Capacity after trimToSize(): " + getCapacity(numbers)); // Output: 10 (or close to it)


        // Example showing why trimming can be useful (memory saving)
        ArrayList<String> largeList = new ArrayList<>(1000000); // Large initial capacity
        for (int i = 0; i < 10000; i++) {
            largeList.add("Some string"); // Add only 10,000 elements
        }

        System.out.println("Large list initial capacity: " + getCapacity(largeList));

        largeList.trimToSize();

        System.out.println("Large list capacity after trimming: " + getCapacity(largeList)); // Significant reduction in capacity

        // Important Note: trimToSize() in newer Java versions (11+) might not always 
        // give the exact size as the capacity. The internal implementation can vary.


        // Creating a new ArrayList with the correct size: Another way to "trim"
        ArrayList<Integer> trimmedList = new ArrayList<>(numbers); // Copies elements


        System.out.println("New trimmed list size: " + trimmedList.size());
        System.out.println("New trimmed list capacity : " + getCapacity(trimmedList)); // Similar to size


    }


    // Helper function to get the capacity (implementation detail not directly accessible)
    //  - Reflection is used for educational/demonstration purposes here. 
    //  - This shouldn't be done in regular production code.
    static int getCapacity(ArrayList<?> list) {

        try {
            java.lang.reflect.Field elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
            return ((Object[]) elementDataField.get(list)).length;
        } catch (Exception e) {
            return -1; // Or handle appropriately in a real application
        }

    }



}
