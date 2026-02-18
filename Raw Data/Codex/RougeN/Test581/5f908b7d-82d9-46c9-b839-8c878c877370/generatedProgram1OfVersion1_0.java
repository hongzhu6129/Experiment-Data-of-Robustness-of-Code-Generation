import java.util.ArrayList;
import java.util.List;

public class CosinesAndHamming {

    public static void main(String[] args) {

        // Part 1: First twenty cosine numbers
        System.out.println("First twenty cosine numbers:");
        for (int i = 0; i < 20; i++) {
            double cosine = Math.cos(i); // Calculate cosine for each number
            System.out.println("cos(" + i + ") = " + cosine);
        }
        System.out.println();


        // Part 2: First twenty Hamming numbers (optimized)
        System.out.println("First twenty Hamming numbers:");
        List<Long> hammingNumbers = new ArrayList<>();
        hammingNumbers.add(1L);  // Start with 1

        long next2 = 2;
        long next3 = 3;
        long next5 = 5;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < 20; i++) {
            long nextHamming = Math.min(next2, Math.min(next3, next5));
            hammingNumbers.add(nextHamming);


            if (nextHamming == next2) {
                next2 = 2 * hammingNumbers.get(++i2);
            }
            if (nextHamming == next3) {
                next3 = 3 * hammingNumbers.get(++i3);
            }
            if (nextHamming == next5) {
                next5 = 5 * hammingNumbers.get(++i5);
            }

        }

        for (Long num : hammingNumbers) {
            System.out.print(num + " ");
        }
        System.out.println(); 

    }
}
