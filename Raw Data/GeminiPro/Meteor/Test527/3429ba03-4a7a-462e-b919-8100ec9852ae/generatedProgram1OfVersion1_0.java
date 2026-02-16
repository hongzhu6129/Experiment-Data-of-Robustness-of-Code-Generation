public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; 
            }

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;

                if (sum > n) {
                    break;
                }


                for (int c = a + 1; c <= n; c++) {  //Inner loops to find a different pair
                    int c3 = c * c * c;
                    if (c3 > n) {
                        break;
                    }

                    for (int d = c + 1; d <= n; d++) { // d starts from c+1 to avoid duplicate pairs
                        int d3 = d * d * d;
                        if (c3 + d3 > n) {
                           break;
                        }
                        
                        if (sum == (c3 + d3) && sum <=n) {
                            System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            return; // Exit after finding the first such number
                        }
                    }
                }
            }
        }
    }
}
