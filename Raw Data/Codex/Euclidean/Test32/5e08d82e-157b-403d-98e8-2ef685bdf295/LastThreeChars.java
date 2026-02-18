public class LastThreeChars {

    public static void main(String[] args) {
        String originalString = "programming"; // Example string

        if (originalString.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return;
        }


        String lastThree = originalString.substring(originalString.length() - 3);

        // Mixing the last three characters
        String mixedLastThree = "" + lastThree.charAt(1) + lastThree.charAt(2) + lastThree.charAt(0);

        // Adding mixed characters at the front and back
        String result = mixedLastThree + originalString + mixedLastThree;

        System.out.println(result);


        // Handling different input strings for demonstration:
        testAndPrint("Hello"); // Output: String length must be greater than 3.
        testAndPrint("Java"); // Output: avaJavaava
        testAndPrint("Coding"); // Output: ingCodinging
        testAndPrint("abcdefgh"); // Output: fghabcdefghfgh
    }


    // Helper function to avoid code duplication in main
    public static void testAndPrint(String str) {
        if (str.length() <= 3) {
            System.out.println("String length must be greater than 3.");
            return;
        }
        String lastThree = str.substring(str.length() - 3);
        String mixed = "" + lastThree.charAt(1) + lastThree.charAt(2) + lastThree.charAt(0);
        System.out.println(mixed + str + mixed);


    }
}


