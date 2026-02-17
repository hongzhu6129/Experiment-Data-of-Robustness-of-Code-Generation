class Solution {

    public static void main(String[] args) {
        System.out.println("1"); // 1*1 = 1, 1 = 1
        for (int i = 2; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isKaprekar(int n) {
        long square = (long) n * n;
        String sqStr = String.valueOf(square);
        int numDigits = sqStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqStr, i);
            if (parts[1].length() > 0 &&  // Handle leading zeros in the right part.
                 Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == n) {
                
                // Additional check to prevent "00" being parsed as a valid number (specifically for 999).
                if (Integer.parseInt(parts[1]) == 0 && parts[1].length() > 1) { 
                    continue; 
                }

                return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String left = numStr.substring(0, index);
        String right = numStr.substring(index);
       
        if (left.isEmpty()) { // Handle the case where the left part is empty.
             left ="0";
        }
        
        return new String[]{left, right};
    }
}
