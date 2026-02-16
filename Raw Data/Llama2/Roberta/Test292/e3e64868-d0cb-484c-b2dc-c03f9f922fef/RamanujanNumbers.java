public class RamanujanNumbers {

    public static void main(String[] args) {
        int n = 1729; // You can change this to search up to a different limit

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sum = a * a * a + b * b * b;
                if (sum <= n) {
                    int count = 0;
                    for (int c = 1; c < a; c++) {  // Avoid duplicates and ensure different pairs
                        for (int d = 1; d < b; d++) {
                            if (c * c * c + d * d * d == sum && (c*c*c + d*d*d != a*a*a + b*b*b || (c != a && d != b)) ) {
                                count++;
                            }


                        }
                    }


                    if (count > 0) {
                        System.out.println(sum + " = " + a + "^3 + " + b + "^3 can be expressed as the sum of two cubes in "+ (count+1) +" ways.");
                        //return; // Uncomment if you only want the first such number

                    }


                    for (int c = 1; c <= n; c++) { // additional check needed if a == b
                        for (int d = 1; d <=n; d++){
                            if( a==b && (c!=a && d !=b) && sum == c*c*c+d*d*d){
                                count++;
                            }
                        }
                    }
                    if(count > 0 && a == b){
                        System.out.println(sum + " = " + a + "^3 + " + b + "^3 can be expressed as the sum of two cubes in "+ (count+1) +" ways.");
                        //return;
                    }

                }
            }

        }

    }
}
