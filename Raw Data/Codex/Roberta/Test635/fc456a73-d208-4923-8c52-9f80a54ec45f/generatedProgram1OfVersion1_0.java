public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {1, 20, 3, 4, 20, 6, 20, 8};
        System.out.println("Array 1: " + check20s(arr1)); // Output: true

        int[] arr2 = {20, 20, 20, 1, 2, 3};
        System.out.println("Array 2: " + check20s(arr2)); // Output: false

        int[] arr3 = {1, 2, 3, 20, 5, 6, 20, 8, 20};
        System.out.println("Array 3: " + check20s(arr3)); // Output: true

        int[] arr4 = {1, 2, 3, 20, 20, 6, 20, 8};
        System.out.println("Array 4: " + check20s(arr4)); // Output: false

        int[] arr5 = {1, 2, 3, 20, 5, 6, 7, 8};
        System.out.println("Array 5: " + check20s(arr5)); // Output: false


    }


    public static boolean check20s(int[] arr) {
        int count = 0;
        boolean adjacent = false; // Flag to track adjacent 20s

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
