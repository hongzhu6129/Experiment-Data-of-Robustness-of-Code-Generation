public class LastThreeChars {

    public static void main(String[] args) {
        String str1 = "Python 3.0";
        String str2 = "JS Node";
        String str3 = "Programming";

        modifyAndPrint(str1);
        modifyAndPrint(str2); // Demonstrating string shorter than 7
        modifyAndPrint(str3);
    }


    private static void modifyAndPrint(String str) {
        if (str.length() >= 7) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = lastThree + str + lastThree;
            System.out.println(modifiedStr);

        } else {
            System.out.println("String \"" + str + "\" is too short. Must be 7 or more characters.");

        }
    }

}
