import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bucketSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bucketSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }

        int minVal = min(arr);
        int maxVal = max(arr);

        int numBuckets = 10; // You can adjust the number of buckets
        List<Integer>[] buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : arr) {
            int bucketIndex = hash(num, minVal, maxVal);
            buckets[bucketIndex].add(num);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket); // Sort each bucket individually
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    private static int hash(int num, int min, int max) {
        if (min == max) return 0; // Handle the case where min and max are the same

        return (int) (((double)(num - min) / (max - min)) * 9); // Distribute across 10 buckets (0-9)


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
