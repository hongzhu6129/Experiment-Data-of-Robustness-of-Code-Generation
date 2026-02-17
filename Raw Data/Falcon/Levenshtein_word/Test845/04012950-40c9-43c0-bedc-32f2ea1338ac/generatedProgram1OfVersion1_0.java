public class LastThreeChars {

    public static void main(String[] args) {
        String str = "programming"; // Example string

        if (str.length() < 3) {
            System.out.println("String length must be 3 or more.");
            return;
        }

        String lastThree = str.substring(str.length() - 3);
        String modifiedStr = lastThree + str + lastThree;

        System.out.println(modifiedStr);


         str = "Python"; // Another example

        if (str.length() < 3) {
            System.out.println("String length must be 3 or more.");
            return;
        }

        lastThree = str.substring(str.length() - 3);
        modifiedStr = lastThree + str + lastThree;

        System.out.println(modifiedStr);


        str = "ab"; // Example with string length less than 3
        if (str.length() < 3) {
            System.out.println("String length must be 3 or more.");
            return;
        }

        lastThree = str.substring(str.length() - 3); // This would cause error if not checked before
        modifiedStr = lastThree + str + lastThree;


        System.out.println(modifiedStr); 


    }
}
