public class PrintFacing {

    public static void printFacing(int size) {
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }

        for (int i = 0; i < size; i++) {
            // Print spaces for the left side of the face
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print the eyes
            System.out.print("o   o");


            // Print spaces for the right side of the face (only needed if size > 1 to avoid extra spaces)
            if (size > 1) {
                for (int j = 0; j < 2 * (size - i - 1) -1 ; j++) {  // Adjust spacing for alignment
                    System.out.print(" ");
                }
            }
            
          // Print the ears (Avoid for size 1 and on the last row)
             if(size > 1 && i != size - 1){
                 System.out.print("|");
                 if(size>2 && i != size-2){
                     for (int j = 0; j < 2 * (size - i - 2) -1; j++) {
                        System.out.print(" ");
                     }
                 }
                 System.out.print("|");
             }



            System.out.println(); // Newline after each row
        }

        // Print the mouth
        for (int i = 0; i < size; i++) {
            System.out.print("  ");
        }
        System.out.println("-----"); // Mouth

    }


    public static void main(String[] args) {
        // Test cases
        printFacing(1);  // Corner case: size 1
        System.out.println();
        printFacing(2);
        System.out.println();

        printFacing(3);
        System.out.println();

        printFacing(4); // General case
        System.out.println();


        printFacing(5); // Larger size
        System.out.println();

        printFacing(0); // Corner case: size 0
        System.out.println();


        printFacing(-1); // Corner case: negative size

    }
}
