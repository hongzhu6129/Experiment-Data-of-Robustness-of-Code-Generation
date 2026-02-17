public class LongestZeroSequence {

    public static void main(String[] args) {
        int n = 1041; // Example input
        System.out.println("Longest sequence of zeros: " + longestZeroSequence(n));

        n = 32; // Example input
        System.out.println("Longest sequence of zeros: " + longestZeroSequence(n));


        n = 529; // Example input 1000010001
        System.out.println("Longest sequence of zeros: " + longestZeroSequence(n));

        n = 0;
        System.out.println("Longest sequence of zeros: " + longestZeroSequence(n));
        
    }

    public static int longestZeroSequence(int n) {
        if (n == 0) {
            return 1; // Special case: binary representation of 0 is just "0"
        }


        String binary = Integer.toBinaryString(n);
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }

        maxLength = Math.max(maxLength, currentLength);  // Check one last time in case the sequence ends with zeros
        return maxLength;
    }
}
