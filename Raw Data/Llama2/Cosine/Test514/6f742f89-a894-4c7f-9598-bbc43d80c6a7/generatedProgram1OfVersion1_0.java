public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();


        // Test case 2: Negative integers
        a = -5;
        b = -15;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();

        // Test case 3: Zero and a number
        a = 0;
        b = 100;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();

        // Test case 4: Large numbers (potential overflow - using long to avoid)
        long largeA = Integer.MAX_VALUE;
        long largeB = Integer.MIN_VALUE;
        System.out.println("Before swap: largeA = " + largeA + ", largeB = " + largeB);
        largeA = largeA + largeB;
        largeB = largeA - largeB;
        largeA = largeA - largeB;
        System.out.println("After swap: largeA = " + largeA + ", largeB = " + largeB);
        System.out.println();




        // Test case 5: Using a temporary variable (alternative approach, more robust for overflow)
        a = 10;
        b = 20;
        System.out.println("Before swap (temp variable): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap (temp variable): a = " + a + ", b = " + b);

    }
}
