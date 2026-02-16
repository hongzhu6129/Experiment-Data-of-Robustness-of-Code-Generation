public class HappyNumbers {

    public static void main(String[] args) {
        int count = 0;
        int num = 1;
        System.out.println("First 10 Happy Numbers:");

        while (count < 10) {
            if (happy_num(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println(); 
    }

    public static boolean happy_num(long num) {
        java.util.HashSet<Long> seen = new java.util.HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            long sum = 0;
            long temp = num;

            while (temp > 0) {
                long digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            num = sum;
        }

        return num == 1;
    }
}
