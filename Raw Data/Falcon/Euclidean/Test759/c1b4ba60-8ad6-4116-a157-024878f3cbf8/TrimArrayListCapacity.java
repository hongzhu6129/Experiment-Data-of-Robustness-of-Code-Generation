import java.util.ArrayList;

public class TrimArrayListCapacity {

    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(20); 

        // Add some elements (fewer than the initial capacity)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        System.out.println("Initial size: " + numbers.size());
        System.out.println("Initial capacity: " + getCapacity(numbers)); // Using reflection (explained below)


        // Trim the capacity to the current size
        numbers.trimToSize();

        System.out.println("Size after trim: " + numbers.size());
        System.out.println("Capacity after trim: " + getCapacity(numbers)); // Using reflection

    }



    // Helper function to get the capacity (as there's no direct method) using reflection
    //  Reflection is used here to access a private field, which is generally not recommended 
    //  in production code unless absolutely necessary due to its performance implications
    //  and potential fragility.
    private static int getCapacity(ArrayList<?> list) {
        try {
            java.lang.reflect.Field elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true); // Make the private field accessible
            Object[] elementData = (Object[]) elementDataField.get(list);
            return elementData.length; 
        } catch (Exception e) {
            // Handle exceptions (e.g., NoSuchFieldException, IllegalAccessException) appropriately in a real app
            e.printStackTrace();
            return -1; // Or throw a custom exception 
        }
    }
}

