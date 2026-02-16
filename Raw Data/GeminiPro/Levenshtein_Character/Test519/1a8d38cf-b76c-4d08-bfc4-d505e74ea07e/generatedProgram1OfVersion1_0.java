public class PronicNumber {

    public static void main(String[] args) {
        int num = 110; // Example input, you can modify this or take input from the user

        boolean isPronic = checkPronic(num);

        if (isPronic) {
            System.out.println("Pronic Number.");
        } else {
            System.out.println("Not a Pronic Number.");
        }
    }

    public static boolean checkPronic(int num) {
        if (num < 0) {
            return false; // Pronic numbers are non-negative
        }

        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }

        return false;
    }
}
