class Solution {

    static float Taylor_exponential(int n, float x) {
        float sum = 1.0f; // Initialize sum of series

        for (int i = n - 1; i > 0; --i )
            sum = 1 + x * sum / i;

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms
        float x = 2.0f; // Value of x

        System.out.println("e^x using Taylor Series: " + Taylor_exponential(n, x));
    }
}
