public class FermatNumbers {

    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            double fermatNumber = Math.pow(2, Math.pow(2, n)) + 1;
            System.out.println(fermatNumber);
        }
    }
}
