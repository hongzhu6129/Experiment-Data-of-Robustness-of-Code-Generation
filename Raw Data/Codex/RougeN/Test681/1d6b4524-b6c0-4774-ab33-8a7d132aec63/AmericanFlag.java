public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star section
        for (int i = 0; i < 5; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // Print stripes
            System.out.println("==================================");
        }


        //Alternate star/stripe for rows 5-9
        for (int i = 0; i < 4; i++) {
            // Print indented stars only on the first row of this section
             if (i == 0) {
                System.out.print("     ");
                for (int k=0; k<3;k++){
                    System.out.print("* ");
                }

                System.out.print("pct "); //pct flag variant as requested
                System.out.println();
            } else{
                System.out.println(); //blank row as there are only 3 stars
            }


            System.out.println("==================================");
        }



        // Print the remaining stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }


    }
}
