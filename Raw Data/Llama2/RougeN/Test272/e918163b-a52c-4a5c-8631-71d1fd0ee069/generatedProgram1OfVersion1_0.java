public class CheckTenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 20, 3};
        int[] arr2 = {1, 2, 10, 3, 20};
        int[] arr3 = {1, 2, 20, 10, 3};
        int[] arr4 = {1, 2, 3, 4, 5};
        int[] arr5 = {10, 20, 10, 20};

        System.out.println("Array 1: " + checkTenThenTwenty(arr1)); // True
        System.out.println("Array 2: " + checkTenThenTwenty(arr2)); // True
        System.out.println("Array 3: " + checkTenThenTwenty(arr3)); // False
        System.out.println("Array 4: " + checkTenThenTwenty(arr4)); // False
        System.out.println("Array 5: " + checkTenThenTwenty(arr5)); // True

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
        return false;
    }
}
