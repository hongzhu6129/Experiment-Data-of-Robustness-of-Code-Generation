public class Main {
    public static void main(String[] args) {

        // Swapping seven variables (a, b, c, d, e, f, g) using a temporary variable
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;
        int temp;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f + ", g = " + g);

        temp = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = f;
        f = g;
        g = temp;



        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + ", f = " + f + ", g = " + g);


        // Printing a face
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");


    }
}
