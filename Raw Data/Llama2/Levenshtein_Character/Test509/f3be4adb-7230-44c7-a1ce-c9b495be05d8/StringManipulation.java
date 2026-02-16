public class StringManipulation {

    public static void main(String[] args) {
        String inputString = "javaprogram"; // Example string

        if (inputString.length() > 3) {
            String firstThreeChars = inputString.substring(0, 3);
            String modifiedString = firstThreeChars + inputString + firstThreeChars;
            System.out.println(modifiedString); // Output: javjavaprogramjav
        } else {
            System.out.println("String length must be greater than 3.");
        }


         inputString = "java"; // Example string

        if (inputString.length() > 3) {
            String firstThreeChars = inputString.substring(0, 3);
            String modifiedString = firstThreeChars + inputString + firstThreeChars;
            System.out.println(modifiedString); 
        } else {
            System.out.println("String length must be greater than 3."); //Output: String length must be greater than 3.
        }
    }
}
