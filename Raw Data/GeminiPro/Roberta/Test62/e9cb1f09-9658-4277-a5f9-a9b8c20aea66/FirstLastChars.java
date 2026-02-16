public class FirstLastChars {

    public static String makeString(String str1, String str2) {
        char firstChar;
        char lastChar;

        if (str1.length() == 0) {
            firstChar = '#';
        } else {
            firstChar = str1.charAt(0);
        }

        if (str2.length() == 0) {
            lastChar = '#';
        } else {
            lastChar = str2.charAt(str2.length() - 1);
        }

        return String.valueOf(firstChar) + String.valueOf(lastChar);
    }

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = ""; // Empty string
        String result = makeString(str1, str2);
        System.out.println(result); // Output: P#


        String str3 = "";
        String str4 = "Java";
        String result2 = makeString(str3, str4);
        System.out.println(result2); // Output: #a

        String str5 = "";
        String str6 = "";
        String result3 = makeString(str5, str6);
        System.out.println(result3); // Output: ##

        String str7 = "Hello";
        String str8 = "World";
        String result4 = makeString(str7, str8);
        System.out.println(result4); // Output: Hd


    }
}
