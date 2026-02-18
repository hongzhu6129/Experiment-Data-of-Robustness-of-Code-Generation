public class AnotherNumber {

    public static void main(String[] args) {
        String word = "GOOD";
        System.out.println(getAnotherNumber(word)); // 4
    }

    private static int getAnotherNumber(String word) {
        int result = 0;
        for (char c : word.toCharArray()) {
            result += (c - 'A') + 1;
        }
        return result;
    }
}
