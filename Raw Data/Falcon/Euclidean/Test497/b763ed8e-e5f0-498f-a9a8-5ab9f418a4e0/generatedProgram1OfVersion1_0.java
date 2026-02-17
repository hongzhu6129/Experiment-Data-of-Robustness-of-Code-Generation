public class SixCubeSums {

    public static void main(String[] args) {
        int n = 1000000; // Adjust the upper limit as needed

        for (int a = 1; a * a * a < n; a++) {
            for (int b = a + 1; a * a * a + b * b * b < n; b++) {
                int sum = a * a * a + b * b * b;

                int count = 0;
                for (int c = 1; c * c * c < sum; c++) {
                    int diff = sum - c * c * c;
                    int d = (int) Math.round(Math.cbrt(diff));  // Efficiently check for integer cube root
                    if (d * d * d == diff) {
                        count++;
                    }
                }


                if (count >= 6) {
                    System.out.println(sum + " can be expressed as the sum of two cubes in " + count + " ways.");
                    // You can choose to break here if you only need to find one such number
                }

            }
        }


    }
}
