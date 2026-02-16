public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 2: Negative integers
        a = -5;
        b = -15;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 3: Zero and a positive integer
        a = 0;
        b = 50;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Test case 4: Two identical values
        a = 100;
        b = 100;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Test case 5: Integer.MAX_VALUE and Integer.MIN_VALUE (corner case)
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        System.out.println("Before swap: a = " + a + ", b = " + b);
         temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);



        //  Swapping without temp - Using addition and subtraction (beware of overflow/underflow)
        a = 10;
        b = 20;
        System.out.println("Before swap (no temp): a = " + a + ", b = " + b);
        a = a + b;  // a now holds the sum
        b = a - b;  // b now holds original a
        a = a - b;  // a now holds original b
        System.out.println("After swap (no temp): a = " + a + ", b = " + b); //Demonstrates alternative swap method



         // Swapping without temp - Using XOR (bitwise operation)
        a = 5;
        b = 8;
        System.out.println("Before swap (XOR): a = " + a + ", b = " + b); //Demonstrates XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap (XOR): a = " + a + ", b = " + b); //Demonstrates XOR swap

    }
}
