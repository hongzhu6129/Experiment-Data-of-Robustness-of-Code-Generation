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
        // Using addition and subtraction (avoids temporary variable)
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);



        // Test case 3: Zero and a positive integer
        a = 0;
        b = 50;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Using bitwise XOR (avoids temporary variable and overflow issues)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = " + a + ", b = " + b);


        // Test case 4: Two identical values
        a = 100;
        b = 100;
        System.out.println("Before swap: a = " + a + ", b = " + b);
         // Using a temporary variable (though unnecessary in this case)
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);



        // Test case 5: Integer.MAX_VALUE and Integer.MIN_VALUE (Corner case for addition/subtraction method)
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Using bitwise XOR (safe for overflow)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = " + a + ", b = " + b);



    }
}
