import java.util.Arrays;
import java.util.Scanner;

public class StringsWithoutOneCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        String[] result = getStringsWithoutOneCharacter(strs, c);

        for (String str : result) {
            System.out.println(str);
        }
    }

    private static String[] getStringsWithoutOneCharacter(String[] strs, char c) {
        String[] result = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            StringBuilder sb = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (ch != c) {
                    sb.append(ch);
                }
            }

            result[i] = sb.toString();
        }

        return result;
    }
}
