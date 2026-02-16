public class CheckTenTwenty {

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 20, 30};
        System.out.println(check10and20(arr1)); // Output: true

        int[] arr2 = {20, 10};
        System.out.println(check10and20(arr2)); // Output: false

        int[] arr3 = {10, 1, 20};
        System.out.println(check10and20(arr3)); // Output: true
        
        int[] arr4 = {10, 20, 10, 20}; // true
        System.out.println(check10and20(arr4)); 

        int[] arr5 = {20, 20, 20};//false
        System.out.println(check10and20(arr5));
        
        int[] arr6 = {10, 10, 10}; // false
        System.out.println(check10and20(arr6));

        int[] arr7 = {}; // false
        System.out.println(check10and20(arr7));



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
