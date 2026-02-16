public class LastThreeChars {

    public static void main(String[] args) {
        String str = "programming"; // Example string

        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = "XXX" + str + lastThree + "XXX";
            System.out.println(modifiedStr);
        } else {
            System.out.println("String length must be greater than 3.");
        }


        str = "python"; // Example string
        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = "XXX" + str + lastThree + "XXX";
            System.out.println(modifiedStr);

        } else {
            System.out.println("String length must be greater than 3.");
        }

          str = "coding"; // Example string
        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = "XXX" + str + lastThree + "XXX";
            System.out.println(modifiedStr);

        } else {
            System.out.println("String length must be greater than 3.");
        }


        str = "java"; // Example string demonstrating the "else" condition.
        if (str.length() > 3) {
            String lastThree = str.substring(str.length() - 3);
            String modifiedStr = "XXX" + str + lastThree + "XXX";
            System.out.println(modifiedStr);
        } else {
            System.out.println("String length must be greater than 3.");
        }
    }
}
