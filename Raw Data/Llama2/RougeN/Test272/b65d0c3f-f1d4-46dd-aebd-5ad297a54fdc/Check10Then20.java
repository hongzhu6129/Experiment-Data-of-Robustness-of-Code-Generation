public class Check10Then20 {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        System.out.println("Array 1: " + check10Then20(arr1)); // Output: true

        int[] arr2 = {20, 10, 10, 20};
        System.out.println("Array 2: " + check10Then20(arr2)); // Output: true

        int[] arr3 = {10, 10, 20, 30, 20, 10};
        System.out.println("Array 3: " + check10Then20(arr3)); // Output: true

        int[] arr4 = {10, 20, 10, 20};
        System.out.println("Array 4: " + check10Then20(arr4)); // Output: true


        int[] arr5 = {1, 20, 30};
        System.out.println("Array 5: " + check10Then20(arr5)); // Output: false

        int[] arr6 = {10, 1, 20, 20};
        System.out.println("Array 6: " + check10Then20(arr6)); // Output: true

        int[] arr7 = {20, 20};
        System.out.println("Array 7: " + check10Then20(arr7)); // Output: false

        int[] arr8 = {10, 10};
        System.out.println("Array 8: " + check10Then20(arr8)); // Output: false

        int[] arr9 = {1};
        System.out.println("Array 9: " + check10Then20(arr9)); // Output: false

        int[] arr10 = {};
        System.out.println("Array 10: " + check10Then20(arr10)); // Output: false



    }

    public static boolean check10Then20(int[] arr) {
        boolean found10 = false;
        for (int num : arr) {
            if (num == 10) {
                found10 = true;
            } else if (found10 && num == 20) {
                return true;
            }
        }
        return false;
    }
}
