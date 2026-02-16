import java.util.PriorityQueue;

public class HammingNumbers {

    public static void main(String[] args) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.add(1L);

        long currentHamming = 0;
        for (int i = 0; i < 20; i++) {
            currentHamming = queue.poll(); // Get the smallest Hamming number so far

            // Avoid duplicates by checking before adding
            if (!queue.contains(currentHamming * 2)) {
                queue.add(currentHamming * 2);
            }
            if (!queue.contains(currentHamming * 3)) {
                queue.add(currentHamming * 3);
            }
            if (!queue.contains(currentHamming * 5)) {
                queue.add(currentHamming * 5);
            }


            System.out.print(currentHamming + " ");
        }
    }
}
