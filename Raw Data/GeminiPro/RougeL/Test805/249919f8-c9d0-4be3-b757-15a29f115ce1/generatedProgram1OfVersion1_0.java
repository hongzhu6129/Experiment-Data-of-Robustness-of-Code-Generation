public class SwapAndFace {

    public static void main(String[] args) {
        // Swapping two variables
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Drawing a face (ASCII art)
        System.out.println("\nHere's a face:");
        System.out.println("     -----");
        System.out.println("    | o o |");
        System.out.println("    |  ^  |");
        System.out.println("    | '-' |");
        System.out.println("     -----");

       // Alternative swap without temp (using addition and subtraction)
       /*  
        a = a + b;
        b = a - b;
        a = a - b;
       */

       // Alternative swap without temp (using XOR - bitwise exclusive OR)
       /*
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
       */ 

    }
}
