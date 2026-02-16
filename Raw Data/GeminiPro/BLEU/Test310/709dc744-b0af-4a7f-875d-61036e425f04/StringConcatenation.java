import java.util.Arrays;

public class StringConcatenation {

    public static String concatenateThirdCharacters(String s1, String s2, String s3) {
        String result = "";

        if (s1.length() >= 3) {
            result += s1.charAt(2);
        }
        if (s2.length() >= 3) {
            result += s2.charAt(2);
        }
        if (s3.length() >= 3) {
            result += s3.charAt(2);
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Java";

        String result = concatenateThirdCharacters(s1, s2, s3);

        System.out.println("Concatenated third characters: " + result); // Output: orl

        s1 = "Hello";
        s2 = "World";
        s3 = "";

        result = concatenateThirdCharacters(s1, s2, s3);

        System.out.println("Concatenated third characters: " + result); // Output: or

        s1 = "";
        s2 = "World";
        s3 = "Java";

        result = concatenateThirdCharacters(s1, s2, s3);

        System.out.println("Concatenated third characters: " + result); // Output: rj

        s1 = "";
        s2 = "";
        s3 = "Java";

        result = concatenateThirdCharacters(s1, s2, s3);

        System.out.println("Concatenated third characters: " + result); // Output: j
    }
}
