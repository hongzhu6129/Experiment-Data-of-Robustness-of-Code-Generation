import java.util.Arrays;

public class SwapVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a1 = 10;
        int b1 = 20;
        swap(a1, b1); // Using a function to demonstrate by value
        System.out.println("a1: " + a1 + ", b1: " + b1); // Output: a1: 10, b1: 20 (Java is pass-by-value)


        // Test case 2:  Using an array (to demonstrate effective swapping as arrays are passed by reference of the memory location)
        int[] arr = {5, 15};
        swapInArray(arr, 0, 1);
        System.out.println("arr: " + Arrays.toString(arr)); // Output: arr: [15, 5]

        // Test case 3: Negative integers
        int a3 = -5;
        int b3 = -15;
        int[] arr3 = {a3, b3};
        swapInArray(arr3, 0, 1);
        System.out.println("a3: " + arr3[0] + ", b3: " + arr3[1]); // Output: a3: -15, b3: -5


        // Test case 4: Zero values
        int a4 = 0;
        int b4 = 100;
        int[] arr4 = {a4, b4};
        swapInArray(arr4, 0, 1);
        System.out.println("a4: " + arr4[0] + ", b4: " + arr4[1]); // Output: a4: 100, b4: 0


        // Test case 5: Identical values
        int a5 = 50;
        int b5 = 50;
        int[] arr5 = {a5, b5};
        swapInArray(arr5, 0, 1);        
        System.out.println("a5: " + arr5[0] + ", b5: " + arr5[1]); // Output: a5: 50, b5: 50



        // Test case 6: Large numbers (to check for potential overflow issues, though unlikely with int)
        int a6 = Integer.MAX_VALUE;
        int b6 = Integer.MIN_VALUE;
        int[] arr6 = {a6, b6};
        swapInArray(arr6, 0, 1);        
        System.out.println("a6: " + arr6[0] + ", b6: " + arr6[1]); // Output: a6: -2147483648, b6: 2147483647

    }

    // Demonstrates pass-by-value; the original variables in main are NOT affected
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Swaps elements within an array. This effectively swaps because arrays are passed as references to their memory location.
    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



