public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            if(i == 2) {
                System.out.print(" pct");
            }
            System.out.println();


            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();

        }

         // Print the stripes section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for(int j = 0; j < 30; j++) {
                 System.out.print("=");
            }
            System.out.println();
        }
    }
}
