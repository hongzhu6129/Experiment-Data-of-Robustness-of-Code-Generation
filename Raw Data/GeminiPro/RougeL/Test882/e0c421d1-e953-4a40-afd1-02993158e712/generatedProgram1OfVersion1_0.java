public class CheckTenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {10, 1, 20, 30};
        int[] arr3 = {1, 20, 10, 30};
        int[] arr4 = {20, 30, 40, 50};
        int[] arr5 = {10, 10, 10, 20};

        System.out.println("Array 1: " + checkTenTwenty(arr1)); // True
        System.out.println("Array 2: " + checkTenTwenty(arr2)); // True
        System.out.println("Array 3: " + checkTenTwenty(arr3)); // False
        System.out.println("Array 4: " + checkTenTwenty(arr4)); // False
        System.out.println("Array 5: " + checkTenTwenty(arr5)); // True


    }

    public static boolean checkTenTwenty(int[] arr) {
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
