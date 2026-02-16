public class FactorsOfThree {

    public static void main(String[] args) {
        test(27); // Example usage: Factors of 3 in 27
        test(12); // Example usage: Factors of 3 in 12
        test(5);  // Example usage: Factors of 3 in 5
    }

    public static void test(int n) {
        int count = 0;
        while (n > 0 && n % 3 == 0) {
            count++;
            n /= 3;
        }
        System.out.println("Factors of 3 in the given integer: " + count);
    }
}
