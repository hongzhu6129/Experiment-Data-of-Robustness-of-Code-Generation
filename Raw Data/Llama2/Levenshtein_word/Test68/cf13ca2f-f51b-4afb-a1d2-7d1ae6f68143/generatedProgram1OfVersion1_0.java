import java.util.ArrayList;
import java.util.Arrays;

public class CountSmallerNumbers {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 7, 9};
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> result = count_smaller_number(arr1, arr2);
        System.out.println(result); // Output: [0, 1, 2, 3, 4, 7, 9]


        arr1 = new int[]{1, 5, 8};
        arr2 = new int[]{2, 4, 9};
        result = count_smaller_number(arr1, arr2);
        System.out.println(result); // Output: [1, 2]



        arr1 = new int[]{1, 8, 3, 9};
        arr2 = new int[]{1, 3, 6, 10};

        result = count_smaller_number(arr1, arr2);
        System.out.println(result); // Output: [0, 2, 1, 3]


    }

    public static ArrayList<Integer> count_smaller_number(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr2); // Sort arr2 for efficient searching


        for (int num : arr1) {
            result.add(temp(arr2, num));
        }

        return result;
    }


    private static int temp(int[] arr, int target) {
        // Binary search to find the count of elements smaller than target

        int low = 0;
        int high = arr.length - 1;
        int count = 0;
       
        while(low <= high) {
            int mid = low + (high - low) /2;
            if(arr[mid] < target) {
                count = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        
        return count;
    }
}
