public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; //  You can change this value to search up to a different limit

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break; // Optimization: Stop if a^3 exceeds n

            for (int b = a + 1; b <= n; b++) { // b starts from a+1 to avoid duplicate pairs
                int b3 = b * b * b;
                int sum = a3 + b3;
                if (sum > n) break; // Optimization: Stop if the sum exceeds n

                // Check if the sum can be expressed as the sum of two other cubes
                int count = 0;
                for (int c = 1; c < b; c++) { // c must be less than b to find different pairs
                    int c3 = c * c * c;
                    if (c3 > sum) break;

                    int d3 = sum - c3;
                    int d = (int) Math.round(Math.cbrt(d3));  // Calculate the cube root
                    
                    if (d*d*d == d3 && d>0 ) { // Check that the cube root is an integer and is positive
                        count++;
                    }
                 }

                if (count > 0) {
                    System.out.println(sum + " = " + a + "^3 + " + b + "^3");
                     //If you want to only find ONE such number and exit, uncomment below:
                    //return;  
                }
            }
        }
    }
}
