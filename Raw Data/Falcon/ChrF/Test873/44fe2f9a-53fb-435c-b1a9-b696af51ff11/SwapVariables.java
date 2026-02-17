public class SwapVariables {

    public static void main(String[] args) {
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


        //Swapping without a temporary variable (using addition and subtraction)
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



          // Printing "put" (as requested in the prompt, though a bit unclear)
        System.out.println("\nput"); 
    }
}
