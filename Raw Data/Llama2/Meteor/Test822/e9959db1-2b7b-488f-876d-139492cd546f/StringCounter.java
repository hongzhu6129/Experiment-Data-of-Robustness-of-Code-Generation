import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class StringCounter {

    public static void main(String[] args) throws InterruptedException {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apricot");
        strings.add("avocado");
        strings.add("blueberry");
        strings.add("orange");

        char startingLetter = 'a';
        int numThreads = 4; // Adjust as needed

        int count = countStringsStartingWith(strings, startingLetter, numThreads);

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);

    }

    public static int countStringsStartingWith(List<String> strings, char startingLetter, int numThreads) throws InterruptedException {
        int chunkSize = strings.size() / numThreads;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Integer>> futures = new ArrayList<>();


        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? strings.size() : start + chunkSize; // Handle last chunk

            Callable<Integer> worker = () -> {
                int localCount = 0;
                for (int j = start; j < end; j++) {
                    if (strings.get(j).charAt(0) == startingLetter) {
                        localCount++;
                    }
                }
                return localCount;
            };

            futures.add(executor.submit(worker));
        }

        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // Wait for all tasks to complete


        int totalCount = 0;
        for (Future<Integer> future : futures) {
            totalCount += future.get(); // Retrieve results from each tributary
        }

        return totalCount;
    }
}
