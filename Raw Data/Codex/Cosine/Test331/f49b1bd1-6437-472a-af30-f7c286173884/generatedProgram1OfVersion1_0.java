import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a = "ab";
        String b = "cd";
        findInterleavingStrings(a, b);
    }

    public static void findInterleavingStrings(String a, String b) {
        List<String> result = new ArrayList<>();
        findInterleavingStringsHelper(a, b, "", result);
        System.out.println(result);
    }

    public static void findInterleavingStringsHelper(String a, String b, String current, List<String> result) {
        if (a.isEmpty() && b.isEmpty()) {
            result.add(current);
            return;
        }
        if (!a.isEmpty()) {
            findInterleavingStringsHelper(a.substring(1), b, current + a.charAt(0), result);
        }
        if (!b.isEmpty()) {
            findInterleavingStringsHelper(a, b.substring(1), current + b.charAt(0), result);
        }
    }
}
