public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 6; ++j) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; ++j) {
                System.out.print("=");
            }
            System.out.println();

             if(i == 2) {
                System.out.print("  pct ");
            }
            else{
                System.out.print("      ");
            }

           
        }

        // Print the striped section

        for (int k=0; k < 6; k++) {
         System.out.print("==");
            for (int j = 0; j < 20; ++j) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
