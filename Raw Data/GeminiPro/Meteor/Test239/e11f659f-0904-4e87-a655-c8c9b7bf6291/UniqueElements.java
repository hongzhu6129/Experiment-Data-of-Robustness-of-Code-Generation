import java.util.Arrays;
import java.util.HashSet;

public class UniqueElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        int[] unique = getUniqueElements(arr);
        System.out.println(Arrays.toString(unique)); // Output: [1, 2, 3, 4, 5]
    }

    private static int[] getUniqueElements(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int element : arr) {
            uniqueSet.add(element);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
