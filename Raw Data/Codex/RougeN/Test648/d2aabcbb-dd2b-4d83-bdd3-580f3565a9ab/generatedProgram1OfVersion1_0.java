public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);


        // Test case 2: Negative integers
        a = -5;
        b = -15;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);


        // Test case 3: Zero values
        a = 0;
        b = 100;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);



        // Test case 4:  Both Zeroes
        a = 0;
        b = 0;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);



        // Test case 5: Large numbers (to check for potential overflow, though unlikely with ints)
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);



        // Using arithmetic operators (addition and subtraction) -  avoid in real code due to potential overflow.
        a = 50;
        b = 70;
        System.out.println("Before swapping (arithmetic): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (arithmetic): a = " + a + ", b = " + b);


        //Using bitwise XOR (also avoid in real code for clarity, unless performance is absolutely critical).
        a = 25;
        b = 35;
        System.out.println("Before swapping (bitwise): a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping (bitwise): a = " + a + ", b = " + b);



    }
}
