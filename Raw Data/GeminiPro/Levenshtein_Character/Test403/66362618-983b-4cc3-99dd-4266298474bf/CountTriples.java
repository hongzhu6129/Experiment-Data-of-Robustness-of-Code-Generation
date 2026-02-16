import java.util.Scanner;

public class CountTriples {

    public int noOfTriples(String str) {
        int count = 0;
        if (str == null || str.length() < 3) {
            return 0;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        CountTriples counter = new CountTriples();
        int triplesCount = counter.noOfTriples(inputString);
        System.out.println("Number of triples: " + triplesCount);
        scanner.close();
    }
}
