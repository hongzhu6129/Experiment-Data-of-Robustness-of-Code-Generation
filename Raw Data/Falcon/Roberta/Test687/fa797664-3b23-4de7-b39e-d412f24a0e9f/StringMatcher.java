import java.util.Arrays;

public class StringMatcher {

    public static void main(String[] args) {
        String[] testCases = {
                "abc", "def",
                "abc", "abc",
                "abcd", "abc",
                "abc", "abcd",
                "", "",
                "", "abc",
                "abc", ""
        };

        for (int i = 0; i < testCases.length; i += 2) {
            String s1 = testCases[i];
            String s2 = testCases[i + 1];

            boolean result = matches(s1, s2);
            System.out.println(String.format("%s matches %s: %s", s1, s2, result));
        }
    }

    public static boolean matches(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
