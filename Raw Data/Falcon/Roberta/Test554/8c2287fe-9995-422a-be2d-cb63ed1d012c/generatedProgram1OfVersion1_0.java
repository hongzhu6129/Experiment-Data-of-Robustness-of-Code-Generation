import java.util.*;

public class DeathWithMagazines {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input
        int n = sc.nextInt();
        String[] magazines = new String[n];
        for (int i = 0; i < n; i++) {
            magazines[i] = sc.nextLine();
        }

        // Find the duplicate magazines
        Set<String> duplicates = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (magazines[i].equals(magazines[j])) {
                    duplicates.add(magazines[i]);
                }
            }
        }

        // Print the duplicate magazines
        for (String magazine : duplicates) {
            System.out.println(magazine);
        }
    }
}
