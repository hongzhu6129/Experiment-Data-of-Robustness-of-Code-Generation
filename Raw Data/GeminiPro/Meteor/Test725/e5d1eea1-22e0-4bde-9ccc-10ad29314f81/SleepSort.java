import java.util.concurrent.CountDownLatch;

public class SleepSort {

    public static void sleepSortAndPrint(int[] arr) {
        int n = arr.length;
        CountDownLatch latch = new CountDownLatch(n); // Used to wait for all threads to complete

        for (int num : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(num); // Sleep for a duration proportional to the number
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown(); // Signal thread completion
                }
            }).start();
        }

        try {
            latch.await(); // Wait for all threads to finish
            System.out.println(); // Print a newline after all numbers are printed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void run() {
        // This method is not used in this implementation
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.print("Sorted array: ");
        sleepSortAndPrint(arr1);


        int[] arr2 = {5, 2, 8, 1, 9, 4};
        System.out.print("Sorted array: ");
        sleepSortAndPrint(arr2);
    }
}
