public class FermatNumbers {

    public static void main(String[] args) {
        int n = 10; // Number of Fermat numbers to display

        System.out.println("First " + n + " Fermat numbers:");

        for (int i = 0; i < n; i++) {
            // Calculate Fermat number using Math.pow and explicit type casting to long
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, i)) + 1); 
            System.out.println(fermatNumber);
        }
    }
}
