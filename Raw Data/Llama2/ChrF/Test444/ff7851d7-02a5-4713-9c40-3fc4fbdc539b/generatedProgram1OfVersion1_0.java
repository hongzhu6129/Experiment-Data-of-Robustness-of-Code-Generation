public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number (example)

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; 
            }

            int count = 0;
            for (int b = 1; b < a; b++) {  // Avoid duplicates (a^3 + b^3 is same as b^3 + a^3)
                int b3 = b * b * b;
                if (a3 + b3 > n) {
                    break;
                }

                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > n) {
                        break;
                    }

                    for (int d = 1; d < c; d++) { // Avoid duplicates
                        int d3 = d * d * d;

                        if (c3 + d3 > n) {
                            break;
                        }

                        if (a3 + b3 == c3 + d3 && a != c && a != d && b != c && b!=d) {
                            if (count == 0) { // Print the number only the first time a match is found
                                System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");

                            }
                             count++; 
                        }
                    }
                }


            }

          
        }

    }
}
