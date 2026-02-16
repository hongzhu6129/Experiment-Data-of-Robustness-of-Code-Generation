public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number (taxi-cab number)

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break;  // Optimization: Stop when a^3 exceeds n
            }

            for (int b = a + 1; b <= n; b++) { // b > a to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) {
                    break; // Optimization: Stop when a^3 + b^3 exceeds n
                }


                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > sum) {
                        break;
                    }

                    for (int d = c + 1; d <= n; d++) { // d > c to avoid duplicate pairs and ensure (c,d) != (a,b)
                        int d3 = d * d * d;
                        if (c3 + d3 > sum) {
                            break;
                        }

                        if (c3 + d3 == sum ) {
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number
                        }
                    }
                }
            }
        }



    }
}
