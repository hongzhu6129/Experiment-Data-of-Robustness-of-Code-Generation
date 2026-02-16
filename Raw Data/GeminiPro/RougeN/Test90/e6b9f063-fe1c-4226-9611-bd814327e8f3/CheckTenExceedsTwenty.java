public class CheckTenExceedsTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 4, 5, 10, 7, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // Exceeds 20
        int[] arr2 = {1, 2, 10, 4, 5, 10, 7, 8, 10, 10}; // Does not exceed 20
        int[] arr3 = {}; // Empty array - Does not exceed 20
        int[] arr4 = {1, 2, 3, 4, 5};  // No tens - Does not exceed 20

        System.out.println("Array 1: " + tenExceedsTwenty(arr1));
        System.out.println("Array 2: " + tenExceedsTwenty(arr2));
        System.out.println("Array 3: " + tenExceedsTwenty(arr3));
        System.out.println("Array 4: " + tenExceedsTwenty(arr4));

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
