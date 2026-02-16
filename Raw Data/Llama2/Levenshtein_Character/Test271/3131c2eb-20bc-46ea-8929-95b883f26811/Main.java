public class Main {
    public static void main(String[] args) {
        // Swap two variables (using a temporary variable)
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


        // Swap two variables (without a temporary variable - using addition and subtraction)
        int x = 5;
        int y = 15;
        System.out.println("\nBefore swapping (without temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nAfter swapping (without temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }
}
