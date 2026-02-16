public class SwapAndFace {

    public static void main(String[] args) {
        // Swapping two variables
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Drawing a face (ASCII art)
        System.out.println("\nHere's a face:");
        System.out.println("  +\"\"\"\"+ ");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");


        // Swapping without a temporary variable (using addition and subtraction)
        int x = 5;
        int y = 15;

        System.out.println("\nBefore swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nAfter swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


         // Swapping without a temporary variable (using bitwise XOR)  More efficient
        int p = 25;
        int q = 35;


        System.out.println("\nBefore swapping (XOR):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        p = p ^ q;
        q = p ^ q;
        p = p ^ q;


        System.out.println("\nAfter swapping (XOR):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}
