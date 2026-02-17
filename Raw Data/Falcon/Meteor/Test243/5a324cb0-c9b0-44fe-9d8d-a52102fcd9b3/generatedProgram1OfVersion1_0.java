public class RemoveAdjacentDuplicates {

    public static void check(String s) {
        if (s == null || s.length() <= 1) {
            System.out.println(s);
            return;
        }

        StringBuilder sb = new StringBuilder();
        removeDuplicatesRecursive(s, 0, sb);
        System.out.println(sb.toString());
    }

    private static void removeDuplicatesRecursive(String s, int index, StringBuilder sb) {
        if (index >= s.length()) {
            return;
        }

        char currentChar = s.charAt(index);
        if (sb.length() == 0 || sb.charAt(sb.length() - 1) != currentChar) {
            sb.append(currentChar);
            removeDuplicatesRecursive(s, index + 1, sb);
        } else {
            removeDuplicatesRecursive(s, index + 1, sb);
        }



    }

    public static void main(String[] args) {
       check("caaabbbaacdddd"); // Output: cabac d
       check("abbabccca"); // Output: ababcca
       check("azxxzy"); // Output: azzy
       check("geeksforgeeg"); // Output: geksforgeg
        check(""); // Output: "" (empty string)
        check(null); // Output: null
        check("a"); // Output: a
        check("aa"); // Output: a


    }
}
