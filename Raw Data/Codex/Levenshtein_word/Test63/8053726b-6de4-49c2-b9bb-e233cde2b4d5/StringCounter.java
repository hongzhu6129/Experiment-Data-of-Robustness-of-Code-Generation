import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class StringCounter {

    public static void main(String[] args) throws Exception {

        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("apricot");
        strings.add("banana");
        strings.add("blueberry");
        strings.add("avocado");
        strings.add("orange");

        char startingLetter = 'a';

        int numThreads = 4; // Adjust as needed based on your system

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        List<Future<Integer>> futures = new ArrayList<>();

        int chunkSize = strings.size() / numThreads;  // Size of each sublist

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? strings.size() : start + chunkSize; // Handle last chunk

            List<String> sublist = strings.subList(start, end); 

            Callable<Integer> task = () -> {
                int count = 0;
                for (String str : sublist) {
                    if (str.charAt(0) == startingLetter) {
                        count++;
                    }
                }
                return count;
            };
            futures.add(executorService.submit(task));
        }

        int totalCount = 0;
        for (Future<Integer> future : futures) {
            totalCount += future.get(); // Get the result from each tributary (Future)
        }

        executorService.shutdown();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + totalCount);
    }
}
