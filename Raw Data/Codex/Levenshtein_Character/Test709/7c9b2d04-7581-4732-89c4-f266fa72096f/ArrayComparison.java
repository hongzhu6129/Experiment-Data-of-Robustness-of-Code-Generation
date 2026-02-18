import java.util.ArrayList;
import java.util.Arrays;

class ArrayComparison {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {3, 5, 9};
        ArrayList<Integer> result = count_smaller_number(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> count_smaller_number(int[] arr1, int[] arr2) {
        ArrayList<Integer> counts = new ArrayList<>();
        for (int num : arr2) {
            counts.add(temp(arr1, num));
        }
        return counts;
    }

    private static int temp(int[] arr, int num) {
        int count = 0;
        for (int val : arr) {
            if (val < num) {
                count++;
            }
        }
        return count;
    }
}
