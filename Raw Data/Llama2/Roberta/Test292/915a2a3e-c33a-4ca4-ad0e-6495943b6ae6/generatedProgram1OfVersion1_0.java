public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  Ramanujan's number

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; 
            }

            int count = 0;
            for (int b = 1; b < a; b++) { // Ensure distinct pairs (b < a)
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break;
                }

                for (int c = 1; c < a; c++) {
                    int c3 = c * c * c;

                    for (int d = c + 1; d < a; d++) { // Ensure distinct pairs (d > c) � important for different ways
                        int d3 = d * d * d;
                        if (c3 + d3 == sum) {
                            count++;
                            if (count >=1) { // Found at least two different ways
                                if (sum <= n) {
                                System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                }
                            }
                        }
                    }
                }
            
            }
        }
    }
}
