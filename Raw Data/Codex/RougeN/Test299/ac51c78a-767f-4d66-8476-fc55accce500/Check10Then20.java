public class Check10Then20 {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {20, 10, 1, 2};
        int[] arr3 = {10, 1, 20, 30};
        int[] arr4 = {1, 20, 10, 30};
        int[] arr5 = {1, 2, 3, 4};

        System.out.println("Array 1: " + check10Then20(arr1)); // true
        System.out.println("Array 2: " + check10Then20(arr2)); // false
        System.out.println("Array 3: " + check10Then20(arr3)); // true
        System.out.println("Array 4: " + check10Then20(arr4)); // false
        System.out.println("Array 5: " + check10Then20(arr5)); // false
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
