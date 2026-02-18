public class ReverseRecursion {

    public static void main(String[] args) {
        // Test cases
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));  // [5, 4, 3, 2, 1]

        int[] emptyArr = {};
        reverseArray(emptyArr, 0, emptyArr.length - 1);
        System.out.println(Arrays.toString(emptyArr));  // []

        int[] singleElementArr = {1};
        reverseArray(singleElementArr, 0, singleElementArr.length - 1);
        System.out.println(Arrays.toString(singleElementArr));  // [1]

        int[] negativeArr = {-1, -2, -3, -4, -5};
        reverseArray(negativeArr, 0, negativeArr.length - 1);
        System.out.println(Arrays.toString(negativeArr));  // [-5, -4, -3, -2, -1]
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Swap the elements at indices start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining part of the array
        reverseArray(arr, start + 1, end - 1);
    }
}
