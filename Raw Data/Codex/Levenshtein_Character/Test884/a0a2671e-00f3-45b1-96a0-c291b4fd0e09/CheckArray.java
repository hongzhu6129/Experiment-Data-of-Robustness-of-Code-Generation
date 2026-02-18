public class CheckArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 10, 3};
        int[] arr2 = {1, 2, 20, 20, 3};
        int[] arr3 = {1, 2, 10, 10, 20, 20};
        int[] arr4 = {1, 2, 10, 3, 20};


        System.out.println("Array 1: " + checkArray(arr1)); // true
        System.out.println("Array 2: " + checkArray(arr2)); // true
        System.out.println("Array 3: " + checkArray(arr3)); // false
        System.out.println("Array 4: " + checkArray(arr4)); // false
    }

    public static boolean checkArray(int[] arr) {
        boolean has1010 = false;
        boolean has2020 = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 10 && arr[i + 1] == 10) {
                has1010 = true;
            }
            if (arr[i] == 20 && arr[i + 1] == 20) {
                has2020 = true;
            }
        }

        return (has1010 && !has2020) || (!has1010 && has2020);
    }
}
