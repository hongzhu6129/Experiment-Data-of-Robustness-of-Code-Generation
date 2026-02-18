public class MoveLowerCase {

    public static void main(String[] args) {
        String word1 = "HeLlO";
        String word2 = "pRogRAM";
        String word3 = "Java";

        System.out.println(validate(word1)); // eHlLO
        System.out.println(validate(word2)); // poRGRAM
        System.out.println(validate(word3)); // avaJ
    }

    public static String validate(String word) {
        StringBuilder lowerCaseChars = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseChars.append(c);
            } else {
                otherChars.append(c);
            }
        }

        return lowerCaseChars.toString() + otherChars.toString();
    }
}
