import java.util.PriorityQueue;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(7);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] array1 = new Integer[priorityQueue.size()];
        priorityQueue.toArray(array1); 

        System.out.print("Array 1: ");
        for (Integer element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Method 2: Using toArray() with a generic type parameter
        Integer[] array2 = priorityQueue.toArray(new Integer[0]); // Or new Integer[priorityQueue.size()]

        System.out.print("Array 2: ");
        for (Integer element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();


        //Method 3 -  Iterating and adding to array (less efficient, demonstrates manual conversion):
        Integer[] array3 = new Integer[priorityQueue.size()];
        int i = 0;
        for (Integer element : priorityQueue) {
            array3[i++] = element;
        }

        System.out.print("Array 3: ");
        for (Integer element : array3) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Important Note:  priorityQueue.toArray() does NOT guarantee any specific order of elements in the resulting array.  It is NOT sorted according to priority. If you need the elements in sorted order, you will have to sort the array afterward or use a different approach.
    }
}
