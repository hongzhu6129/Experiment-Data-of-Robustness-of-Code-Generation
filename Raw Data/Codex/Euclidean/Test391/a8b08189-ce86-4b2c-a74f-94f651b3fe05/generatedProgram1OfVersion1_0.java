import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StringSorter {

    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");


        // Using tributaries (ExecutorService) for sorting

        ExecutorService executor = Executors.newFixedThreadPool(2); // Create a thread pool with 2 threads

        // Ascending Sort
        Future<List<String>> ascendingFuture = executor.submit(() -> {
            List<String> ascendingList = new ArrayList<>(strings); // Create a copy to avoid modification issues
            Collections.sort(ascendingList);
            return ascendingList;
        });

        // Descending Sort
        Future<List<String>> descendingFuture = executor.submit(() -> {
            List<String> descendingList = new ArrayList<>(strings);  // Create a copy
            Collections.sort(descendingList, Collections.reverseOrder());
            return descendingList;
        });

        // Get the results
        List<String> ascendingSortedList = ascendingFuture.get();
        List<String> descendingSortedList = descendingFuture.get();

        executor.shutdown(); // Shutdown the executor service

        // Print the results
        System.out.println("Ascending Order:");
        ascendingSortedList.forEach(System.out::println);

        System.out.println("\nDescending Order:");
        descendingSortedList.forEach(System.out::println);

    }
}
