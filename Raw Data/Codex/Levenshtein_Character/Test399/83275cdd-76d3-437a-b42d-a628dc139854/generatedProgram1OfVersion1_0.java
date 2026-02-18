public class KaprekarNumbers {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count + " kaprekar numbers.");
    }

    private static boolean isKaprekar(int num) {
        long square = (long) num * num;
        String sqrStr = String.valueOf(square);
        int numDigits = sqrStr.length();

        for (int i = 1; i < numDigits; i++) {
            String[] parts = split_num(sqrStr, i);
            if (parts[1].length() > 0 && Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) == num && Integer.parseInt(parts[1])!=0)
            {
                return true;
            }
        }
        return false;
    }

    private static String[] split_num(String numStr, int index) {
        String[] parts = new String[2];
        parts[0] = numStr.substring(0, index);
        parts[1] = numStr.substring(index);

        if(parts[0].length() == 0){
            parts[0] = "0";
        }


        return parts;
    }
}
