public class DealTwoVariables {

    public static void main(String[] args) {
        // Method 1: Using a third variable
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping (using temp): a = " + a + ", b = " + b);


        // Method 2: Using addition and subtraction (suitable for numeric types)
        a = 10; // Reset values
        b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping (using + and -): a = " + a + ", b = " + b);


        // Method 3: Using XOR (suitable for integer types)
        a = 10; // Reset values
        b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping (using XOR): a = " + a + ", b = " + b);


        // Dealing with other data types (like Strings)
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);

        String tempStr = str1; // Need a temporary variable for non-numeric types
        str1 = str2;
        str2 = tempStr;

        System.out.println("After swapping: str1 = " + str1 + ", str2 = " + str2);


    }
}
