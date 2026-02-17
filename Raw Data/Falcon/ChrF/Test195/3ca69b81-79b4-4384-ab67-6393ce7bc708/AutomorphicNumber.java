public class AutomorphicNumber {

    public static void main(String[] args) {
        int num = 76; // Example number, you can change this or take input from the user
        if (isAutomorphic(num)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }


        num = 5;  // Test another number
        if (isAutomorphic(num)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }

         num = 25; // Not automorphic
         if (isAutomorphic(num)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }
        
         num = 890625; // Automorphic
        if (isAutomorphic(num)) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an Automorphic Number.");
        }



    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;

        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numStr);
    }
}
