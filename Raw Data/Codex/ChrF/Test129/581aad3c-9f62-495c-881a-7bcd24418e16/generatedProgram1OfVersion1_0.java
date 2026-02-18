import java.util.Scanner;

public class IntegerToString {

    public static String transform_int_to_string(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        String str = transform_int_to_string(num);
        System.out.println("String format of the said integer: " + str);
        input.close(); 
    }
}
