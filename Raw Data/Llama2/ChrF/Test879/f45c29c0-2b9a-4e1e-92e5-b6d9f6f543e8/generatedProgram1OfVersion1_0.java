public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if (i % 2 == 0) {
                System.out.print("* "); // Extra star for even rows
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the bottom red section
        for (int i = 0; i < 6; i++) {
             if (i == 2 && args.length > 0 && args[0].equals("pct")) { // pct argument for placing "pct"
                 for (int k=0; k < 6; k++) {
                    System.out.print("* ");
                 }
                 System.out.print("pct ");
                 for (int k=0; k < 5; k++) {
                    System.out.print("* ");
                 }
            }else{
                for (int j = 0; j < 27; j++) {
                   System.out.print("=");
                }
            }

            
            System.out.print("==");

             for (int j = 0; j < 20; j++) {
               System.out.print("=");
            }


            System.out.println();
        }


    }
}
