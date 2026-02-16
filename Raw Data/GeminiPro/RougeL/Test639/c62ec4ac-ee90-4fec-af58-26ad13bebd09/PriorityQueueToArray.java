import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(8);
        pq.add(3);
        pq.add(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] arr1 = new Integer[pq.size()];
        arr1 = pq.toArray(arr1);
        System.out.println("Array 1 (pre-allocated): " + Arrays.toString(arr1));


        // Method 2: Using toArray() without a pre-allocated array
        Object[] arr2 = pq.toArray();
        Integer[] arr3 = new Integer[arr2.length];  // Create an Integer array of the correct size

        // Copy elements from Object[] to Integer[] (necessary to avoid ClassCastException later)
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = (Integer) arr2[i]; // Cast each element to Integer
        }


        System.out.println("Array 2 (converted from Object[]): " + Arrays.toString(arr3));


        //Demonstrate why direct use of the Object[] might lead to issues:
        //Trying to directly treat elements of arr2 as Integer will result in a runtime exception
        // Uncommenting this section will result in a ClassCastException
       /* try {
            int val = (int) arr2[0]; // This will throw a ClassCastException
            System.out.println("Value from Object array: " + val);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: Cannot directly cast Object[] elements to int.");
        }*/

    }
}
