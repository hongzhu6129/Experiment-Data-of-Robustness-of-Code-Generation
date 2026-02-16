public class BinaryToDecimal {

    public static void main(String[] args) {
        String binaryString = "100"; // Replace with user input if needed
        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal Number: " + decimal);


        // Alternate approach using Integer.parseInt with radix
        //  binaryString = "100";  // Replace with user input if needed
        //  decimal = Integer.parseInt(binaryString, 2);
        //  System.out.println("Decimal Number (using parseInt): " + decimal);


    }
}
