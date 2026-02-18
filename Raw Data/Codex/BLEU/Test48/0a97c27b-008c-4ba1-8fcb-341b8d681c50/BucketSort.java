import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 2, 9, 4, 7, 3, 6};
        bucketSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void bucketSort(int[] arr) {
        int n = arr.length;
        if (n <= 0) {
            return;
        }

        int minVal = min(arr);
        int maxVal = max(arr);

        int numBuckets = (int) Math.sqrt(n) + 1; // Or any other suitable bucket count logic
        List<Integer>[] buckets = new ArrayList[numBuckets];

        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            int bucketIndex = hash(num, minVal, maxVal, numBuckets);
            buckets[bucketIndex].add(num);
        }

        // Sort individual buckets (using insertion sort here, could be any other)
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }


    private static int hash(int num, int minVal, int maxVal, int numBuckets) {
         // Distribute more evenly even with min = 0. Avoids divide by zero.
        if (maxVal - minVal == 0) return 0; // Handle all elements same

        return (int) (((double)(num - minVal) / (maxVal - minVal)) * (numBuckets-1)); //added -1
    }




    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
