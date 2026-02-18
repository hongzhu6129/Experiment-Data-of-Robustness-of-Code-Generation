public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part of the flag (stars and stripes)
        for (int i = 0; i < 5; i++) {
            // Stars section
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *"); 
                }
            }
            System.out.print(" ");
            
             //Stripes section
             System.out.print("================================");
            System.out.println();
            
          
        }
          for (int i = 0; i < 4; i++) {
              //Stars section is empty for these rows
              for (int j = 0; j < 6; j++) {
                  System.out.print("  ");
              }
              System.out.print(" ");
              //Stripes section
              System.out.print("================================");
              System.out.println();
          }
        
    }
}
