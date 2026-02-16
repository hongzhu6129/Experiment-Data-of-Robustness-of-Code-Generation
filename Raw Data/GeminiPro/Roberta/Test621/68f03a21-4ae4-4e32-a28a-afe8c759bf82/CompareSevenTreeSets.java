import java.util.TreeSet;

public class CompareSevenTreeSets {

    public static void main(String[] args) {
        // Create seven TreeSets
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        TreeSet<Integer> set3 = new TreeSet<>();
        TreeSet<Integer> set4 = new TreeSet<>();
        TreeSet<Integer> set5 = new TreeSet<>();
        TreeSet<Integer> set6 = new TreeSet<>();
        TreeSet<Integer> set7 = new TreeSet<>();

        // Populate the sets with some sample data (you can change this)
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);

        set3.add(3);
        set3.add(2);
        set3.add(1); // TreeSet orders elements

        set4.add(1);
        set4.add(2);

        set5.add(1);
        set5.add(2);
        set5.add(3);
        set5.add(4);


        set6.add(5);
        set6.add(6);
        set6.add(7);

        set7.add(1);
        set7.add(2);
        set7.add(3);


        // Compare the sets pairwise
        System.out.println("set1 equals set2: " + set1.equals(set2)); // True - same elements, same order
        System.out.println("set1 equals set3: " + set1.equals(set3)); // True - same elements, order doesn't matter for equality
        System.out.println("set1 equals set4: " + set1.equals(set4)); // False - different number of elements
        System.out.println("set1 equals set5: " + set1.equals(set5)); // False - different elements
        System.out.println("set1 equals set6: " + set1.equals(set6)); // False - different elements

        System.out.println("set2 equals set3: " + set2.equals(set3)); // True
        System.out.println("set2 equals set4: " + set2.equals(set4)); // False
        System.out.println("set2 equals set5: " + set2.equals(set5)); // False
        System.out.println("set2 equals set6: " + set2.equals(set6)); // False


        // ... and so on for all other comparisons (set3 vs set4, set3 vs set5, ...)
        // You can use nested loops to avoid repeating these lines.

        // Example of comparing all sets to each other using nested loops:
        TreeSet<Integer>[] sets = new TreeSet[]{set1, set2, set3, set4, set5, set6, set7};

        for (int i = 0; i < sets.length; i++) {
            for (int j = i + 1; j < sets.length; j++) { // Start j from i+1 to avoid redundant comparisons
                System.out.println("set" + (i + 1) + " equals set" + (j + 1) + ": " + sets[i].equals(sets[j]));
            }
        }




    }
}
