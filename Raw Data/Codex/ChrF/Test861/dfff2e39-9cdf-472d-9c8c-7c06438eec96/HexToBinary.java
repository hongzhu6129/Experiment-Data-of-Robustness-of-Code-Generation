import java.util.HashMap;

public class HexToBinary {

    public static int hex_to_binary(String hex) {
        HashMap<Character, String> hexMap = new HashMap<>();
        hexMap.put('0', "0000");
        hexMap.put('1', "0001");
        hexMap.put('2', "0010");
        hexMap.put('3', "0011");
        hexMap.put('4', "0100");
        hexMap.put('5', "0101");
        hexMap.put('6', "0110");
        hexMap.put('7', "0111");
        hexMap.put('8', "1000");
        hexMap.put('9', "1001");
        hexMap.put('A', "1010");
        hexMap.put('B', "1011");
        hexMap.put('C', "1100");
        hexMap.put('D', "1101");
        hexMap.put('E', "1110");
        hexMap.put('F', "1111");
        hexMap.put('a', "1010");
        hexMap.put('b', "1011");
        hexMap.put('c', "1100");
        hexMap.put('d', "1101");
        hexMap.put('e', "1110");
        hexMap.put('f', "1111");


        StringBuilder binary = new StringBuilder();
        for (char c : hex.toCharArray()) {
            if (hexMap.containsKey(c)) {
                binary.append(hexMap.get(c));
            } else {
                // Handle invalid hex characters (optional)
                System.err.println("Invalid hex character: " + c);
                return -1; // Or throw an exception
            }
        }


        try {
             return Integer.parseInt(binary.toString()); // Return as integer.  Limited in size.
             // For larger hex values, don't try to convert to integer.
        }
        catch (NumberFormatException e) {
            System.err.println("Binary representation too large for int.");
            return -1;
        }


    }

    public static void main(String[] args) {
        String hex = "37"; // Example input
        // In a real application, you would get input from the user or another source.
        // For example, using Scanner:
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // String hex = scanner.next();


        int binaryEquivalent = hex_to_binary(hex); //returns -1 on error.

        if(binaryEquivalent != -1)
            System.out.println(binaryEquivalent); // Outputs 110111 for input "37"

    }
}
