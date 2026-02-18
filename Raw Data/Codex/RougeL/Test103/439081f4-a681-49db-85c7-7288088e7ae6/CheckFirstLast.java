public class CheckFirstLast {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 1};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {}; // Empty array
        int[] array4 = {7}; // Single element array

        function(array1);
        function(array2);
        function(array3);
        function(array4);
    }

    public static void function(int[] arr) {
        if (arr.length >= 2) {  // Check if the array has at least 2 elements
            if (arr[0] == arr[arr.length - 1]) {
                System.out.println("First and last elements are the same.");
            } else {
                System.out.println("First and last elements are different.");
            }
        } else if (arr.length == 1) {
            System.out.println("The array has only one element.  It's the same as itself."); // Or handle as you see fit
        } else {
            System.out.println("The array is empty.");
        }

    }
}



