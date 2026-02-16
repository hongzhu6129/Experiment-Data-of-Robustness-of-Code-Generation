public class SwapAndFace {

    public static void main(String[] args) {
        // Swap two variables
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


        // Print a face
        System.out.println("\n +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


        //Swapping without temp variable
        int x = 5;
        int y = 10;

        System.out.println("\nBefore swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("\nAfter swapping (no temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
