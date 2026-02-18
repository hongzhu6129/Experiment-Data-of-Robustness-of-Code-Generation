public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this value

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) {
                break; 
            }

            int count = 0;
            int[] pairs = new int[100]; // Adjust size if needed

            for (int b = 1; b < a; b++) {
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) {
                    break; // Optimization
                }

                for (int c = 1; c < b; c++) {
                    int c3 = c * c * c;
                    for (int d = 1; d < c; d++) {
                        int d3 = d * d * d;

                        if (c3 + d3 == sum) {
                           
                            boolean found = false;
                            for(int k = 0; k < count; k++){
                                if(pairs[k] == sum){
                                    found = true;
                                    break;
                                }
                            }
                            if(!found){
                                if (count > 0) {
                                    System.out.println(sum + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                                    return; // Exit after finding the first such number
                                }
                                pairs[count++] = sum; 
                            }
                        }

                    }

                }

            }
        }
    }
}
