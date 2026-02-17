public class HammingNumbers {

    public static void main(String[] args) {
        int[] hamming = new int[20];
        int nextHamming = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;

        hamming[0] = 1; // The first Hamming number

        for (int i = 1; i < 20; i++) {
            // Find the smallest next Hamming number
            nextHamming = Math.min(next2, Math.min(next3, next5)); 
            hamming[i] = nextHamming;

            // Update the next multiples for 2, 3, and 5
            if (nextHamming == next2) {
                i2++;
                next2 = hamming[i2] * 2;
            }
            if (nextHamming == next3) {  // Note:  Use separate ifs, not else-if
                i3++;
                next3 = hamming[i3] * 3;
            }
            if (nextHamming == next5) {  // Again: Separate if.  A number can be divisible by both 2 and 3, for example
                i5++;
                next5 = hamming[i5] * 5;
            }
        }

        // Print the first 20 Hamming numbers
        System.out.println("The first 20 Hamming numbers are:");
        for (int i = 0; i < 20; i++) {
            System.out.print(hamming[i] + " ");
        }
    }
}
