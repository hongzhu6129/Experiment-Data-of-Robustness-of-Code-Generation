public class Main {
    public static void main(String[] args) {
        // Swap two variables (using a temporary variable)
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Print a face
        System.out.println("\nPrinting a face:");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+ ");


        // Swap two variables (without a temporary variable - using addition and subtraction)
        int x = 5;
        int y = 15;

        System.out.println("\nBefore swap (without temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("\nAfter swap (without temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // Swap two variables (using bitwise XOR - for integers only)
        int p = 7;
        int q = 23;
        
        System.out.println("\nBefore swap (bitwise XOR):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.println("\nAfter swap (bitwise XOR):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);



    }
}
