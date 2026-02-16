public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); 

            // Print the stripes
            System.out.println("================================");
        }

        //Print the remaining stripes
        for (int k=0; k < 3; k++){
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ");
                System.out.println("================================");
        }
         for (int i = 0; i < 6; i++) {
            System.out.println("================================");
        }



    }
}
