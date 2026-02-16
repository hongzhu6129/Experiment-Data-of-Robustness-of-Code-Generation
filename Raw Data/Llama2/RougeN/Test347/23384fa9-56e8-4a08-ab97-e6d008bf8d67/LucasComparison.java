public class LucasComparison {

    public static void main(String[] args) {
        int n = 10; // Number of Lucas numbers to display

        int l0 = 2;
        int l1 = 1;

        System.out.println("First " + n + " Lucas numbers and their comparison with Fibonacci:");

        // Handle the first two Lucas numbers separately
        System.out.println("L(0) = " + l0 + (n > 0 ? "" : "\n")); // Print only if n > 0
        if (n > 1) {
            System.out.println("L(1) = " + l1 + (n > 1 ? "" : "\n")); // Print only if n > 1
        }

        // Calculate and display the remaining Lucas numbers
        for (int i = 2; i < n; i++) {
            int li = l0 + l1;
            System.out.println("L(" + i + ") = " + li);

            l0 = l1;
            l1 = li;
        }

        //Fibonacci for comparison - Note this is an addition outside original scope
        if(n>0){
            System.out.println("\n--- Fibonacci Comparison ---");
            int f0 = 0;
            int f1 = 1;

            System.out.println("F(0) = " + f0 ); 
             if (n > 1) {
                System.out.println("F(1) = " + f1);
             }
             for (int i = 2; i < n; i++) {
                int fi = f0 + f1;
                System.out.println("F(" + i + ") = " + fi);
                f0 = f1;
                f1 = fi;
            }

        }

    }
}
