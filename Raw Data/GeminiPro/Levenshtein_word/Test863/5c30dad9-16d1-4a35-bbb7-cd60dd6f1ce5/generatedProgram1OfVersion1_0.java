public class Summation {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of 1 to 10 is: " + sum);


        // Alternatively, you can calculate it directly using the formula:
        int sumFormula = (10 * (10 + 1)) / 2;
        System.out.println("The sum calculated using the formula is: " + sumFormula);


        //  Illustrating the individual additions (for educational purposes)
        System.out.print("1");
        int runningSum = 1;
        for (int i = 2; i <= 10; i++) {
            System.out.print(" + " + i);
            runningSum += i;
        }
        System.out.println(" = " + runningSum);
    }
}
