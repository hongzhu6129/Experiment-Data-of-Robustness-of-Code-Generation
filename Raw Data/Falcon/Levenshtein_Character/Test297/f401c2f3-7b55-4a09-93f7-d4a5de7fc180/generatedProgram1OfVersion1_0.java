class Solution {
    /**
     * Given two integers, return true if either one is 15 or if their sum or difference is 15.
     *
     * @param a First integer
     * @param b Second integer
     * @return True if either one is 15 or if their sum or difference is 15.
     *
     * Examples:
     * calculate(10, 5) == true
     * calculate(15, 9) == true
     * calculate(7, 8) == true
     * calculate(7, 7) == false
     * calculate(10, 15) == true
     * calculate(20, 5) == true
     */
    public static boolean calculate(int a, int b) {
        return a == 15 || b == 15 || a + b == 15 || Math.abs(a - b) == 15;
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, 5)); // true
        System.out.println(calculate(15, 9)); // true
        System.out.println(calculate(7, 8)); // true
        System.out.println(calculate(7, 7)); // false
        System.out.println(calculate(10, 15)); //true
        System.out.println(calculate(20,5)); // true
        System.out.println(calculate(5,20)); // true
    }
}
