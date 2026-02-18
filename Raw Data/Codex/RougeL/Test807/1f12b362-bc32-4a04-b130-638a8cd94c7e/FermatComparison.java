public class FermatComparison {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Comparisons:");

        for (int n = 0; n < 10; n++) {
            long fermatNumber = calculateFermatNumber(n);
            double fermatDouble = (double) fermatNumber;  // Cast to double for comparison

            System.out.println(fermatDouble + ".0"); 
        }
    }

    private static long calculateFermatNumber(int n) {
        return (long) Math.pow(2, Math.pow(2, n)) + 1;
    }
}
