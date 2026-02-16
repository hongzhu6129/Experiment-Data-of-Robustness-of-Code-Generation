public class DivideTwoNumbers {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 3;

        int result = numerator / denominator;

        System.out.println(result); // Output: 16 (integer division)


        // For a more precise result (including decimal part):
        double doubleNumerator = 50.0; // Or (double) numerator
        double doubleDenominator = 3.0; // Or (double) denominator
        double doubleResult = doubleNumerator / doubleDenominator;

        System.out.println(doubleResult); // Output: 16.666666666666668 
    }
}
