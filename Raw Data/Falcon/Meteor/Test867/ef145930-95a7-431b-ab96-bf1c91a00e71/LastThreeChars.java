public class LastThreeChars {

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Javascript";
        String str3 = "JS"; // Test case with string length less than 3

        modifyAndPrintString(str1);
        modifyAndPrintString(str2);
        modifyAndPrintString(str3);

    }

    private static void modifyAndPrintString(String str) {
        if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedString = lastThree + str + lastThree;
            System.out.println(modifiedString);

        } else {
            System.out.println("String length must be 3 or more.");
        }
    }

}
