public class DuckNumberChecker {

    public static void main(String[] args) {
        // Test cases (you can modify these to try different numbers)
        int num1 = 3210;
        int num2 = 7056;
        int num3 = 8430709;
        int num4 = 8237; // Not a duck number (no zeros)
        int num5 = 08237; // Not a duck number (leading zero)
        int num6 = 04309; // Not a duck number (leading zero)

        checkDuckNumber(num1);
        checkDuckNumber(num2);
        checkDuckNumber(num3);
        checkDuckNumber(num4);
        checkDuckNumber(num5);
        checkDuckNumber(num6);


    }

    public static void checkDuckNumber(int num) {

        String numStr = String.valueOf(num);

        if (numStr.charAt(0) == '0') {
            System.out.println(num + " is not a duck number (leading zero)");
            return;
        }

        boolean hasZero = false;
        for (int i = 1; i < numStr.length(); i++) {  // Start from index 1
            if (numStr.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }


        if (hasZero) {
            System.out.println(num + " is a duck number");
        } else {
            System.out.println(num + " is not a duck number (no zeros)");
        }
    }
}
