import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);


        // Get the numbers less than 7 using headSet() method
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) numbers.headSet(7);

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + lessThanSeven);


        //Alternatively, iterate and print using a simple loop:
        System.out.print("Numbers less than 7 (using loop): ");
        for(Integer num : numbers){
            if(num < 7){
                System.out.print(num + " ");
            }
        }
        System.out.println(); //Newline for clarity
    }
}
