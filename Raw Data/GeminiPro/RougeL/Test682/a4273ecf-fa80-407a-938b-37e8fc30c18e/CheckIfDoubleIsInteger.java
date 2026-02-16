public class CheckIfDoubleIsInteger {

    public static void main(String[] args) {

        // Example usage:
        double num1 = 10.0;
        double num2 = 3.14;
        double num3 = -5.0;
        double num4 = 0.0;
        double num5 = 2.0000000000001;  // Close to 2 but not quite

        System.out.println(num1 + " is an integer: " + isDoubleAnInteger(num1)); // Output: true
        System.out.println(num2 + " is an integer: " + isDoubleAnInteger(num2)); // Output: false
        System.out.println(num3 + " is an integer: " + isDoubleAnInteger(num3)); // Output: true
        System.out.println(num4 + " is an integer: " + isDoubleAnInteger(num4)); // Output: true
        System.out.println(num5 + " is an integer: " + isDoubleAnInteger(num5)); // Output: false



        // Explanation of different methods:

        // 1. Using Math.floor():
        System.out.println("\nUsing Math.floor():");
        explainUsingMathFloor(num1);
        explainUsingMathFloor(num2);

        // 2. Using modulo operator (%):
        System.out.println("\nUsing modulo operator (%):");
        explainUsingModulo(num1);
        explainUsingModulo(num2);


        //3. Using casting to long
        System.out.println("\nUsing casting to long:");
        explainUsingCasting(num1);
        explainUsingCasting(num2);

    }

    public static boolean isDoubleAnInteger(double num) {
        return num == (long) num; //Casting to long truncates and comparing it back with num gives us if the number is an integer
    }



    public static void explainUsingMathFloor(double num) {
        if (num == Math.floor(num)) {
            System.out.println(num + " is an integer because it's equal to its floor value.");
        } else {
            System.out.println(num + " is not an integer because it's different from its floor value.");
        }
    }

    public static void explainUsingModulo(double num) {
        if (num % 1 == 0) {
            System.out.println(num + " is an integer because the remainder when divided by 1 is 0.");
        } else {
            System.out.println(num + " is not an integer because the remainder when divided by 1 is not 0.");
        }
    }

    public static void explainUsingCasting(double num) {
        if(num == (long)num) {
            System.out.println(num + " is an integer because casting it to long does not change the value");
        }
        else {
            System.out.println(num + " is not an integer because casting it to long changes the value.");
        }
    }
}
