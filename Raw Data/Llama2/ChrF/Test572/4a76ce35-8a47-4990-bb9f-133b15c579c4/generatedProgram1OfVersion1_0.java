public class Check20s {

    public static void main(String[] args) {
        int[] arr1 = {20, 10, 30, 20, 5, 20};
        System.out.println("Array 1: " + check20s(arr1)); // Output: true

        int[] arr2 = {20, 20, 10, 30, 20, 5};
        System.out.println("Array 2: " + check20s(arr2)); // Output: false

        int[] arr3 = {20, 10, 30, 20, 5, 20, 20};
        System.out.println("Array 3: " + check20s(arr3)); // Output: false


        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Array 4: " + check20s(arr4)); // Output: false


        int[] arr5 = {20, 1, 20, 3, 20};
        System.out.println("Array 5: " + check20s(arr5)); // Output: true
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
