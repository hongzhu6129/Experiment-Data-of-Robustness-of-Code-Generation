import java.util.PriorityQueue;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<String> crawlQueue = new PriorityQueue<>();

        // Add elements (URLs or other crawl targets) -  Priority Queue orders by natural ordering (alphabetical for Strings)
        crawlQueue.add("https://example.com/page3");
        crawlQueue.add("https://example.com/page1");
        crawlQueue.add("https://example.com/page2");


        // Retrieve and print the first element (highest priority)
        if (!crawlQueue.isEmpty()) {
            String firstElement = crawlQueue.peek(); // peek() retrieves but doesn't remove
            System.out.println("First element (highest priority): " + firstElement);

            // If you want to remove the first element:
            //String removedFirst = crawlQueue.poll();  // poll() retrieves and removes


        } else {
            System.out.println("The priority queue is empty.");
        }
    }
}
