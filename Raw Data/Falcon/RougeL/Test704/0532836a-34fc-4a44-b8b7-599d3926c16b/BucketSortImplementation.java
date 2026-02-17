import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSortImplementation {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bucketSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bucketSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int minVal = min(arr);
        int maxVal = max(arr);

        int numBuckets = (int) Math.sqrt(arr.length); // Or any other reasonable bucket count strategy
        List<Integer>[] buckets = new List[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new LinkedList<>(); // Or ArrayList
        }

        for (int num : arr) {
            int bucketIndex = hash(num, minVal, maxVal, numBuckets);
            buckets[bucketIndex].add(num);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket); // Use any sorting algorithm for individual buckets or recursive bucket sort
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }


    private static int hash(int num, int minVal, int maxVal, int numBuckets) {
        // Distribute elements across buckets based on their range
        return (int) ((double)(num - minVal) / (maxVal - minVal) * numBuckets) ;

    }



    public static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}



