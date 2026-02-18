public class SumChecker {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        boolean result = sumoftwo(num1, num2, num3);

        System.out.println("The result is: " + result);


        num1 = 5;
        num2 = 10;
        num3 = 20;

        result = sumoftwo(num1, num2, num3);
        System.out.println("The result is: " + result);


    }

    public static boolean sumoftwo(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}
