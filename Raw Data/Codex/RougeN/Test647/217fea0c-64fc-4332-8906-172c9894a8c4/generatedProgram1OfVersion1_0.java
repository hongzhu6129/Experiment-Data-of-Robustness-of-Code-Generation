import java.util.Arrays;

public class RoundUpRanks {

    public static void main(String[] args) {
        // Example usage:
        double[] ranks = {1.2, 3.7, 2.1, 4.9, 5.5, 0.8};

        // Round up the ranks and store them in an integer array
        int[] roundedRanks = new int[ranks.length];
        for (int i = 0; i < ranks.length; i++) {
            roundedRanks[i] = (int) Math.ceil(ranks[i]);
        }


        System.out.println("Original ranks: " + Arrays.toString(ranks));
        System.out.println("Rounded up ranks: " + Arrays.toString(roundedRanks));



        // Example with potentially negative ranks (demonstrates handling negative values):
        double[] ranks2 = {-1.2, 0.5, 2.1, -4.9};
        int[] roundedRanks2 = new int[ranks2.length];
        for (int i = 0; i < ranks2.length; i++) {
            roundedRanks2[i] = (int) Math.ceil(ranks2[i]);
        }
        System.out.println("\nOriginal ranks: " + Arrays.toString(ranks2));
        System.out.println("Rounded up ranks: " + Arrays.toString(roundedRanks2));

         //Example with zero ranks:
        double[] ranks3 = {0, 0.5, 2.1, 0};
        int[] roundedRanks3 = new int[ranks3.length];
        for (int i = 0; i < ranks3.length; i++) {
            roundedRanks3[i] = (int) Math.ceil(ranks3[i]);
        }
        System.out.println("\nOriginal ranks: " + Arrays.toString(ranks3));
        System.out.println("Rounded up ranks: " + Arrays.toString(roundedRanks3));


    }
}
