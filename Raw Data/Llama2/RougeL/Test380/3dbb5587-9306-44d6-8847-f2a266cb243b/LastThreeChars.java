public class LastThreeChars {

    public static void main(String[] args) {
        String originalString = "programming"; // Example string

        if (originalString.length() > 3) {
            String lastThree = originalString.substring(originalString.length() - 3);
            String modifiedString = lastThree + originalString + lastThree;
            System.out.println(modifiedString); // Output: ingprogramminging

            originalString = "java"; // Another example
            if (originalString.length() > 3) {
               lastThree = originalString.substring(originalString.length() - 3);
               modifiedString = lastThree + originalString + lastThree;
               System.out.println(modifiedString);
            } else {
                System.out.println("String length is not greater than 3."); // Output for "java"
            }


        } else {
            System.out.println("String length is not greater than 3.");
        }


         originalString = "abcdef"; // Yet another example
            if (originalString.length() > 3) {
               String lastThreeChars = originalString.substring(originalString.length() - 3);
               String modifiedStr = lastThreeChars + originalString + lastThreeChars;
               System.out.println(modifiedStr); // Output for "abcdef": defabcdefdef
            } else {
                System.out.println("String length is not greater than 3."); 
            }

    }
}
