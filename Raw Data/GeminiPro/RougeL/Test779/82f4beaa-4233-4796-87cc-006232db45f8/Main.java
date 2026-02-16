public class Main {
    public static void main(String[] args) {

        // Swapping two variables using a temporary variable
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping using a temporary variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Swapping without a temporary variable (using addition and subtraction)
        int x = 5;
        int y = 15;

        System.out.println("\nBefore swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        x = x + y;  // x now holds the sum
        y = x - y;  // y now holds the original x
        x = x - y; // x now holds the original y

        System.out.println("\nAfter swapping using addition/subtraction:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // Swapping without temp (using multiplication and division - be careful of 0!)
        int p = 7;
        int q = 21;


        System.out.println("\nBefore swapping:");
        System.out.println("p = " + p);
        System.out.println("q = " + q);


        p = p * q;
        q = p / q;
        p = p / q;



        System.out.println("\nAfter swapping using multiplication/division:");
        System.out.println("p = " + p);
        System.out.println("q = " + q);


        // Printing a face
        System.out.println("\nPrinting a face:");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


    }
}
