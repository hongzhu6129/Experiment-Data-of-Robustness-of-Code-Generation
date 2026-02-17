public class PronicNumber {

    public static void main(String[] args) {
        int num = 110; // You can change this to test different numbers
        boolean isPronic = checkPronic(num);

        if (isPronic) {
            System.out.println("Pronic Number.");
        } else {
            System.out.println("Not a Pronic Number.");
        }


        // Example with user input (requires error handling in real application)
        //Scanner input = new Scanner(System.in);
        //System.out.print("Input a number: ");
        //int numInput = input.nextInt();
        //if (checkPronic(numInput)) {
        //    System.out.println("Pronic Number.");
        //} else {
        //    System.out.println("Not a Pronic Number.");
        //}
        //input.close();
    }

    public static boolean checkPronic(int num) {
        if (num < 0) {
            return false; // Pronic numbers are non-negative
        }

        for (int i = 0; i <= Math.sqrt(num); i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }
}
