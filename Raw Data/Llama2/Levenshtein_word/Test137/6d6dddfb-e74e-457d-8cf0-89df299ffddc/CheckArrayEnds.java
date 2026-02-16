public class CheckArrayEnds {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1, 2, 3};
        int l1 = 3;
        System.out.println("Array 1: " + checkEnds(arr1, l1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int l2 = 2;
        System.out.println("Array 2: " + checkEnds(arr2, l2)); // Output: false

        int[] arr3 = {1, 2, 3, 1, 2, 3};
        int l3 = 3;
        System.out.println("Array 3: " + checkEnds(arr3, l3)); // Output: true

        int[] arr4 = {}; // Empty array
        int l4 = 2;
        System.out.println("Array 4: " + checkEnds(arr4, l4)); // Output: false
        
        int[] arr5 = {1,2}; // Array smaller than l
        int l5 = 3;
        System.out.println("Array 5: " + checkEnds(arr5,l5)); // Output: false

    }

    private static boolean checkEnds(int[] arr, int l) {
        if (arr == null || arr.length < 2 * l) {
            return false;
        }

        for (int i = 0; i < l; i++) {
            if (arr[i] != arr[arr.length - l + i]) {
                return false;
            }
        }

        return true;
    }
}
