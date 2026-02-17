public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b; // b now holds the sum
        a = b - a; // a now holds the original value of b
        b = b - a; // b now holds the original value of a
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 2: Negative integers
        a = -5;
        b = -15;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 3: One positive, one negative
        a = 7;
        b = -3;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Test case 4: Zero values
        a = 0;
        b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap: a = " + a + ", b = " + b);

        a = 5;
        b = 0;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 5: Large numbers (to check for potential overflow.  While this method *can* overflow,
        // using addition/subtraction minimizes the risk compared to multiplication/division.)
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        b = a + b; // Potential overflow here!
        a = b - a; 
        b = b - a; 
        System.out.println("After swap: a = " + a + ", b = " + b);




        // Using a temporary variable (more robust, handles overflow properly):  Demonstrating a safer alternative
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        System.out.println("Before swap (using temp): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (using temp): a = " + a + ", b = " + b);
    }
}
