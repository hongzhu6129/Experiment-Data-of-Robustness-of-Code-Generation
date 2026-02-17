public class LastThreeChars {

    public static void main(String[] args) {
        // Example usage:
        manipulateDouble(12345.678);  // Output: 67812345.678678
        manipulateDouble(12.34);     // Output: Input string is too short.
        manipulateDouble(12345.6789); // Output: 78912345.6789789
    }

    public static void manipulateDouble(double input) {
        String doubleStr = String.valueOf(input);

        if (doubleStr.length() <= 3) {
            System.out.println("Input string is too short.");
            return;
        }

        int dotIndex = doubleStr.indexOf('.');
        if (dotIndex == -1 || doubleStr.substring(dotIndex+1).length() < 3)
        {
             System.out.println("Input string does not have at least three decimal places.");
             return;
        }

        String lastThree = doubleStr.substring(doubleStr.length() - 3);
        String result = lastThree + doubleStr + lastThree;
        System.out.println(result);

    }
}
