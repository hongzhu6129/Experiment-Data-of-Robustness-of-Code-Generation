public class SwapSevenVariables {

    public static void main(String[] args) {
        // Initialize seven variables
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;

        System.out.println("Original values:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f + ", g = " + g);


        // Swapping using a temporary variable
        int temp;

        // Swap a and g
        temp = a;
        a = g;
        g = temp;

        // Swap b and f
        temp = b;
        b = f;
        f = temp;

        // Swap c and e
        temp = c;
        c = e;
        e = temp;


        System.out.println("\nSwapped values:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f + ", g = " + g);
    }
}
