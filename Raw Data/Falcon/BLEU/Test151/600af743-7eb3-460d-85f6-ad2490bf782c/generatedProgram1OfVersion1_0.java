public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {1, 20, 3, 4, 20, 5, 6, 20, 7}; // True
        int[] arr2 = {20, 20, 20, 1, 2, 3};         // False (adjacent)
        int[] arr3 = {1, 2, 3, 20, 20, 4, 5, 20};   // False (adjacent)
        int[] arr4 = {1, 2, 20, 3, 4, 20, 5, 20};   // True
        int[] arr5 = {1, 20, 3, 20, 4, 5, 6};      // False (count)
        int[] arr6 = {20, 20, 20, 20};             // False (count and adjacent)

        System.out.println(check20s(arr1)); // Output: true
        System.out.println(check20s(arr2)); // Output: false
        System.out.println(check20s(arr3)); // Output: false
        System.out.println(check20s(arr4)); // Output: true
        System.out.println(check20s(arr5)); // Output: false
        System.out.println(check20s(arr6)); // Output: false
    }

    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) {
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
