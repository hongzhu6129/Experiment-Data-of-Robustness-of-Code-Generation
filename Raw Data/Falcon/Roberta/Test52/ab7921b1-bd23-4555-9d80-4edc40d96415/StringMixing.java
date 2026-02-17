import java.util.Arrays;

public class StringMixing {

    public String stringMixing(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < charArray1.length || j < charArray2.length) {
            if (i < charArray1.length) {
                result.append(charArray1[i]);
                i++;
            }
            if (j < charArray2.length) {
                result.append(charArray2[j]);
                j++;
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        StringMixing mixer = new StringMixing();
        String s1 = "abc";
        String s2 = "xyz";
        String mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString); // Output: axbycz (or similar, order within each string doesn't matter)

        s1 = "a";
        s2 = "123";
        mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString);  // Output: a123

         s1 = "1234";
        s2 = "ab";
        mixedString = mixer.stringMixing(s1, s2);
        System.out.println(mixedString);  // Output: 1234ab (or similar)


    }
}
