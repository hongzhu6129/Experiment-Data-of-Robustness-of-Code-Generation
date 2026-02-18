public class FacePrinter {

    public static void printFace(int size) {
        if (size < 3) {
            System.out.println("Face size must be at least 3.");
            return; // Handle invalid input
        }

        // Top of head
        printHorizontalLine(size);

        // Eyes and nose
        for (int i = 0; i < size - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < size - 2; j++) {
                if (i == (size - 2) / 2 ) { // Middle row
                    if(j == (size-2)/2) { // Middle of the face
                        System.out.print("N"); // Nose
                    }
                    else if (j == (size-2)/4 || j == 3*(size-2)/4 ) {
                        System.out.print("O");  //Eyes
                    }
                    else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("|");
        }


        // Bottom of head
        printHorizontalLine(size);
    }


    private static void printHorizontalLine(int size) {
        System.out.print("+");
        for (int i = 0; i < size - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void main(String[] args) {
       printFace(5);
        printFace(7);
        printFace(3); // Corner case: smallest valid size
        printFace(1); // Corner case: invalid size
        printFace(0);  // Corner case: invalid size
        printFace(15); // Larger size
        printFace(4); // Even numbered size.


    }
}
