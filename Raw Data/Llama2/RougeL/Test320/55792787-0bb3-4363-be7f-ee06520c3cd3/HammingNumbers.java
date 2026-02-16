public class HammingNumbers {

    public static void main(String[] args) {
        int[] hamming = new int[20];
        int nextHamming = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        int next2 = 2, next3 = 3, next5 = 5;

        hamming[0] = 1;  // The first Hamming number is 1

        for (int i = 1; i < 20; i++) {
            nextHamming = Math.min(next2, Math.min(next3, next5)); // Find the smallest of the next candidates

            hamming[i] = nextHamming;

            if (nextHamming == next2) {
                i2++;
                next2 = hamming[i2] * 2;
            }
            if (nextHamming == next3) {
                i3++;
                next3 = hamming[i3] * 3;
            }
            if (nextHamming == next5) {
                i5++;
                next5 = hamming[i5] * 5;
            }
        }

        System.out.println("The first 20 Hamming numbers are:");
        for (int h : hamming) {
            System.out.print(h + " ");
        }
    }
}



