public class GetWholeAndFractional {

    public static void main(String[] args) {
        // Example usage:
        double num1 = 123.456;
        getParts(num1);

        double num2 = -789.012;
        getParts(num2);

        double num3 = 45.0; // Integer value
        getParts(num3);

        double num4 = 0.789; // Only fractional part
        getParts(num4);

        double num5 = -0.345; // Negative fractional part
        getParts(num5);

     }

    public static void getParts(double num) {
        int wholePart = (int) num;  // Cast to int to get the whole number part.

        double fractionalPart = num - wholePart; // Subtract the whole part to get the fractional part.

        System.out.println("Original number: " + num);
        System.out.println("Whole part: " + wholePart);
        System.out.println("Fractional part: " + fractionalPart);
        System.out.println("------------------");
    }
}

