import java.util.TreeSet;

public class TreeSetHigherElement {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<RateObject> treeSet = new TreeSet<>();

        treeSet.add(new RateObject("A", 10));
        treeSet.add(new RateObject("B", 5));
        treeSet.add(new RateObject("C", 15));
        treeSet.add(new RateObject("D", 20));
        treeSet.add(new RateObject("E", 12));


        RateObject target = new RateObject("Target", 11);

        RateObject higher = getHigherElement(treeSet, target);

        if (higher != null) {
            System.out.println("Element higher than " + target.rate + ": " + higher.rate +  " (Name: " + higher.name + ")");
        } else {
            System.out.println("No element found higher than " + target.rate);
        }


        target = new RateObject("Target", 25); // Test with a value greater than any in the set
        higher = getHigherElement(treeSet, target);

        if (higher != null) {
            System.out.println("Element higher than " + target.rate + ": " + higher.rate);
        } else {
            System.out.println("No element found higher than " + target.rate);
        }

         target = new RateObject("Target", 4); // Test with a value lower than any in the set
        higher = getHigherElement(treeSet, target);

        if (higher != null) {
            System.out.println("Element higher than " + target.rate + ": " + higher.rate +  " (Name: " + higher.name + ")");
        } else {
            System.out.println("No element found higher than " + target.rate);
        }

    }


    public static RateObject getHigherElement(TreeSet<RateObject> treeSet, RateObject target) {
       return treeSet.higher(target);

    }



    static class RateObject implements Comparable<RateObject> {
        String name;
        int rate;

        public RateObject(String name, int rate) {
            this.name = name;
            this.rate = rate;
        }

        @Override
        public int compareTo(RateObject other) {
            return Integer.compare(this.rate, other.rate);  // Compare based on rate
        }


    }
}
