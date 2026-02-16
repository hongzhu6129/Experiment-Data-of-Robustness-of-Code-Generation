public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();


            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
             
         if(i==5) break;  // Important: Prevent extra lines after the 6th stripe pair
        }


        // Print the solid red section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 24; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
