public class Main {
    public static void main(String[] args) {
        // Swap two variables (using a third temporary variable)
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



        // Print a face
        System.out.println("\nPrinting a face:");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


        // Swapping without a temporary variable (using addition and subtraction)
        int x = 5;
        int y = 15;

        System.out.println("\nBefore swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;  // x now holds the sum
        y = x - y;  // y now holds the original x
        x = x - y;  // x now holds the original y

        System.out.println("\nAfter swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

     //Swapping using bitwise XOR (^)
        int p = 25;
        int q = 50;
        System.out.println("\nBefore swapping using XOR:");
        System.out.println("p = "+p);
        System.out.println("q = "+q);
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.println("\nAfter swapping using XOR:");
        System.out.println("p = "+p);
        System.out.println("q = "+q);
    }
}
