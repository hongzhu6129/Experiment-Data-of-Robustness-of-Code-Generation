public class AdjacentNumberCheck {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 1, 4, 1};
        int num1 = 1;
        System.out.println(checkAdjacent(arr1, num1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5};
        int num2 = 3;
        System.out.println(checkAdjacent(arr2, num2)); // Output: false

        int[] arr3 = {3, 2, 3, 4, 3};  // Example with number not at the beginning or end of pairs
        int num3 = 3;
        System.out.println(checkAdjacent(arr3, num3)); // Output: false


        int[] emptyArray = {};
        int num4 = 5;
        System.out.println(checkAdjacent(emptyArray, num4)); // Output: true (vacuously true for empty array)


        int[] singleElementArray = {5};
        int num5 = 5;
        System.out.println(checkAdjacent(singleElementArray, num5)); // Output: true (vacuously true for single element array)

    }


    public static boolean checkAdjacent(int[] arr, int num) {
        if (arr.length <= 1) {  // Handle empty or single-element arrays (considered true as there are no adjacent pairs)
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != num && arr[i + 1] != num) {  // If the number is not present in either of the adjacent elements
                return false;
            }
        }

        return true;
    }
}
