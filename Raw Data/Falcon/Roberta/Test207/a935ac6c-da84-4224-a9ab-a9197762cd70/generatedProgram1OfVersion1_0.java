public class DoubleMethods {

    public static void main(String[] args) {
        double num1 = 12.34;
        double num2 = 5.67;

        // Basic arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        // Absolute value
        System.out.println("Absolute value of " + num1 + ": " + Math.abs(num1));

        // Rounding operations
        System.out.println("Rounded to nearest integer: " + Math.round(num1));
        System.out.println("Rounded to 2 decimal places: " + String.format("%.2f", num1));

        // Comparison operations
        System.out.println("Is " + num1 + " greater than " + num2 + "? " + (num1 > num2));
        System.out.println("Is " + num1 + " less than " + num2 + "? " + (num1 < num2));
        System.out.println("Is " + num1 + " equal to " + num2 + "? " + (num1 == num2));

        // Trigonometric operations
        double angle = Math.PI / 2; // 90 degrees
        System.out.println("Sine of " + angle + ": " + Math.sin(angle));
        System.out.println("Cosine of " + angle + ": " + Math.cos(angle));
        System.out.println("Tangent of " + angle + ": " + Math.tan(angle));

        // Exponential and logarithmic operations
        System.out.println("e raised to the power of " + num1 + ": " + Math.exp(num1));
        System.out.println("Natural logarithm of " + num1 + ": " + Math.log(num1));
    }
}
