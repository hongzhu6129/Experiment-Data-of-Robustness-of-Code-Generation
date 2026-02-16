public class StringManipulation {

    public static void main(String[] args) {
        String originalString = "HelloWorld"; // Example string

        if (originalString.length() > 3) {
            String lastThreeChars = originalString.substring(originalString.length() - 3);
            String modifiedString = lastThreeChars + originalString + lastThreeChars;
            System.out.println("Modified string: " + modifiedString); // Output: rldHelloWorldrld
        } else {
            System.out.println("String length must be greater than 3.");
        }


         originalString = "Programming"; // Example string

        if (originalString.length() > 3) {
            String lastThreeChars = originalString.substring(originalString.length() - 3);
            String modifiedString = lastThreeChars + originalString + lastThreeChars;
            System.out.println("Modified string: " + modifiedString); // Output: ingProgramminging
        } else {
            System.out.println("String length must be greater than 3.");
        }



        originalString = "Code"; // Example string

        if (originalString.length() > 3) {
            String lastThreeChars = originalString.substring(originalString.length() - 3);
            String modifiedString = lastThreeChars + originalString + lastThreeChars;
            System.out.println("Modified string: " + modifiedString); 
        } else {
            System.out.println("String length must be greater than 3.");  // Output: String length must be greater than 3.
        }
    }
}
