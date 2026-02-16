public class Check20 {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 20, 5, 20};
        System.out.println("Array 1: " + check20(arr1)); // Output: true

        int[] arr2 = {20, 20, 20};
        System.out.println("Array 2: " + check20(arr2)); // Output: false

        int[] arr3 = {20, 10, 20, 20, 5};
        System.out.println("Array 3: " + check20(arr3)); // Output: false

        int[] arr4 = {20, 10, 5, 20};
        System.out.println("Array 4: " + check20(arr4)); // Output: false


        int[] arr5 = {1, 2, 3, 4, 5}; // no 20s
        System.out.println("Array 5: " + check20(arr5)); // Output: false

        int[] arr6 = {20, 1, 20, 1, 20, 1, 20}; // Four 20s, not adjacent
        System.out.println("Array 6: " + check20(arr6)); // Output: false



    }

    public static boolean check20(int[] arr) {
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
