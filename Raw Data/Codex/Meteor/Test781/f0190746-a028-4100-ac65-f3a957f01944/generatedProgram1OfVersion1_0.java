import java.util.Arrays;

public class StringPermutation {

    public static void main(String[] args) {
        String str1 = "xxyz";
        String str2 = "yxzx";
        boolean arePermutations = stringPermutation(str1, str2);
        System.out.println("Original strings: " + str1 + " " + str2 + " " + arePermutations);


        str1 = "abc";
        str2 = "cab";
        arePermutations = stringPermutation(str1, str2);
        System.out.println("Original strings: " + str1 + " " + str2 + " " + arePermutations);


        str1 = "abcd";
        str2 = "abce";
        arePermutations = stringPermutation(str1, str2);
        System.out.println("Original strings: " + str1 + " " + str2 + " " + arePermutations);

    }

    public static boolean stringPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
