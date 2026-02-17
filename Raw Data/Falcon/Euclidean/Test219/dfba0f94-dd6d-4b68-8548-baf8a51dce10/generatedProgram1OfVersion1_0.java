public class SwapParameters {

    public static void main(String[] args) {

        // Test cases:

        // 1. Regular numbers
        swap(5, 10);

        // 2. Negative numbers
        swap(-3, 7);

        // 3. Zero values
        swap(0, 15);
        swap(0, 0);  // Both zero

        // 4. Large numbers
        swap(Integer.MAX_VALUE, Integer.MIN_VALUE); // Max and Min values
        swap(1000000000, 2000000000); // Large positive numbers


    }

    public static void swap(int a, int b) {
        System.out.println("Original values: a = " + a + ", b = " + b);

        // Using XOR to swap (avoids temporary variable and overflow issues)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("Swapped values: a = " + a + ", b = " + b);
        System.out.println("------------------");
    }
}



