import java.util.Comparator;

public class ChordComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.toLowerCase().compareTo(b.toLowerCase());
    }
}

public class Main {

    public static void main(String[] args) {
        ChordComparator comparator = new ChordComparator();

        // Test cases
        int result1 = comparator.compare("C", "c");
        int result2 = comparator.compare("C", "D");
        int result3 = comparator.compare("C", "C#");
        int result4 = comparator.compare("C#", "Db");
        int result5 = comparator.compare("G", "g");

        // Print the results
        System.out.println(result1); // 0
        System.out.println(result2); // -1
        System.out.println(result3); // -1
        System.out.println(result4); // 0
        System.out.println(result5); // 0
    }
}
