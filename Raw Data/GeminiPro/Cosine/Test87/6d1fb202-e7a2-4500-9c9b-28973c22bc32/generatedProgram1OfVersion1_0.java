public class Check20ThreeTimes {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 5, 20}; // True
        int[] arr2 = {20, 20, 10, 5, 20}; // False (adjacent 20s)
        int[] arr3 = {20, 10, 5, 20}; // False (only two 20s)
        int[] arr4 = {1, 2, 3, 4, 5};   // False (no 20s)
        int[] arr5 = {20, 10, 20, 20, 5}; // False (adjacent 20s)


        System.out.println(check20(arr1)); // Output: true
        System.out.println(check20(arr2)); // Output: false
        System.out.println(check20(arr3)); // Output: false
        System.out.println(check20(arr4)); // Output: false
        System.out.println(check20(arr5)); // Output: false
    }

    public static boolean check20(int[] arr) {
        int count = 0;
        boolean adjacent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                count++;
                if (i > 0 && arr[i - 1] == 20) {
                    adjacent = true;
                    break; // No need to continue if adjacent 20s found
                }
            }
        }

        return count == 3 && !adjacent;
    }
}
