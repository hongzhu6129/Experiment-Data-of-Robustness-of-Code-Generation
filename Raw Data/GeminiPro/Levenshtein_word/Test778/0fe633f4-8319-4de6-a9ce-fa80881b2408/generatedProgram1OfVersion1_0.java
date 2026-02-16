public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top stripes and stars section
        for (int i = 0; i < 5; i++) {
            // Stars section
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); // Space between stars and stripes

            // Stripes section
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line
        }


         // Print the bottom stripes section
         for (int i = 0; i < 4; i++){
            for( int j=0; j<38; j++){
                System.out.print("=");
            }
            System.out.println();
         }

    }
}
