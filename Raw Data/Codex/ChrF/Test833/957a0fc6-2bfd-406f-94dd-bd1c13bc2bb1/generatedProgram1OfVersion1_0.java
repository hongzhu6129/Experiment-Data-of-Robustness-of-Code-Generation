public class LastThreeChars {

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "JS";
        String str3 = "Code";

        modifyAndPrint(str1); // Output: honPythonhon
        modifyAndPrint(str2); // Output: String length must be greater than 3
        modifyAndPrint(str3); // Output: odeCodeode

    }

    public static void modifyAndPrint(String str) {
        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            System.out.println(lastThree + str + lastThree);

        } else {
            System.out.println("String length must be greater than 3");
        }
    }


}
