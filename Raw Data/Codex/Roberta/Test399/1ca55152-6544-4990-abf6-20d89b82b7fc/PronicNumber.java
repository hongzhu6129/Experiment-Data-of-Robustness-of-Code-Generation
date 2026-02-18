public class PronicNumber {

    public static void main(String[] args) {
        int num = 110; // You can change this to any number you want to check

        boolean isPronic = checkPronic(num);

        if (isPronic) {
            System.out.println("Pronic Number.");
        } else {
            System.out.println("Not a Pronic Number.");
        }
    }

    private static boolean checkPronic(int num) {
        if (num < 0) { // Pronic numbers are non-negative
            return false;
        }

        for (int i = 0; i <= Math.sqrt(num); i++) { // Efficiently check up to the square root
            if (i * (i + 1) == num) {
                return true;
            }
        }

        return false;
    }
}

