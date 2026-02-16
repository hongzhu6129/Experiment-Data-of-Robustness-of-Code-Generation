import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Given an array of strings, return the indexes of the strings which have
     * one more letter that the previous string on the alphabet.
     *
     * For example:
     * should("a", "b", "d") == [1]
     * should("a", "c", "f") == [1, 2]
     * should("a", "c", "e", "g") == [1, 3]
     * should("a", "d", "e", "g") == [1, 2, 3]
     * should("a", "e", "g") == [1, 2]
     * should("a", "g") == [1]
     * should("a") == []
     * should() == []
     * should("b", "a") == []
     * should("a", "a") == []
     * should("a", "a", "a") == []
     * should("a", "b", "b") == [1]
     *
     * @param strings The array of strings to index.
     * @return The indexes of the strings which have one more letter that the previous string on the alphabet.
     */
    public int[] should(String... strings) {
        if (strings.length == 0) {
            return new int[0];
        }

        Map<Character, Integer> lastIndex = new HashMap<>();
        int[] indexes = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            char firstChar = string.charAt(0);
            Integer lastIndexOfChar = lastIndex.get(firstChar);
            if (lastIndexOfChar != null && lastIndexOfChar + 1 == i) {
                indexes[i] = lastIndexOfChar + 1;
            }
            lastIndex.put(firstChar, i);
        }

        return indexes;
    }
}
