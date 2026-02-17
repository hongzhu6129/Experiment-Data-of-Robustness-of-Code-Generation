public class FermatNumbers {

    public static void main(String[] args) {
        int count = 0;
        int n = 0;

        while (count < 10) {
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n))) + 1;

            // Check for overflow (Fermat numbers grow very quickly)
            if (fermatNumber < 0) { 
                System.out.println("Further Fermat numbers exceed the maximum long value.");
                break;
            }

            System.out.println(fermatNumber);
            n++;
            count++;
        }
    }
}
