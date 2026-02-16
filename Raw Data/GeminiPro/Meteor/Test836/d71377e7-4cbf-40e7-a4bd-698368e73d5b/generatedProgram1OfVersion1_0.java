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

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Print a face
        System.out.println();
        System.out.println("  +\"\"\"\"+");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");

    }
}
