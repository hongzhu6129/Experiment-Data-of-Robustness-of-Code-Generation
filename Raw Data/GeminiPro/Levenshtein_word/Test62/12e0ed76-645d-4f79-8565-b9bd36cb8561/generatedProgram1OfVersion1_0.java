public class FirstLastChars {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(function(str1, str2)); // Output: hwd

        str1 = "a";
        str2 = "b";
        System.out.println(function(str1, str2)); // Output: ab


        str1 = "";
        str2 = "";
        System.out.println(function(str1, str2)); // Output: ##

        str1 = "java";
        str2 = "";
        System.out.println(function(str1, str2)); // Output: j#

        str1 = "";
        str2 = "coding";
        System.out.println(function(str1, str2)); // Output: #g


    }

    public static String function(String str1, String str2) {
        char firstChar1 = (str1.length() > 0) ? str1.charAt(0) : '#';
        char lastChar2 = (str2.length() > 0) ? str2.charAt(str2.length() - 1) : '#';

        return String.valueOf(firstChar1) + String.valueOf(lastChar2);
    }
}


