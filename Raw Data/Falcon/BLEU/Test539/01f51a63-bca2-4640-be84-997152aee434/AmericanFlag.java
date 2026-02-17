public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
           
            System.out.print(" ================================\n"); // Print the stripes
        }
         //The 7th row with 'pct'
          for (int j = 0; j < 6; j++) {
                if (j!=2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("pct ");
                }
          }
         System.out.print(" ================================\n");

        for (int j=0; j<3;j++){
            for(int k=0; k<6;k++){
                 System.out.print("* ");
            }
            System.out.print(" ================================\n");
        }




        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.print("==================================\n");
        }
    }
}
