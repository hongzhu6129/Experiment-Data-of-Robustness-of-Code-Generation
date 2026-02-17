public class CheckFirstLast {

    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 10};
        int[] array2 = {10, -20, 0, 30, 40, 60, 10};
        int[] array3 = {10, 10};
        int[] array4 = {10};


        System.out.println(function(array1)); // Output: false
        System.out.println(function(array2)); // Output: true
        System.out.println(function(array3)); // Output: true
        System.out.println(function(array4)); // Output: false (length < 2)

    }

    public static boolean function(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        return arr[0] == arr[arr.length - 1];
    }
}
