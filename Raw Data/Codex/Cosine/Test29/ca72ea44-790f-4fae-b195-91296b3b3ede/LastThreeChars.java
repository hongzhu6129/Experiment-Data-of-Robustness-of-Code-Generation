public class LastThreeChars {

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "JS";
        String str3 = "PHP";
        String str4 = "C#";

        System.out.println(modifyString(str1)); // honPythonhon
        System.out.println(modifyString(str2)); // Invalid Input
        System.out.println(modifyString(str3)); // PHPPHPPHP
        System.out.println(modifyString(str4)); // Invalid Input

    }


    public static String modifyString(String str) {
        if (str.length() < 3) {
            return "Invalid Input";
        } else {
            String lastThree = str.substring(str.length() - 3);
            return lastThree + str + lastThree;
        }
    }
}
