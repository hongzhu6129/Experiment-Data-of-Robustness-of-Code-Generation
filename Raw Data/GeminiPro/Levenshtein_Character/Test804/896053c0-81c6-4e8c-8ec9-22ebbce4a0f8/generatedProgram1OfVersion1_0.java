public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 5; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) { // Adjusted length for better visual
                System.out.print("=");
            }
            System.out.println();


             // Print the stripes
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
            }
             System.out.print("==");
            for (int j = 0; j < 26; j++) { // Adjusted length
                System.out.print("=");
            }
            System.out.println();

        }

          for (int i = 0; i < 4; i++) { // Adjusted loop count for stripes

            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 26; j++) { // Adjusted length
                System.out.print("=");
            }

             System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print("  ");
            }

            System.out.print("==");
            for (int j = 0; j < 26; j++) { // Adjusted length
                System.out.print("=");
            }
            System.out.println();



        }

        // Print the red stripes section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

      }

}
