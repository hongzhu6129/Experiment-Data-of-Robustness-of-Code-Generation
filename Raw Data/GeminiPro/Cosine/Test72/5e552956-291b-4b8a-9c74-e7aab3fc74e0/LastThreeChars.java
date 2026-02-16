public class LastThreeChars {

    public static void main(String[] args) {
        String str = "Python"; // Example string

        if (str.length() < 3) {
            System.out.println("String must be at least 3 characters long.");
            return;
        }

        String lastThree = str.substring(str.length() - 3);
        String modifiedStr = lastThree + str + lastThree;

        System.out.println(modifiedStr);


        // More test cases
        test("coding");
        test("Hello");
        test("ab"); // Should print error message

    }

    // Helper function for testing (not required for the core problem)
    static void test(String inputStr) {
        if (inputStr.length() < 3) {
            System.out.println("String \"" + inputStr + "\" must be at least 3 characters long.");
        } else {
            String lastThree = inputStr.substring(inputStr.length() - 3);
            String modifiedStr = lastThree + inputStr + lastThree;
            System.out.println(modifiedStr);
        }
    }
}
