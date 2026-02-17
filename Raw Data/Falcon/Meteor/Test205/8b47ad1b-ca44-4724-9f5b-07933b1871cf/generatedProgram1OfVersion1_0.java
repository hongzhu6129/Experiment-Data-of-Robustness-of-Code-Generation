public class WordReplace {

    public String wordReplaceBy(String str) {
        if (str == null) {
            return null;
        }

        return str.replace(" is ", " is not "); 
    }

    public static void main(String[] args) {
        WordReplace replacer = new WordReplace();

        String str1 = "This is a test string.";
        String replacedStr1 = replacer.wordReplaceBy(str1);
        System.out.println("Original string: " + str1);
        System.out.println("Replaced string: " + replacedStr1);

        String str2 = "is this is a test?";
        String replacedStr2 = replacer.wordReplaceBy(str2);
        System.out.println("Original string: " + str2);
        System.out.println("Replaced string: " + replacedStr2);


        String str3 = "What is this?"; // Demonstrates handling "is" at the beginning/end
        String replacedStr3 = replacer.wordReplaceBy(str3);
        System.out.println("Original string: " + str3);
        System.out.println("Replaced string: " + replacedStr3);


         String str4 = "This is it."; // "is" followed by other characters, not just space
        String replacedStr4 = replacer.wordReplaceBy(str4);
        System.out.println("Original string: " + str4);
        System.out.println("Replaced string: " + replacedStr4);


        String str5 = null; // Testing null input
        String replacedStr5 = replacer.wordReplaceBy(str5);
        System.out.println("Original string: " + str5);
        System.out.println("Replaced string: " + replacedStr5);

    }
}
