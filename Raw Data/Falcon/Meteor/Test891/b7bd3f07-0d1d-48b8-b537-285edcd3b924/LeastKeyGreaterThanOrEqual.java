import java.util.TreeSet;

public class LeastKeyGreaterThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenKey1 = 25;
        Integer result1 = getLeastKeyGreaterThanOrEqual(treeSet, givenKey1);
        System.out.println("Least key greater than or equal to " + givenKey1 + ": " + result1); // Output: 30

        int givenKey2 = 10;
        Integer result2 = getLeastKeyGreaterThanOrEqual(treeSet, givenKey2);
        System.out.println("Least key greater than or equal to " + givenKey2 + ": " + result2); // Output: 10

        int givenKey3 = 55;
        Integer result3 = getLeastKeyGreaterThanOrEqual(treeSet, givenKey3);
        System.out.println("Least key greater than or equal to " + givenKey3 + ": " + result3); // Output: null


        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String givenKey4 = "apricot";
        String result4 = getLeastKeyGreaterThanOrEqual(stringTreeSet, givenKey4);
        System.out.println("Least key greater than or equal to " + givenKey4 + ": " + result4); // Output: banana


        String givenKey5 = "apple";
        String result5 = getLeastKeyGreaterThanOrEqual(stringTreeSet, givenKey5);
        System.out.println("Least key greater than or equal to " + givenKey5 + ": " + result5); // Output: apple

        String givenKey6 = "zoo";
        String result6 = getLeastKeyGreaterThanOrEqual(stringTreeSet, givenKey6);
        System.out.println("Least key greater than or equal to " + givenKey6 + ": " + result6); // Output: null
    }



    public static <T> T getLeastKeyGreaterThanOrEqual(TreeSet<T> set, T key) {
        return set.ceiling(key); 
    }
}
