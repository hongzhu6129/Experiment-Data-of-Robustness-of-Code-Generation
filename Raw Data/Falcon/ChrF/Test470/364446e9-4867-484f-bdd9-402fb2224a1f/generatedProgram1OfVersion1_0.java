public class ReverseStringRecursion {

    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str)); // Output: dlroW olleH

        str = "";
        System.out.println(reverse(str)); // Output:

        str = null;
        System.out.println(reverse(str)); // Output: null
    }
}
