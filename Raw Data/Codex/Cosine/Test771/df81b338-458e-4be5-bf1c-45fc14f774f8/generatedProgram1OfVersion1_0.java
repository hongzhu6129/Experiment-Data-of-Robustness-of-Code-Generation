public class VanillaString {

    public static void main(String[] args) {
        String inputString = "pythonpyt";

        if (inputString.length() % 2 == 0) { // Check if the string length is even
            int halfLength = inputString.length() / 2;
            String firstHalf = inputString.substring(0, halfLength); // Extract the first half

            // Replace characters in the first half with 'v' (vanilla)
            String vanillaString = firstHalf.replaceAll(".", "v") + inputString.substring(halfLength);
             System.out.println(vanillaString); // Output: vvvvvpyt

        } else {
            System.out.println("Input string must have an even length.");
        }
    }
}
