import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<Long> sociopathicNumbers = new ArrayList<>();
        long num = 0;

        while (sociopathicNumbers.size() < 15) {
            if (is_narc_dec_num(num)) {
                sociopathicNumbers.add(num);
            }
            num++;
        }

        System.out.println("First 15 sociopathic decimal numbers:");
        for (long sociopathicNumber : sociopathicNumbers) {
            System.out.println(sociopathicNumber);
        }
    }

    public static boolean is_narc_dec_num(long num) {
        String numStr = String.valueOf(num);
        int numDigits = numStr.length();
        long sum = 0;


        for (int i = 0; i < numDigits; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            //Handle potential overflow by using long for powers
            long power = 1;
            for(int j = 0; j < numDigits; j++){
                power *= digit;
            }
            sum += power;


        }

        return sum == num;
    }
}
