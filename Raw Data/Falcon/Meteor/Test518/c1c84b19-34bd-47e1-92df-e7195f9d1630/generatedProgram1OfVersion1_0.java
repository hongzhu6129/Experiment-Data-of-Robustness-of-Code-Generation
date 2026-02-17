import java.util.Arrays;

public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        swap(a, b); 

        // Test case 2: Negative integers
        a = -5;
        b = -15;
        swap(a, b);

        // Test case 3: Zero and a positive number
        a = 0;
        b = 50;
        swap(a, b);

        // Test case 4: Two identical numbers
        a = 7;
        b = 7;
        swap(a, b);

        // Test case 5: Integer.MAX_VALUE and Integer.MIN_VALUE (corner case)
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        swap(a, b);

        // Test case 6 with different data types (using Integer objects to handle potential overflow)
        Integer x = 1000000000; // Large number close to Integer.MAX_VALUE
        Integer y = 7;
        swapGeneric(x, y);

        // Test case 7 using Strings. Note the difference in the swapGeneric method.
        String str1 = "Hello";
        String str2 = "World";
        swapGeneric(str1,str2);
        
        // Test case 8: null and a valid string.
        String str3 = "Test";
        String str4 = null;
        swapGeneric(str3, str4);
    }

    // Method to swap two int variables (pass-by-value, so no actual swap within this method)
    public static void swap(int a, int b) {
        System.out.println("Before swap (inside swap method with ints): a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap (inside swap method with ints): a = " + a + ", b = " + b);  // Values are swapped within this method's scope
        System.out.println();// Empty line to make output cleaner
    }

    // A generic method to demonstrate swapping with different data types like Integer and String (using wrapper classes)
    public static <T> void swapGeneric(T a, T b) {
        System.out.println("Before swap (inside swapGeneric): a = " + a + ", b = " + b);

        T temp = a;
        a = b;
        b = temp;

        System.out.println("After swap (inside swapGeneric): a = " + a + ", b = " + b);
        System.out.println();
    }
}

