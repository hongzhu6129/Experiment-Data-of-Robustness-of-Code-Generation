public class Check20Occurrences {

    public static void main(String[] args) {
        int[] arr1 = {20, 1, 20, 3, 20};
        int[] arr2 = {20, 20, 20, 1};
        int[] arr3 = {1, 2, 3, 20, 20, 20};
        int[] arr4 = {1, 20, 2, 3, 20, 5, 20};
        int[] arr5 = {20, 20, 1, 20};

        System.out.println("Array 1: " + check20(arr1)); // True
        System.out.println("Array 2: " + check20(arr2)); // False
        System.out.println("Array 3: " + check20(arr3)); // False
        System.out.println("Array 4: " + check20(arr4)); // True
        System.out.println("Array 5: " + check20(arr5)); // False
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
