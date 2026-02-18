public class CompareDoubles {

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 10.5;
        double num3 = 10.500000000000001; // A very close value
        double num4 = 10.6;


        System.out.println(num1 + " and " + num2 + " are equal: " + (num1 == num2)); // Direct comparison (generally not recommended)

        System.out.println(num1 + " and " + num3 + " are equal (direct comparison): " + (num1 == num3)); // Demonstrates potential issues

        System.out.println(num1 + " and " + num3 + " are equal (using Double.compare): " + (Double.compare(num1, num3) == 0)); // Recommended

        System.out.println(num1 + " and " + num4 + " are equal: " + (num1 == num4));



        // Using Math.abs and a tolerance
        double tolerance = 0.000001; // Define your acceptable difference

        System.out.println(num1 + " and " + num3 + " are equal (within tolerance): " + (Math.abs(num1 - num3) < tolerance));
         System.out.println(num1 + " and " + num2 + " are equal (within tolerance): " + (Math.abs(num1 - num2) < tolerance));

    }
}
