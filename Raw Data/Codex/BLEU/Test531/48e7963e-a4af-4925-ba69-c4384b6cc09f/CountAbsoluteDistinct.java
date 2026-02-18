import java.util.HashSet;
import java.util.Set;

public class CountAbsoluteDistinct {

    public static void main(String[] args) {
        int[] arr = {2, -1, 3, -2, 1, 0, -3}; // Example array

        int distinctCount = countAbsoluteDistinct(arr);

        System.out.println("Number of absolute distinct values: " + distinctCount);
    }

    public static int countAbsoluteDistinct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; 
        }

        Set<Integer> distinctValues = new HashSet<>();

        for (int num : arr) {
            distinctValues.add(Math.abs(num));
        }

        return distinctValues.size();
    }
}
