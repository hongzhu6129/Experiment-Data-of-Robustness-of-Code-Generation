public class AmericanFlag {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            // Stars section
            for (int j = 0; j < 6; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            // Space between stars and stripes
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }

            // Stripes Section
            System.out.print("==");
            for(int j = 0; j < 20; j++){
                System.out.print("=");
            }
            System.out.println();
        }



        // Stripes only section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
             for(int j = 0; j < 20; j++){
                System.out.print("=");
            }
           System.out.println();
        }

    }
}
