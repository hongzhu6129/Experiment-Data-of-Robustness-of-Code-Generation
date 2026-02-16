import java.util.Arrays;

public class WeirdEvenSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 17, 21, 22, 24};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && !isEven(arr[left])) {
                left++;
            }
            while (left < right && isEven(arr[right])) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }


    static boolean isEven(int num) {
        return num % 2 == 0;
    }


}
