import java.util.Scanner;

public class IntegerToBinary {

    public static String convertToBinary(int n) {
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
        int number = scanner.nextInt();
        String binaryNumber = convertToBinary(number);
        System.out.println("Binary representation: " + binaryNumber);
        scanner.close(); 
    }
}


