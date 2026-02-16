import java.util.TreeSet;

public class GreaterThanOrEqualInTreeSet {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> greenSet = new TreeSet<>();
        greenSet.add(10);
        greenSet.add(20);
        greenSet.add(30);
        greenSet.add(40);
        greenSet.add(50);

        int element1 = 25;
        Integer greaterOrEqual1 = greenSet.ceiling(element1);
        System.out.println("Element greater than or equal to " + element1 + ": " + greaterOrEqual1); // Output: 30

        int element2 = 20;
        Integer greaterOrEqual2 = greenSet.ceiling(element2);
        System.out.println("Element greater than or equal to " + element2 + ": " + greaterOrEqual2); // Output: 20

        int element3 = 60;
        Integer greaterOrEqual3 = greenSet.ceiling(element3); 
        System.out.println("Element greater than or equal to " + element3 + ": " + greaterOrEqual3); // Output: null (no element greater or equal)


         // Example with Strings (natural ordering):
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");

        String targetString = "blueberry";
        String greaterOrEqualString = stringSet.ceiling(targetString);
        System.out.println("String greater than or equal to \"" + targetString + "\": \"" + greaterOrEqualString + "\""); // Output: orange


        targetString = "apple";
        greaterOrEqualString = stringSet.ceiling(targetString);
        System.out.println("String greater than or equal to \"" + targetString + "\": \"" + greaterOrEqualString + "\""); // Output: apple
    }
}
