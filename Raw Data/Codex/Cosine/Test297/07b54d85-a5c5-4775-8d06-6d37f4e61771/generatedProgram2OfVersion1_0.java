public static String functionone(int n) {
    if (n == 0) {
        return "0";
    }

    int numBits = 32; // For 32-bit integers
    StringBuilder binary = new StringBuilder();

    if (n < 0) { // Two's complement for negative numbers
        n = -n;  // Use absolute value for calculation. We'll invert and add 1 later
         String positiveRepresentation = Integer.toBinaryString(n - 1) ;
         //Fill with leading zeros for negative numbers
        for (int i = positiveRepresentation.length(); i < numBits; i++) {
            binary.append('0');
        }


       //Invert Bits for 2's compliment of negative numbers


        for(int i = positiveRepresentation.length()-1 ; i>=0 ; i--){

            if(positiveRepresentation.charAt(i) == '0')
                binary.append('1');
            else
               binary.append('0');

        }

       return  binary.toString();
    }
    else{

       String positiveRepresentation = Integer.toBinaryString(n);

        for (int i = positiveRepresentation.length(); i < numBits; i++) {
            binary.append('0'); // Fill with leading zeros
        }
        binary.append(positiveRepresentation);


       return binary.toString();
    }



}
