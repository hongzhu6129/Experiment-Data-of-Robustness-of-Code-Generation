public class FermatNumbers {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            // Calculate Fermat number using Math.pow and explicit type casting to long
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n)) + 1); 

            System.out.println(fermatNumber);


        }
    }
}
