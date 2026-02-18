import java.util.Comparator;
import java.util.TreeMap;

public class TekelecTreeMapSort {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator (TekelecComparator)
        TreeMap<String, String> tekelecMap = new TreeMap<>(new TekelecComparator());

        // Add some sample key-value pairs
        tekelecMap.put("12345", "Value1");
        tekelecMap.put("67890", "Value2");
        tekelecMap.put("13579", "Value3");
        tekelecMap.put("24680", "Value4");

        // Print the sorted map (keys are sorted according to the TekelecComparator)
        System.out.println(tekelecMap);
    }

    public static class TekelecComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Tekelec sorting logic (example: even digits first, then odd digits)
            String even1 = s1.replaceAll("[13579]", "");
            String odd1 = s1.replaceAll("[02468]", "");
            String even2 = s2.replaceAll("[13579]", "");
            String odd2 = s2.replaceAll("[02468]", "");

            int evenComparison = even1.compareTo(even2);
            if (evenComparison != 0) {
                return evenComparison;
            } else {
                return odd1.compareTo(odd2);
            }


            // OR Implement any other desired Tekelec sorting logic here...
            // For instance, if Tekelec sorting means sorting by string length:
            // return Integer.compare(s1.length(), s2.length());
        }
    }
}



