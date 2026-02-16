public class Check10Then20 {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {10, 1, 20, 30};
        int[] arr3 = {20, 10, 20, 30};
        int[] arr4 = {1, 20, 10, 30};
        int[] arr5 = {1, 10, 30, 20};
        int[] arr6 = {10, 10, 10};
        int[] arr7 = {20, 20, 20};


        System.out.println(has10Then20(arr1)); // true
        System.out.println(has10Then20(arr2)); // true
        System.out.println(has10Then20(arr3)); // false
        System.out.println(has10Then20(arr4)); // false
        System.out.println(has10Then20(arr5)); // true
        System.out.println(has10Then20(arr6)); // false
        System.out.println(has10Then20(arr7)); // false
    }

    public static boolean has10Then20(int[] arr) {
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
