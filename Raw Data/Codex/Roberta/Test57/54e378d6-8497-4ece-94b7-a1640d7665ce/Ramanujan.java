public class Ramanujan {

    public static void main(String[] args) {

        int n = 1729; //  You can change this to search up to a different limit

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sumOfCubes1 = a * a * a + b * b * b;
                if (sumOfCubes1 > n) break; // Optimization: No need to continue if the sum exceeds n
                int count = 0;


                for (int c = 1; c <= n; c++) {
                    for (int d = 1; d <= n; d++) {
                        int sumOfCubes2 = c * c * c + d * d * d;

                        if (sumOfCubes2 > n) break; // Optimization

                        if (sumOfCubes1 == sumOfCubes2) {
                            if (a != c || b != d) { // Ensure they are different pairs
                                if (a <=b && c <= d) {  // Avoid duplicates like (1,12) and (12,1) or (9,10) and (10,9)
                                        count++;
                                }

                            }
                        }

                    }
                }
                if (count >= 1) {  // Found a number expressible as sum of two cubes in two ways.

                        System.out.print(sumOfCubes1 + " = ");
                        for (int c = 1; c <= n; c++) {
                             for (int d = 1; d <= n; d++) {
                                int sumOfCubes2 = c * c * c + d * d * d;
                                if (sumOfCubes1 == sumOfCubes2 && (c <= d) ) {
                                    System.out.print(c + "^3 + " + d + "^3 ");
                                     if (c!= a || d != b) System.out.print("and ");
                                }
                             }
                        }

                    System.out.println("");



                }


            }
        }
    }
}
