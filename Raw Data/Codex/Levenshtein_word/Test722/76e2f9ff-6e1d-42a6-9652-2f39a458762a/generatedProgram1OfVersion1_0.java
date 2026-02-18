public class CountEvenWeird {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17, 20, 23, 6, 7, 10}; // Example array

        int evenCount = 0;
        int weirdCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                boolean isWeird = false;
                if (num > 1 && num <= 20) { // Weird condition: odd and in range (2, 20]
                    isWeird = true;
                } else if (num > 20 && num % 2 != 0 && !(num >= 2 && num <= 5)) { // Weird condition: odd and >20, excluding 2 to 5
                   isWeird = true; 
                }
                
                if (isWeird) {
                    weirdCount++;
                }
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Weird numbers count: " + weirdCount);
    }
}
