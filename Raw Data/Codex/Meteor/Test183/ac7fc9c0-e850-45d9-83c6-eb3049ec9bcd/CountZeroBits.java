public class CountZeroBits {

    public static int countBitsTozeroBasedOnString(int n) {
        String binaryString = Integer.toBinaryString(n);
        int zeroCount = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '0') {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int zeroCount1 = countBitsTozeroBasedOnString(num1);
        System.out.println("Number of zero bits in " + num1 + ": " + zeroCount1); // Output: 1

        int num2 = 0;
        int zeroCount2 = countBitsTozeroBasedOnString(num2);
        System.out.println("Number of zero bits in " + num2 + ": " + zeroCount2); // Output: 1 (or 32 if you want leading zeros)


        int num3 = 7;
        int zeroCount3 = countBitsTozeroBasedOnString(num3);
        System.out.println("Number of zero bits in " + num3 + ": " + zeroCount3); // Output: 0


        int num4 = 16;  // Example with more leading zeros
        int zeroCount4 = countBitsTozeroBasedOnString(num4);
        System.out.println("Number of zero bits in " + num4 + ": " + zeroCount4); // Output: 4



    }
}
