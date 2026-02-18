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


        System.out.println("After swapping:");
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


         System.out.println("After swapping (without temp):");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


       // Swapping without temp (using multiplication and division - be cautious of potential overflow and divide by zero)
        int p = 7;
        int q = 21;
        
         System.out.println("\nBefore swapping (mult/div - use cautiously):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        p = p * q;
        q = p / q;  
        p = p / q;


        System.out.println("After swapping (mult/div - use cautiously):");
        System.out.println("p = " + p);
        System.out.println("q = " + q);


         //Swapping using bitwise XOR (^) - efficient for integers
        int m = 12;
        int n = 8;
        
         System.out.println("\nBefore swapping (XOR):");
        System.out.println("m = " + m);
        System.out.println("n = " + n);


         m = m ^ n;
         n = m ^ n;
         m = m ^ n;


        System.out.println("After swapping (XOR):");
        System.out.println("m = " + m);
        System.out.println("n = " + n);

    }
}
