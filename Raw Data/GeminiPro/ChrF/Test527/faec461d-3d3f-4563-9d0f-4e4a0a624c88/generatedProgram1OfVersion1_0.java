public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can adjust this limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;

            for (int b = a + 1; b <= n; b++) { // Start b from a+1 to avoid duplicates
                int b3 = b * b * b;
                if (a3 + b3 > n) break;
                
                for (int c = 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > n) break;

                    for (int d = c + 1; d <= n; d++) { // Start d from c+1 to avoid duplicates
                        int d3 = d * d * d;
                        if (c3 + d3 > n) break;

                        if (a3 + b3 == c3 + d3 && a != c && a != d) {
                            System.out.println(a3 + b3 + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding one such number
                        }
                    }
                }
            }
        }
    }
}
