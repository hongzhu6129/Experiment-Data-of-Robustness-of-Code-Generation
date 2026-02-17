public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part with stars and stripes
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();

             for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
          
        }


        // Print the bottom part with only stripes
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
