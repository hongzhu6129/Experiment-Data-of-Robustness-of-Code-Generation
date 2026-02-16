public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        int[] arr2 = {1, 10, 30, 20};
        int[] arr3 = {1, 20, 10, 30};
        int[] arr4 = {1, 20, 30, 10};
        int[] arr5 = {1, 10, 30, 1};


        System.out.println(check10and20(arr1)); // true
        System.out.println(check10and20(arr2)); // true
        System.out.println(check10and20(arr3)); // false
        System.out.println(check10and20(arr4)); // false
        System.out.println(check10and20(arr5)); // false

    }

    public static boolean check10and20(int[] arr) {
        boolean found10 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                found10 = true;
            }
            if (found10) {
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
