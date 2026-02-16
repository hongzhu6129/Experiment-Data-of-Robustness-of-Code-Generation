public class StringCopy {

    public static void main(String[] args) {

        String originalString = "Hello"; // Example string

        if (originalString.length() < 3) {
            System.out.println("String length must be 3 or more.");
            return; // Exit if the string is too short
        }

        String lastThreeChars = originalString.substring(originalString.length() - 3);

        String newString = lastThreeChars + lastThreeChars + lastThreeChars + lastThreeChars;


        System.out.println(newString); 
    }
}
