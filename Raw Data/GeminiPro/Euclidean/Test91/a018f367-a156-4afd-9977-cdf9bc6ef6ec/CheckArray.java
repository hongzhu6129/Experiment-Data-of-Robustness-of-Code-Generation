public class CheckArray {

    public static void main(String[] args) {
        int[] array1 = {11, 11, 13, 31, 45, 20, 33, 53};
        int[] array2 = {11, 11, 13, 10, 45, 20, 33, 53};
        int[] array3 = {11, 11, 13, 30, 45, 20, 33, 53};
        int[] array4 = {11, 11, 13, 10, 45, 30, 33, 53};

        System.out.println("Array1 contains 10 or 30: " + checkArray(array1));
        System.out.println("Array2 contains 10 or 30: " + checkArray(array2));
        System.out.println("Array3 contains 10 or 30: " + checkArray(array3));
        System.out.println("Array4 contains 10 or 30: " + checkArray(array4));
    }

    public static boolean checkArray(int[] arr) {
        for (int num : arr) {
            if (num == 10 || num == 30) {
                return true;
            }
        }
        return false;
    }
}
