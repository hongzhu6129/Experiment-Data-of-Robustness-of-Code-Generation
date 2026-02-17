public class StringCat {

    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            return a + b;
        } else if (lenA > lenB) {
            int diff = lenA - lenB;
            return a.substring(diff) + b;
        } else {
            int diff = lenB - lenA;
            return a + b.substring(diff);
        }
    }

    public static void main(String[] args) {
        StringCat sc = new StringCat();
        System.out.println(sc.minCat("Hello", "Hi")); // Output: loHi
        System.out.println(sc.minCat("Hello", "java")); // Output: Hellojava
        System.out.println(sc.minCat("java", "Hello")); // Output: javaello
        System.out.println(sc.minCat("x", "abc"));     // Output: xbc
        System.out.println(sc.minCat("abc", "x"));     // Output: abx

    }
}
