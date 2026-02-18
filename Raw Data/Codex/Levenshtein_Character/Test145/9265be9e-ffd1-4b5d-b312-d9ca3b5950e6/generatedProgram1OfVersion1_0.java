public class SwapVariables {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Method 1: Using a temporary variable
        int temp = a;
        a = b;
        b = temp;


        System.out.println("\nAfter swapping (using temporary variable):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Reset values for the next method
        a = 10;
        b = 20;


        // Method 2: Using addition and subtraction (ONLY if no overflow risk)
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping (using addition/subtraction):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


         // Reset values for the next method
        a = 10;
        b = 20;

        // Method 3: Using bitwise XOR (ONLY if no overflow risk)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping (using bitwise XOR):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
