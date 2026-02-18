import java.util.ArrayList;

public class TrimArrayList {

    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<Integer> numbers = new ArrayList<>(20);

        // Add some elements (fewer than the initial capacity)
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Print initial capacity and size
        System.out.println("Initial Capacity: " + numbers.size()); // Note: This prints size, not capacity directly
        System.out.println("Initial Size: " + numbers.size());

        // Trim the capacity to the current size
        numbers.trimToSize();


        // There's no direct way in standard Java to check capacity after trimToSize.
        //  Some JVM implementations *might* reflect the change if you use reflection, 
        //  but that's implementation-dependent and not guaranteed.  The key thing to
        //  understand is that trimToSize is meant to reclaim unused memory.  It's not
        //  meant to prevent the list from growing again if needed.

        System.out.println("Capacity after trimToSize():  (No direct way to get this reliably)");
        System.out.println("Size after trimToSize(): " + numbers.size());


        // Demonstrate that the list can still grow
        numbers.add(6);
        numbers.add(7);
        System.out.println("Size after adding more elements: " + numbers.size());


    }
}
