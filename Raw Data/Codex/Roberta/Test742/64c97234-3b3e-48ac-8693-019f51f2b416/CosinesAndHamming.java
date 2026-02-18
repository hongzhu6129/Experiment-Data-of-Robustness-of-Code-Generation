import java.util.ArrayList;
import java.util.List;

public class CosinesAndHamming {

    public static void main(String[] args) {

        // Part 1: First twenty cosine numbers
        System.out.println("First twenty cosine numbers:");
        for (int i = 0; i < 20; i++) {
            double angle = i; // You can adjust the angle generation as needed
            double cosine = Math.cos(angle);
            System.out.println("Cos(" + angle + ") = " + cosine);
        }


        // Part 2: First twenty Hamming numbers
        System.out.println("\nFirst twenty Hamming numbers:");
        List<Integer> hammingNumbers = new ArrayList<>();

        for (int i = 1; hammingNumbers.size() < 20; i++) {
            if (isHamming(i)) {
                hammingNumbers.add(i);
            }
        }

        System.out.println(hammingNumbers);


    }

    // Helper function to check if a number is a Hamming number
    private static boolean isHamming(int n) {
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }

}
