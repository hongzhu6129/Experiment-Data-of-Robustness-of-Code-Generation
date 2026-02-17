public class StringFirstThree {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ab";
        String str3 = "a";
        String str4 = "";
        String str5 = "abcdef";


        System.out.println(makeThreeCharString(str1)); // Output: abc
        System.out.println(makeThreeCharString(str2)); // Output: ab#
        System.out.println(makeThreeCharString(str3)); // Output: a##
        System.out.println(makeThreeCharString(str4)); // Output: ###
        System.out.println(makeThreeCharString(str5)); // Output: abc


    }

    public static String makeThreeCharString(String str) {
        if (str.length() >= 3) {
            return str.substring(0, 3);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                if (i < str.length()) {
                    result.append(str.charAt(i));
                } else {
                    result.append("#");
                }
            }
            return result.toString();
        }
    }
}
