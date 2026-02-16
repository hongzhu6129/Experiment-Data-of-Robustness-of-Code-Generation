import java.util.Scanner;

public class IntegerToBinary {

    public static String functionone(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder); // Insert at the beginning for correct order
            n /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String binaryNum = functionone(num);
        System.out.println("Binary representation: " + binaryNum);
        scanner.close();
    }
}
