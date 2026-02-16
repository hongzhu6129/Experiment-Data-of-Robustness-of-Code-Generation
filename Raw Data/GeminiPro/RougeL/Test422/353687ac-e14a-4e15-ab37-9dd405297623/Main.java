import java.util.Arrays;
public class Main {    
    public static void main(String[] args) {
        String main_string = "abcd abc aabc baa abcaa";
       String sub_string = "aa";
       int countV1 = count_sub_str_in_main_str(main_string, sub_string);
       System.out.println(sub_string + "' has occured " + countV1 + " times in '" + main_string + "'");            
   }
  public static int count_sub_str_in_main_str(String main_string, String sub_string) {
       if (main_string == null || sub_string == null) {
           throw new IllegalArgumentException("The given strings cannot be null");
       }
       if (main_string.isEmpty() || sub_string.isEmpty()) {
           return 0;
       }
       int position = 0;
       int ctr = 0;
       int n = sub_string.length();
       while ((position = main_string.indexOf(sub_string, position)) != -1) {
           position = position + n;
           ctr++;
       }
       return ctr;
   }
}