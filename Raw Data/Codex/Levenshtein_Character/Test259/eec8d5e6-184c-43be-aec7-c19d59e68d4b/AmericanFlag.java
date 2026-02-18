public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stripes and stars section
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) { // Star rows
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
            } else { // Plain rows
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }

            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }


        // Print the red stripes
        for (int i = 0; i < 6; i++) {
           for(int j=0; j<38; j++){
               System.out.print("=");
           }
           System.out.println();
        }



    }
}
