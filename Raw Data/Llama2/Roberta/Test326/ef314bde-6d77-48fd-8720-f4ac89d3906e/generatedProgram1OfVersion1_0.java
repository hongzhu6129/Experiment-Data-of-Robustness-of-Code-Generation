import java.util.HashMap;

public class HexToBinary {

    public static int hex_to_binary(String hex) {
        HashMap<Character, String> hexCharToBinary = new HashMap<>();
        hexCharToBinary.put('0', "0000");
        hexCharToBinary.put('1', "0001");
        hexCharToBinary.put('2', "0010");
        hexCharToBinary.put('3', "0011");
        hexCharToBinary.put('4', "0100");
        hexCharToBinary.put('5', "0101");
        hexCharToBinary.put('6', "0110");
        hexCharToBinary.put('7', "0111");
        hexCharToBinary.put('8', "1000");
        hexCharToBinary.put('9', "1001");
        hexCharToBinary.put('A', "1010");
        hexCharToBinary.put('B', "1011");
        hexCharToBinary.put('C', "1100");
        hexCharToBinary.put('D', "1101");
        hexCharToBinary.put('E', "1110");
        hexCharToBinary.put('F', "1111");

        StringBuilder binary = new StringBuilder();
        for (char c : hex.toUpperCase().toCharArray()) {
            if (hexCharToBinary.containsKey(c)) {
                binary.append(hexCharToBinary.get(c));
            } else {
                // Handle invalid hex characters (optional)
                System.err.println("Invalid hex character: " + c);
                return -1; // Or throw an exception
            }
        }

       try {
           return Integer.parseInt(binary.toString(), 2); //Convert binary string to integer
       } catch (NumberFormatException e) {
           System.err.println("Resulting binary is too large for an integer: " + binary.toString());
           return -1; // Or throw an exception
       }
    }

    public static void main(String[] args) {
        String hex = "37";
        int binary = hex_to_binary(hex);
        if (binary != -1) { // Check if conversion was successful
            System.out.println("Equivalent binary number is: " + Integer.toBinaryString(binary));
        }

        hex = "AF"; //Test with another hex
        binary = hex_to_binary(hex);
          if (binary != -1) { // Check if conversion was successful
              System.out.println("Equivalent binary number is: " + Integer.toBinaryString(binary));
          }
    }
}
