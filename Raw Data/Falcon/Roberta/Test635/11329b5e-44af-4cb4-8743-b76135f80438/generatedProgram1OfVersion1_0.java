public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 30, 20, 50}; // True
        int[] arr2 = {20, 20, 20, 10, 30};     // False (adjacent)
        int[] arr3 = {10, 20, 10, 20, 10};     // False (only two)
        int[] arr4 = {20, 20, 20, 20, 10};     // False (too many & adjacent)

        System.out.println(check20s(arr1)); // Output: true
        System.out.println(check20s(arr2)); // Output: false
        System.out.println(check20s(arr3)); // Output: false
        System.out.println(check20s(arr4)); // Output: false
    }

    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) { // Check for adjacency
                    adjacent = true;
                    break; // No need to continue if adjacent 20s are found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
