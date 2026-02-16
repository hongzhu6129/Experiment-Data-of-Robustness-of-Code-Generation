public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }
            if(i==1){
                System.out.print("pct");
            }



            System.out.println();



            // Print stripes
             if(i<4) {
                for (int j = 0; j < (i % 2 == 0 ? 4 : 5); j++) {
                    System.out.print("* ");
                }

                System.out.print("==");
                for (int j = 0; j < 24; j++) {
                    System.out.print("=");
                }
                System.out.println();


            }


        }

        // Print the remaining stripes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
