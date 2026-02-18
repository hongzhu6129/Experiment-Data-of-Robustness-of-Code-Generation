public class StringManipulation {

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
        StringManipulation sm = new StringManipulation();

        System.out.println(sm.minCat("Hello", "Hi")); // lloHi
        System.out.println(sm.minCat("Hello", "java")); // ellojava
        System.out.println(sm.minCat("java", "Hello")); // javaello
        System.out.println(sm.minCat("abc", "x"));  // cx
        System.out.println(sm.minCat("x", "abc")); // xbc
        System.out.println(sm.minCat("abc", "")); // abc
    }
}
