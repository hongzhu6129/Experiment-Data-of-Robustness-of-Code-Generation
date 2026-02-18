import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;


public class SleepSort {

    public static void sleepSortAndPrint(int[] arr) {
        int n = arr.length;
        ExecutorService executor = Executors.newFixedThreadPool(n); // Use a thread pool
        CountDownLatch latch = new CountDownLatch(n); // For synchronization
        List<Integer> sortedList = new ArrayList<>(); // Store sorted elements

        for (int num : arr) {
            executor.execute(new SortTask(num, sortedList, latch));
        }

        try {
            latch.await(); // Wait for all tasks to complete
        } catch (InterruptedException e) {
            System.err.println("Interrupted during sleep sort.");
        }

        executor.shutdown(); // Shut down the executor

        // Print the sorted list
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    private static class SortTask implements Runnable {
        private int value;
        private List<Integer> sortedList;
        private CountDownLatch latch;

        public SortTask(int value, List<Integer> sortedList, CountDownLatch latch) {
            this.value = value;
            this.sortedList = sortedList;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(value); // Sleep for the value's duration
                synchronized (sortedList) {  // Synchronize access to the shared list
                    sortedList.add(value);
                }
            } catch (InterruptedException e) {
                System.err.println("Task interrupted: " + value);
            } finally {
                latch.countDown(); // Signal task completion
            }

        }

    }


    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        sleepSortAndPrint(arr1);

        int[] arr2 = {5, 2, 8, 1, 9, 4};
        sleepSortAndPrint(arr2);

        // Test with an empty array
        int[] arr3 = {};
        sleepSortAndPrint(arr3);

        // Test with a single element
        int[] arr4 = {7};
        sleepSortAndPrint(arr4);


        int[] arr5 = {0, 0, 0, 1};  //Test with duplicates and zeros
        sleepSortAndPrint(arr5);

    }
}
