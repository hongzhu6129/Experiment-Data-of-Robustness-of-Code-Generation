import java.util.Scanner;

public class HemagglutininValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the hemagglutinin values
        System.out.println("Enter the hemagglutinin value 1:");
        int value1 = scanner.nextInt();

        System.out.println("Enter the hemagglutinin value 2:");
        int value2 = scanner.nextInt();

        // Compare the hemagglutinin values
        if (value1 == value2) {
            System.out.println("The hemagglutinin values are equal.");
        } else if (value1 > value2) {
            System.out.println("The hemagglutinin value 1 is greater than the hemagglutinin value 2.");
        } else {
            System.out.println("The hemagglutinin value 1 is less than the hemagglutinin value 2.");
        }
    }
}
