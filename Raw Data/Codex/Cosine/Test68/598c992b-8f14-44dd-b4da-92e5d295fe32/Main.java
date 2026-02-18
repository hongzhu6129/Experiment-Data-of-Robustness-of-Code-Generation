public class Main {
    public static void main(String[] args) {
        // Swapping seven variables (a, b, c, d, e, f, g) using a temporary variable 'temp'

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;

        System.out.println("Original values: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + ", g=" + g);


        int temp = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = f;
        f = g;
        g = temp;



        System.out.println("Swapped values: a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + ", g=" + g);



        // Printing a face
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

    }
}
