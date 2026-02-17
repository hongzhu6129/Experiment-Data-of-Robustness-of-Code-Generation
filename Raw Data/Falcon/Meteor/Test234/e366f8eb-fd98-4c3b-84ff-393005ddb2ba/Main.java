import java.util.Scanner;
import java.util.regex.*;
import java.lang.*;
import java.util.*;  

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        boolean found = false;
        int index = str.indexOf(".");
        
        if (index != -1) {
            String substring = str.substring(0, index);
            Pattern pattern = Pattern.compile(".*\\.");
            Matcher matcher = pattern.matcher(substring);
            
            if (matcher.matches()) {
                found = true;
            }
        }
        
        if (found) {
            System.out.println("Substring appears before period.");
        } else {
            System.out.println("Substring does not appear before period.");
        }
    }
}
