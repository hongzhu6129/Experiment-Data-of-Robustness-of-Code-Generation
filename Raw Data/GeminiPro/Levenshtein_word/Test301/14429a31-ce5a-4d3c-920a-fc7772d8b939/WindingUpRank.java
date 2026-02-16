import java.util.HashMap;
import java.util.Map;

public class WindingUpRank {

    public static void main(String[] args) {
        String str = "abcabc";
        int rank = findWindingUpRank(str);
        System.out.println("The winding-up rank of the given string is: " + rank);
    }

    public static int findWindingUpRank(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        int maxCount = 0;
        for (Integer count : charCountMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
