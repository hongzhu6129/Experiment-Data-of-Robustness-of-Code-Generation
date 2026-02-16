import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwapVariables {

    public static void swap(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // Do nothing if the array is invalid
        }
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }


    @Test
    void testSwap() {
        int[] arr1 = {5, 10};
        swap(arr1);
        assertArrayEquals(new int[]{10, 5}, arr1);

        int[] arr2 = {-5, 10};
        swap(arr2);
        assertArrayEquals(new int[]{10, -5}, arr2);

        int[] arr3 = {0, 0};
        swap(arr3);
        assertArrayEquals(new int[]{0, 0}, arr3);


        int[] arr4 = {Integer.MAX_VALUE, Integer.MIN_VALUE}; // Corner case: Max and Min values
        swap(arr4);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, arr4);


        int[] arr5 = {5}; // Corner case: Array with only one element. Should not change.
        swap(arr5);
        assertArrayEquals(new int[]{5}, arr5);

        swap(null); // Corner case: Null array, Should not throw exception



        // Testing potential overflow (though the current method handles it gracefully due to two's complement)
        int[] arr6 = {Integer.MAX_VALUE, 1}; 
        swap(arr6);
        assertArrayEquals(new int[]{1, Integer.MAX_VALUE}, arr6);

         int[] arr7 = {Integer.MIN_VALUE, -1};
        swap(arr7);
        assertArrayEquals(new int[]{-1, Integer.MIN_VALUE}, arr7);


    }



    public static void main(String[] args) {
        int[] numbers = {5, 10};
        System.out.println("Before swap: a = " + numbers[0] + ", b = " + numbers[1]);
        swap(numbers);
        System.out.println("After swap: a = " + numbers[0] + ", b = " + numbers[1]);


    }
}
