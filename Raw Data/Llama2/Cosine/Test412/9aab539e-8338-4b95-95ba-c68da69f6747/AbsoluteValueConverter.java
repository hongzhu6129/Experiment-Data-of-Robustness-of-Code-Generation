public class AbsoluteValueConverter {

    public static void main(String[] args) {
        int num1 = 5;
        int absNum1 = convert(num1);
        System.out.println("The absolute value of " + num1 + " is: " + absNum1);

        int num2 = -10;
        int absNum2 = convert(num2);
        System.out.println("The absolute value of " + num2 + " is: " + absNum2);

        int num3 = 0;
        int absNum3 = convert(num3);
        System.out.println("The absolute value of " + num3 + " is: " + absNum3);

    }

    public static int convert(int num) {
        if (num < 0) {
            return -num; 
        } else {
            return num;
        }
    }
}
