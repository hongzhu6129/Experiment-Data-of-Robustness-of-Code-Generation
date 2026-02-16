import java.util.TreeSet;

public class FarFromSeven {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);

        System.out.println("Numbers far than 7 (absolute difference > 2):");
        findFarFromSeven(numbers); 
    }

    private static void findFarFromSeven(TreeSet<Integer> numbers) {
        for (int num : numbers) {
            if (Math.abs(num - 7) > 2) {
                System.out.println(num);
            }
        }
    }
}
