public class FermatNumbers {

    public static void main(String[] args) {
        int n = 10; // Number of Fermat numbers to display

        System.out.println("First " + n + " Fermat numbers:");

        for (int i = 0; i < n; i++) {
            long fermatNumber = calculateFermatNumber(i);
            System.out.println(fermatNumber);


        }
    }


    private static long calculateFermatNumber(int n) {
        return (long) Math.pow(2, Math.pow(2, n)) + 1;
    }
}



