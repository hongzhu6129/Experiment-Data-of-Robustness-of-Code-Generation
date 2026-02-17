import java.util.Scanner;

public class NPlusNNPlusNNN {

    public static int calculateSum(int n) {
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        return n + nn + nnn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int sum = calculateSum(n);
        System.out.println(sum);
        scanner.close(); 
    }
}
