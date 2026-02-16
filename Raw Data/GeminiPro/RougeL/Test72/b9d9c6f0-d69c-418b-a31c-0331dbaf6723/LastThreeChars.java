public class LastThreeChars {

    public static void main(String[] args) {
        String originalString = "programming"; // Example string, you can change it

        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return; // Exit if the string is too short
        }


        String lastThreeChars = originalString.substring(originalString.length() - 3);
        String modifiedString = lastThreeChars + originalString + lastThreeChars;
        System.out.println(modifiedString);


        originalString = "Python"; 
        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return;
        }
        lastThreeChars = originalString.substring(originalString.length() - 3);
        modifiedString = lastThreeChars + originalString + lastThreeChars;
        System.out.println(modifiedString);


        originalString = "coding"; 
        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return;
        }
        lastThreeChars = originalString.substring(originalString.length() - 3);
        modifiedString = lastThreeChars + originalString + lastThreeChars;
        System.out.println(modifiedString);




        originalString = "ab"; // Example of a string that's too short
        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return;
        }
        lastThreeChars = originalString.substring(originalString.length() - 3);
        modifiedString = lastThreeChars + originalString + lastThreeChars;
        System.out.println(modifiedString);


    }
}
