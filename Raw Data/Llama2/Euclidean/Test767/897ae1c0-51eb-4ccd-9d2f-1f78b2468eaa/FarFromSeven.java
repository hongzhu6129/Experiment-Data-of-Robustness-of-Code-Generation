import java.util.TreeSet;

public class FarFromSeven {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);

        // Find numbers far than 7 (absolute difference > 2)
        System.out.println("Numbers far than 7 (absolute difference > 2):");
        for (int num : numbers) {
            if (Math.abs(num - 7) > 2) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


        // Example with a different set and threshold
         TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(6);
        numbers2.add(8);
        numbers2.add(10);

        int threshold = 1; // Change the threshold here

        System.out.println("Numbers far than 7 (absolute difference > " + threshold + "):");
        for (int num : numbers2) {
            if (Math.abs(num - 7) > threshold) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


    }
}
