public class Check10Then20 {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {20, 10, 1, 2};
        int[] arr3 = {10, 1, 2, 20};
        int[] arr4 = {10, 20, 10, 20};
        int[] arr5 = {1, 2, 3, 4};
        int[] arr6 = {10, 10, 10, 10};

        System.out.println(check10Then20(arr1)); // true
        System.out.println(check10Then20(arr2)); // false
        System.out.println(check10Then20(arr3)); // true
        System.out.println(check10Then20(arr4)); // true
        System.out.println(check10Then20(arr5)); // false
        System.out.println(check10Then20(arr6)); // false


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
