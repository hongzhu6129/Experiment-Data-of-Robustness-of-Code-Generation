import java.util.Comparator;
import java.util.TreeMap;

public class TekelecSort {

    public static void main(String[] args) {
        // Sample data (replace with your actual data)
        TreeMap<String, String> tekelecMap = new TreeMap<>(new TekelecComparator()); 

        tekelecMap.put("12345", "Value1");
        tekelecMap.put("67890", "Value2");
        tekelecMap.put("11223", "Value3");
        tekelecMap.put("44556", "Value4");
        tekelecMap.put("77889", "Value5");
        tekelecMap.put("234567", "Value6");  // Longer key example
        tekelecMap.put("7890123", "Value7"); // Longer key example


        // Print the sorted map
        System.out.println(tekelecMap);
    }

    public static class TekelecComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Tekelec sorting logic:  Shorter strings first, then alphabetically
            int len1 = s1.length();
            int len2 = s2.length();

            if (len1 != len2) {
                return len1 - len2;  // Shorter strings come first
            } else {
                return s1.compareTo(s2); // If same length, sort alphabetically
            }
        }
    }
}


