import java.util.HashMap;
import java.util.Map;

public class SingleNumberFinder {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int singleNumber = getSingleNumber(arr);
        System.out.println(singleNumber + " appears only once");
    }

    public static int getSingleNumber(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // Or throw an exception if no single number is found.  This would be appropriate if the problem statement GUARANTEED a single number.
    }
}
