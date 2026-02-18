public class SumOfSeven {

    public static void main(String[] args) {
        // Test data provided: 74 + 36 = 110 (only two numbers).  We'll demonstrate with seven.

        int num1 = 74;
        int num2 = 36;
        int num3 = 12;
        int num4 = 5;
        int num5 = 8;
        int num6 = 20;
        int num7 = 3;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println("The sum of the seven numbers is: " + sum);


        // Alternative using an array (more flexible):

        int[] numbers = {74, 36, 12, 5, 8, 20, 3};
        int sumArray = 0;
        for (int number : numbers) {
            sumArray += number;
        }

        System.out.println("The sum using an array is: " + sumArray);



    }
}
