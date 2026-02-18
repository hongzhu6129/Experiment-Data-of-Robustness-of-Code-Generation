public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            // Print the stripes
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();

            //Alternate shorter row of stars
            if (i % 2 == 1) {
                  for (int j = 0; j < 5; j++) {
                      System.out.print("* ");
                  }
                // Print the stripes
                 System.out.print("==");
                 for (int j = 0; j < 20; j++) {
                     System.out.print("=");
                   }
                  System.out.println();

             }


        }


        //Print the only red stripe (simulated here with =).  There are multiple ways to handle the "pct".  This solution replaces one "=" with "pct".  
        //More visually accurate solutions require more complex console manipulation outside the scope of this basic example. 
        System.out.print("==");

           for (int j = 0; j < 19; j++) {
               System.out.print("=");
           }
           System.out.print("pct");

            System.out.println();





        // Print the striped section
        for (int i = 0; i < 6; i++) {
            // Print the stripes only
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
