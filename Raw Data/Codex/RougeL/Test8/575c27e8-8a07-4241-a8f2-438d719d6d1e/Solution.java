import java.util.*;
import java.lang.*;

class Solution {

    public static void check(String s) {
        if (s.length() <= 1) {
            System.out.println(s);
            return;
        }

        StringBuilder sb = new StringBuilder();
        boolean removed = false;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                removed = true;
                while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        if (removed) {
            check(sb.toString());
        } else {
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        check(inputString);
        scanner.close();
    }
}
