public class HarshadNumber {

    public static void main(String[] args) {
        int num = 353; // You can change this to test other numbers
        
        System.out.print(num + " is ");
        if (!isHarshad(num)) {
            System.out.print("not ");
        }
        System.out.println("a harshad number.");

        // Additional examples:
        System.out.print(200 + " is ");
        if (!isHarshad(200)) {
            System.out.print("not ");
        }
        System.out.println("a harshad number.");

        System.out.print(171 + " is ");
        if (!isHarshad(171)) {
            System.out.print("not ");
        }
        System.out.println("a harshad number.");


    }


    private static boolean isHarshad(int num) {
        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        return (sumOfDigits != 0 && num % sumOfDigits == 0); 
    }
}
