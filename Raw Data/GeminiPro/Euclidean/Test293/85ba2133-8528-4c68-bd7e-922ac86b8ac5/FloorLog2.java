public class FloorLog2 {

    public static void main(String[] args) {
        // Example usages:
        int n1 = 16;
        int result1 = floorLog2(n1);
        System.out.println("Floor(log2(" + n1 + ")) = " + result1); // Output: 4

        int n2 = 17;
        int result2 = floorLog2(n2);
        System.out.println("Floor(log2(" + n2 + ")) = " + result2); // Output: 4

        int n3 = 1;
        int result3 = floorLog2(n3);
        System.out.println("Floor(log2(" + n3 + ")) = " + result3); // Output: 0


        int n4 = 0;  // Handling edge case: n=0 (log is undefined)
        int result4 = floorLog2(n4);
        System.out.println("Floor(log2(" + n4 + ")) = " + result4); // Output: -1 (or handle as needed)


        int n5 = -5; //  Handling negative inputs (log undefined)
        int result5 = floorLog2(n5);
        System.out.println("Floor(log2(" + n5 + ")) = " + result5); // Output: -1 (or handle as needed)




    }

    public static int floorLog2(int n) {
        if (n <= 0) {
            return -1; // Or throw an exception if log of non-positive isn't allowed.
        }

        int result = -1;
        while (n > 0) {
            n >>= 1; // Efficient integer division by 2
            result++;
        }
        return result;
    }
}


