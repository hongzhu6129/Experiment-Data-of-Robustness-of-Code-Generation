public class StringCat {

    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            return a + b;
        } else if (lenA > lenB) {
            int diff = lenA - lenB;
            return a.substring(diff) + b;
        } else { // lenB > lenA
            int diff = lenB - lenA;
            return a + b.substring(diff);
        }
    }

    public static void main(String[] args) {
        StringCat sc = new StringCat();
        System.out.println(sc.minCat("Hello", "Hi")); // lloHi
        System.out.println(sc.minCat("Hello", "java")); // ellojava
        System.out.println(sc.minCat("java", "Hello")); // javaello
        System.out.println(sc.minCat("abc", "x")); // cx
        System.out.println(sc.minCat("x", "abc")); // xc
        System.out.println(sc.minCat("x", ""));  // x
        System.out.println(sc.minCat("", "x"));  // x


    }
}
