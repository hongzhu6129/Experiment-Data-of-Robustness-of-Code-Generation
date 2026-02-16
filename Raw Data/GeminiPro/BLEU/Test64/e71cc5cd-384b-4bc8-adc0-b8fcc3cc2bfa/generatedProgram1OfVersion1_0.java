import java.util.Arrays;

public class FirstLastElementSame {

    public static void main(String[] args) {
        // Test cases (including corner cases)

        // Empty array
        test(new int[] {});

        // Single element array
        test(new int[] {5});

        // Two element array - same
        test(new int[] {5, 5});

        // Two element array - different
        test(new int[] {5, 6});


        // Multiple elements - same
        test(new int[] {5, 2, 3, 4, 5});

        // Multiple elements - different
        test(new int[] {5, 2, 3, 4, 6});

        // Null array
        test(null);


    }

    public static boolean areFirstAndLastEqual(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false; // Or handle as you see fit for empty/null cases.  Returning false here.
        }
        if(arr.length == 1){
            return true; // Single element array - first and last are the same
        }
        return arr[0] == arr[arr.length - 1];
    }

    public static void test(int[] arr) {
        if (arr == null) {
            System.out.println("Array: null, Result: " + areFirstAndLastEqual(arr));
        } else {
            System.out.println("Array: " + Arrays.toString(arr) + ", Result: " + areFirstAndLastEqual(arr));
        }
    }
}
