public class Ramanujan {

    public static void main(String[] args) {
        int n = 1729; // You can change this to any other upper limit

        for (int a = 1; a <= n; a++) {
            int count = 0;
            for (int i = 1; i * i * i < a; i++) {
                int a3 = a - i * i * i;
                int b = (int) Math.round(Math.cbrt(a3));
                if (b * b * b == a3) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println(a + " can be expressed as the sum of two cubes in at least two different ways.");
                // Optional: find and print the actual pairs for demonstration 
                for (int i = 1; i * i * i < a; i++) {
                    int a3 = a - i * i * i;
                    int b = (int) Math.round(Math.cbrt(a3));
                    if (b * b * b == a3) {
                        System.out.println(a + " = " + i + "^3 + " + b + "^3");
                    }
                }
               
                // Stop after finding the first such number (as the problem statement only requires to find *any* number).
                return; 
            }
        }



    }
}
