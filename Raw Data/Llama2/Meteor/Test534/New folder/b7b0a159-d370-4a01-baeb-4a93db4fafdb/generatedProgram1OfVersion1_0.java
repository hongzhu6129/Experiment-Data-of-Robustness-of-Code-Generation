public class CheckTenExceedsTwenty {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 10, 30, 40};
        int[] arr2 = {1, 2, 10, 10, 10};
        int[] arr3 = {1, 20, 30, 40, 50};  // No 10s
        int[] arr4 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,10}; // More than 20 tens


        System.out.println("Does 10 exceed 20 in arr1? " + tenExceedsTwenty(arr1)); // Output: false
        System.out.println("Does 10 exceed 20 in arr2? " + tenExceedsTwenty(arr2)); // Output: false
        System.out.println("Does 10 exceed 20 in arr3? " + tenExceedsTwenty(arr3)); // Output: false
        System.out.println("Does 10 exceed 20 in arr4? " + tenExceedsTwenty(arr4)); // Output: true


    }

    public static boolean tenExceedsTwenty(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 10) {
                count++;
            }
        }
        return count > 20;
    }
}
