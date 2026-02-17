public class CheckFirstLast {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {1, 2, 3, 4, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 2, 3, 4, 5};
        int[] arr5 = {};  // Empty array
        int[] arr6 = {1}; // Single element array


        System.out.println("arr1 and arr2: " + checkFirstLast(arr1, arr2)); // Output: true
        System.out.println("arr1 and arr3: " + checkFirstLast(arr1, arr3)); // Output: false
        System.out.println("arr3 and arr4: " + checkFirstLast(arr3, arr4)); // Output: false
        System.out.println("arr1 and arr5: " + checkFirstLast(arr1, arr5)); // Output: false
        System.out.println("arr5 and arr6: " + checkFirstLast(arr5, arr6)); // Output: false
        System.out.println("arr6 and arr6: " + checkFirstLast(arr6, arr6)); // Output: true



    }

    private static boolean checkFirstLast(int[] arr1, int[] arr2) {
        // Handle cases where one or both arrays are empty or have only one element.
        if (arr1.length < 1 || arr2.length < 1) {
            return false;
        }

        if (arr1.length == 1 && arr2.length == 1) {
            return arr1[0] == arr2[0];
        } else if (arr1.length == 1 || arr2.length == 1) {  //One has a single element, other has more - they can't be same first and last
            return false;
        }


        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}

