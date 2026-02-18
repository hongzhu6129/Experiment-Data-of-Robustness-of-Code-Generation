import java.util.PriorityQueue;

public class HammingNumbers {

    public static void main(String[] args) {
        int n = 20;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.offer(1L);

        long[] hammingNumbers = new long[n];
        int count = 0;

        while (count < n) {
            long current = pq.poll();

            // Check if the current number is already added to the hammingNumbers array
            boolean alreadyAdded = false;
            for (int i = 0; i < count; i++) {
                if (hammingNumbers[i] == current) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                hammingNumbers[count++] = current;
                pq.offer(current * 2);
                pq.offer(current * 3);
                pq.offer(current * 5);
            }


        }

        System.out.print("The first " + n + " Hamming numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(hammingNumbers[i] + " ");
        }
    }
}
