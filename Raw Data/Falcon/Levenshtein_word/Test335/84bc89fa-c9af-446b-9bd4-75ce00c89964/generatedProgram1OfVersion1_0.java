public class CheckTenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 3, 20, 5}; // True
        int[] arr2 = {10, 20, 3, 4, 5}; // True
        int[] arr3 = {1, 20, 3, 10, 5}; // False
        int[] arr4 = {1, 2, 3, 4, 5};  // False
        int[] arr5 = {10, 20}; //True
        int[] arr6 = {20, 10}; //False
        int[] arr7 = {10}; //False
        int[] arr8 = {20}; //False
        int[] arr9 = {}; //False


        System.out.println(checkTenTwenty(arr1)); // Output: true
        System.out.println(checkTenTwenty(arr2)); // Output: true
        System.out.println(checkTenTwenty(arr3)); // Output: false
        System.out.println(checkTenTwenty(arr4)); // Output: false
        System.out.println(checkTenTwenty(arr5)); // Output: true
        System.out.println(checkTenTwenty(arr6)); // Output: false
        System.out.println(checkTenTwenty(arr7)); // Output: false
        System.out.println(checkTenTwenty(arr8)); // Output: false
        System.out.println(checkTenTwenty(arr9)); // Output: false
    }

    public static boolean checkTenTwenty(int[] arr) {
        boolean foundTen = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                foundTen = true;
            }
            if (foundTen) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 20) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

