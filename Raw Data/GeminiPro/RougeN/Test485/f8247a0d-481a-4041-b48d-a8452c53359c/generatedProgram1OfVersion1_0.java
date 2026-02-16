class AverageCalculator {

    public static void main(String[] args) {
        double num1 = 25;
        double num2 = 45;
        double num3 = 65;

        double avg = average(num1, num2, num3);
        System.out.println("The average value is " + avg);

    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
