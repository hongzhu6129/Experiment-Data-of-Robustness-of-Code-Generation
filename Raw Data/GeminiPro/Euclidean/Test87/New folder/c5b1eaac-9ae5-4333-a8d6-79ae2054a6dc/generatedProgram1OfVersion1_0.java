public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 30, 20, 50}; // Valid
        int[] arr2 = {20, 20, 20, 30, 40};    // Invalid (adjacent 20s)
        int[] arr3 = {10, 20, 30, 40, 20};    // Invalid (only two 20s)
        int[] arr4 = {20, 10, 20, 20, 30};    // Invalid (adjacent 20s)


        System.out.println("Array 1: " + check20s(arr1)); // Output: true
        System.out.println("Array 2: " + check20s(arr2)); // Output: false
        System.out.println("Array 3: " + check20s(arr3)); // Output: false
        System.out.println("Array 4: " + check20s(arr4)); // Output: false

    }

    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) {
                    adjacent = true;
                    break; // Optimization: No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
