public class CheckTenThenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {10, 1, 20, 30};
        int[] arr3 = {20, 1, 10, 30};
        int[] arr4 = {1, 20, 10, 30};
        int[] arr5 = {1, 20, 30, 10}; // False, 10 appears after 20
        int[] arr6 = {1, 2, 3, 4};     // False, no 10 or 20
        int[] arr7 = {1, 10, 10, 20};  // True
        int[] arr8 = {1, 20, 20, 20};  // False, no 10

        System.out.println(checkTenThenTwenty(arr1)); // true
        System.out.println(checkTenThenTwenty(arr2)); // true
        System.out.println(checkTenThenTwenty(arr3)); // false
        System.out.println(checkTenThenTwenty(arr4)); // false
        System.out.println(checkTenThenTwenty(arr5)); // false
        System.out.println(checkTenThenTwenty(arr6)); // false
        System.out.println(checkTenThenTwenty(arr7)); // true
        System.out.println(checkTenThenTwenty(arr8)); // false


    }

    public static boolean checkTenThenTwenty(int[] arr) {
        boolean foundTen = false;

        for (int num : arr) {
            if (num == 10) {
                foundTen = true;
            } else if (foundTen && num == 20) {
                return true;
            }
        }

        return false; // 10 was not found before 20 or at all
    }
}
