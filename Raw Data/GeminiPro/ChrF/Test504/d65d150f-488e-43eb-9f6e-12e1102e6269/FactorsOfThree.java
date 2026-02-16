public class FactorsOfThree {

    public static void main(String[] args) {
        test(12); // Example usage: Factors of 3 in 12
        test(27); // Example usage: Factors of 3 in 27
        test(10); // Example usage: Factors of 3 in 10 
    }

    public static void test(int n) {
        System.out.print("Factors of 3 in " + n + ": ");
        int factor = 3;
        while (n % factor == 0) {
            System.out.print(factor + " ");
            n /= factor;
        }
        System.out.println(); // New line for clarity
    }
}
