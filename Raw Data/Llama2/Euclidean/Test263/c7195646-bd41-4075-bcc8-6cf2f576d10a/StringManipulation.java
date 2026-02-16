public class StringManipulation {

    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            return a + b;
        } else if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        } else {
            return a + b.substring(lenB - lenA);
        }
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();

        // Test cases
        System.out.println(sm.minCat("Hello", "Hi")); // Output: loHi
        System.out.println(sm.minCat("Hello", "java")); // Output: Hellojava
        System.out.println(sm.minCat("java", "Hello"));  // Output: javaello
        System.out.println(sm.minCat("abc", "xyz")); //Output: abcxyz



    }
}
