import java.util.concurrent.CountDownLatch;

class SleepSorter {

    public static void sleepSortAndPrint(int[] arr) {
        int n = arr.length;
        CountDownLatch latch = new CountDownLatch(n); // Used to wait for all threads to finish

        for (int num : arr) {
            new Thread(() -> {
                try {
                    Thread.sleep(num); // Sleep for a duration proportional to the number
                    System.out.print(num + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown(); // Decrement the latch count
                }
            }).start();
        }

        try {
            latch.await(); // Wait for all threads to complete
            System.out.println(); // Add a newline after printing all elements
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.print("Sorted array: ");
        sleepSortAndPrint(arr1);

        int[] arr2 = {5,2,9,1,5,6};
        System.out.print("Sorted array: ");
        sleepSortAndPrint(arr2);


         int[] arr3 = {8, 3, 0, 4, 12, 2};
        System.out.print("Sorted array: ");
        sleepSortAndPrint(arr3);


    }
}
