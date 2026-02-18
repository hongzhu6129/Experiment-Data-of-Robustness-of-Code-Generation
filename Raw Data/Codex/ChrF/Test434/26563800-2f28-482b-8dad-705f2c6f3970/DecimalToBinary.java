public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 5; // You can change this to any integer

        // Method 1: Using Integer.toBinaryString() (Simplest)
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: " + binaryString);


        // Method 2: Using manual conversion (for understanding)
        if (decimalNumber == 0) {
            System.out.println("Binary number is: 0"); 
        } else {
            String binary = "";
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binary = remainder + binary; // Prepend the remainder
                decimalNumber /= 2;
            }
            System.out.println("Binary number (manual method) is: " + binary);
        }

         //Method 3: Using StringBuilder for efficiency (better for large numbers)
        if(decimalNumber ==0 ){
            System.out.println("Binary number is : 0");
        }
        else{
            StringBuilder binary = new StringBuilder();
            while (decimalNumber > 0){
                int remainder = decimalNumber%2;
                binary.insert(0,remainder);
                decimalNumber /=2;
            }
            System.out.println("Binary number (StringBuilder method) is: " + binary.toString());
        }



        // Taking input from the command line (optional)
        // To use this, compile and run from the terminal: java DecimalToBinary <number>
        // Example: java DecimalToBinary 123
        if (args.length > 0) {
            try {
                int inputNumber = Integer.parseInt(args[0]);
                String inputBinary = Integer.toBinaryString(inputNumber);
                System.out.println("Binary number (from input): " + inputBinary);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter an integer.");
            }
        }


    }
}
