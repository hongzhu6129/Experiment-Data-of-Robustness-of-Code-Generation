public class FermatNumbers {

    public static void main(String[] args) {
        System.out.println("The first 10 Fermat numbers are:");

        for (int n = 0; n < 10; n++) {
            long fermatNumber = (long) Math.pow(2, Math.pow(2, n)) + 1; // Calculate Fermat number

            //Check for overflow as Fermat numbers grow very quickly. If overflow occurs, print a message
            if (fermatNumber < 0) { //overflow check
                System.out.println("F" + n + ": Overflow occurred - Number too large to represent with a long integer.");
            } else {
                System.out.println("F" + n + ": " + fermatNumber); 
            }

        }
    }
}
