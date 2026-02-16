public class SwapLastTwo {

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str; // Return original string if length is less than 2
        }

        int len = str.length();
        char lastChar = str.charAt(len - 1);
        char secondLastChar = str.charAt(len - 2);

        return str.substring(0, len - 2) + lastChar + secondLastChar;
    }

    public static void main(String[] args) {
        SwapLastTwo swap = new SwapLastTwo();

        System.out.println(swap.lastTwo("coding")); // Output: codnig
        System.out.println(swap.lastTwo("cat"));   // Output: cta
        System.out.println(swap.lastTwo("a"));     // Output: a
        System.out.println(swap.lastTwo(""));      // Output: 
        System.out.println(swap.lastTwo("ab"));    // Output: ba

    }
}
