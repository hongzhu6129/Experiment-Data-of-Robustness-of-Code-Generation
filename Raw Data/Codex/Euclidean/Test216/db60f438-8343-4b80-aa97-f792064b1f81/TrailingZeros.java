public class TrailingZeros {

    public static void main(String[] args) {
        int n = 7; // Example input
        int trailingZeros = countTrailingZeros(n);
        System.out.println("Number of trailing zeros in " + n + "! is: " + trailingZeros);

        n = 10; // Example input
        trailingZeros = countTrailingZeros(n);
        System.out.println("Number of trailing zeros in " + n + "! is: " + trailingZeros);
        
        n = 100; // Example input for a larger number
        trailingZeros = countTrailingZeros(n);
        System.out.println("Number of trailing zeros in " + n + "! is: " + trailingZeros);


    }

    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }
}
