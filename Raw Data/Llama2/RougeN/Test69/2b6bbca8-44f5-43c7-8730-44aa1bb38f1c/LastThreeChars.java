public class LastThreeChars {

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "JavaScript";
        String str3 = "Hi";

        modifyAndPrint(str1);
        modifyAndPrint(str2);
        modifyAndPrint(str3);

    }

    public static void modifyAndPrint(String str) {
        if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedString = lastThree + str + lastThree;
            System.out.println(modifiedString);

        } else {
            System.out.println("String length must be 3 or more.");
        }
    }
}
