public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Display the first 10 Lucas numbers

        int a = 2; // First Lucas number
        int b = 1; // Second Lucas number

        System.out.print("First 10 Lucas numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b; 
        }
    }
}
