public class PentagonalNumbers {

    public static void main(String[] args) {
        // Display the first 50 pentagonal numbers
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%7d ", getPentagonalNumber(i)); // Format for alignment

            // Add a newline after every 10 numbers for better readability
            if (i % 10 == 0) {
                System.out.println(); 
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        // Calculate the nth pentagonal number using the formula n(3n-1)/2
        return n * (3 * n - 1) / 2; 
    }
}
