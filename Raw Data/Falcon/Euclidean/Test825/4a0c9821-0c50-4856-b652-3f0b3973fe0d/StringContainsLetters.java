public class StringContainsLetters {

    public static void main(String[] args) {
        System.out.println(test("hello", "ell")); // True
        System.out.println(test("hello", "lle")); // True  (order doesn't matter)
        System.out.println(test("hello", "L")); // False (case-sensitive)
        System.out.println(test("hello", "eo")); // True
        System.out.println(test("hello", "eoo")); // False (not enough 'o's in the first string)
        System.out.println(test("hello", "helloo")); //False (not enough 'o's in the first string)
        System.out.println(test("hello", "")); //True (Empty string is considered contained)



    }

    public static boolean test(String str1, String str2) {
        if (str2.length() == 0) {
            return true; //Empty string is considered a subset
        }

        int[] charCounts1 = new int[256]; //Character counts for str1
        int[] charCounts2 = new int[256]; //Character counts for str2


        // Count character occurrences in str1
        for (char c : str1.toCharArray()) {
            charCounts1[c]++;
        }

        // Count character occurrences in str2
        for (char c : str2.toCharArray()) {
            charCounts2[c]++;
        }

        // Check if str2's characters are present in sufficient quantity in str1
        for (int i = 0; i < 256; i++) {
            if (charCounts2[i] > charCounts1[i]) {
                return false;
            }
        }

        return true; 
    }
}
