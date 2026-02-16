public class Check10Then20 {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {20, 10, 10, 20};
        int[] arr3 = {10, 10, 10, 20};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] arr5 = {20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr6 = {1, 20, 3, 10};


        System.out.println("Array 1: " + check10Then20(arr1)); // True
        System.out.println("Array 2: " + check10Then20(arr2)); // True
        System.out.println("Array 3: " + check10Then20(arr3)); // True
        System.out.println("Array 4: " + check10Then20(arr4)); // True
        System.out.println("Array 5: " + check10Then20(arr5)); // False
        System.out.println("Array 6: " + check10Then20(arr6)); // False
        System.out.println("Empty array: " + check10Then20(new int[]{})); //False


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
