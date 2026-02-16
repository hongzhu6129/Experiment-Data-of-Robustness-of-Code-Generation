public class CheckTenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 3, 20};
        boolean result1 = check10Then20(arr1);
        System.out.println("Array 1: " + result1); // Output: true

        int[] arr2 = {20, 10, 3, 4};
        boolean result2 = check10Then20(arr2);
        System.out.println("Array 2: " + result2); // Output: false

        int[] arr3 = {10, 1, 20, 3};
        boolean result3 = check10Then20(arr3);
        System.out.println("Array 3: " + result3); // Output: true

        int[] arr4 = {10, 20, 10, 20};
        boolean result4 = check10Then20(arr4);
        System.out.println("Array 4: " + result4); // Output: true

        int[] arr5 = {1, 2, 3, 4};
        boolean result5 = check10Then20(arr5);
        System.out.println("Array 5: " + result5); // Output: false


        int[] arr6 = {10,10,10};
        boolean result6 = check10Then20(arr6);
        System.out.println("Array 6: " + result6); // Output: false (no 20 after a 10)

         int[] arr7 = {}; // Empty array
        boolean result7 = check10Then20(arr7);
        System.out.println("Array 7: " + result7); // Output: false 
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
