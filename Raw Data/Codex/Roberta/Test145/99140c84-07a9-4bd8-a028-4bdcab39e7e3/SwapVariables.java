public class SwapVariables {

    public static void main(String[] args) {

        // Method 1: Using a temporary variable
        int a = 10;
        int b = 20;

        System.out.println("Before swap (using temp variable): a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap (using temp variable): a = " + a + ", b = " + b);


        // Method 2: Using addition and subtraction (for numbers)
        int x = 5;
        int y = 15;

        System.out.println("\nBefore swap (using addition/subtraction): x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("After swap (using addition/subtraction): x = " + x + ", y = " + y);



        // Method 3: Using bitwise XOR (for numbers)
        int p = 7;
        int q = 25;

        System.out.println("\nBefore swap (using XOR): p = " + p + ", q = " + q);

        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.println("After swap (using XOR): p = " + p + ", q = " + q);


       // Note: For objects (like Strings), you'd still typically use a temporary variable for swapping references.
       String str1 = "Hello";
       String str2 = "World";

        System.out.println("\nBefore swap (Strings): str1 = " + str1 + ", str2 = " + str2);

       String tempStr = str1;
       str1 = str2;
       str2 = tempStr;

        System.out.println("After swap (Strings): str1 = " + str1 + ", str2 = " + str2);

    }
}
