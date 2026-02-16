public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 5; // You can change this to any decimal number

        if (decimalNumber == 0) {
            System.out.println("Binary number is: 0");
            return;
        }

        String binaryNumber = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber; // Prepend remainder to the string
            decimalNumber = decimalNumber / 2;
        }


        System.out.println("Binary number is: " + binaryNumber);


        //  Alternative using Integer.toBinaryString():
        //  System.out.println("Binary number is: " + Integer.toBinaryString(5));

    }
}
