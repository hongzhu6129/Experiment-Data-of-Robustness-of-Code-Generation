public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 5; // Replace with any desired decimal number

        if (decimalNumber == 0) {
            System.out.println("Binary number is: 0");
        } else {
            String binaryNumber = "";
            while (decimalNumber > 0) {
                binaryNumber = (decimalNumber % 2) + binaryNumber;
                decimalNumber /= 2;
            }
            System.out.println("Binary number is: " + binaryNumber);
        }


    }
}
