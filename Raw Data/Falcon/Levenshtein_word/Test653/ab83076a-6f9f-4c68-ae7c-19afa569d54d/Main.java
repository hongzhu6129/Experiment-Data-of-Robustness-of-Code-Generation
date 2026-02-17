public class Main {
    
    public static void main(String[] args) {
          String main_string = "Java is the foundation for virtually every type of "+
           "networked application and is the global standard for developing and "+
           " delivering embedded and mobile applications, games, Web-based content, "+
           " and enterprise software. With more than 9 million developers worldwide,"+
           " Java enables you to efficiently develop, deploy and use exciting applications and services.";
            System.out.println("Original string:");
           System.out.println(main_string);
           String sub_string1 = "million";
            String sub_string2 = "millions";
           boolean result1 = is_present(main_string, sub_string1);
            System.out.println("\nIs '"+sub_string1+"'"+ " present in the said text?");
           System.out.println(result1);
           boolean result2 = is_present(main_string, sub_string2);
            System.out.println("\nIs '"+sub_string2+"'"+ " present in the said text?");
           System.out.println(result2);                        
 }
    public static boolean is_present(String main_string, String sub_string) {
      if (main_string == null || sub_string == null || main_string.isEmpty() || sub_string.isEmpty()) {
            return false;
       }
       return main_string.indexOf(sub_string) != -1;
   }
}