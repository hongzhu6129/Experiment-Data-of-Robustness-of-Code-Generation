public class KaprekarNumbers {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.println(i + " " + i * i + " " + String.join(" + ", split_num(String.valueOf(i * i), String.valueOf(i).length())));
                count++;
            }
        }
        System.out.println(count + " kaprekar numbers.");
    }

    private static boolean isKaprekar(int n) {
        String sq_n = String.valueOf(n * n);
        int num_digits = String.valueOf(n).length();

        String[] parts = split_num(sq_n, num_digits);

        if (parts == null) {
            return false;
        }
        
        try {
            int firstPart = Integer.parseInt(parts[0]);
            int secondPart = Integer.parseInt(parts[1]);
            return (firstPart + secondPart) == n;
        } catch (NumberFormatException e) { //Handle potential parsing issues, e.g., leading zeros
            return false;
        }
    }

    private static String[] split_num(String num_str, int num_digits) {
        int n = num_str.length();

        if (n <= num_digits) {
            if (n==1 && Integer.parseInt(num_str) ==0 && num_digits ==1){
                return new String[] {"0","0"};
            }

            if (Integer.parseInt(num_str) == 0 && num_digits>1){

                String paddedZeroes = String.format("%0" + num_digits + "d", 0);
                return new String[] {"0",paddedZeroes};
            }



            return (Integer.parseInt(num_str) ==0) ? new String[] {"0","0"} : null;
        }


        String right = num_str.substring(n - num_digits);
        String left = num_str.substring(0, n - num_digits);




        return new String[]{left, right};

    }
}
