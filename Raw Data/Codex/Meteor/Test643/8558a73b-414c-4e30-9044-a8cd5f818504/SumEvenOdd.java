import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class SumEvenOdd {

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        // Add some sample numbers to the list
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }


        // Create an ExecutorService with a fixed thread pool size (e.g., 2 for even and odd)
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create Callable tasks for even and odd sums
        Callable<Integer> evenSumTask = () -> {
            int sum = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    sum += num;
                }
            }
            return sum;
        };

        Callable<Integer> oddSumTask = () -> {
            int sum = 0;
            for (int num : numbers) {
                if (num % 2 != 0) {
                    sum += num;
                }
            }
            return sum;
        };


        // Submit the tasks to the executor
        Future<Integer> evenSumFuture = executor.submit(evenSumTask);
        Future<Integer> oddSumFuture = executor.submit(oddSumTask);


        // Retrieve the results (blocking until they're available)
        int evenSum = evenSumFuture.get();
        int oddSum = oddSumFuture.get();

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

        // Shutdown the executor service
        executor.shutdown(); 
    }
}
