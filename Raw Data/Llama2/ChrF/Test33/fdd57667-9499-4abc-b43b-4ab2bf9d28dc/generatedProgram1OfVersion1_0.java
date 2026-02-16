public class CanonicalString {

    public static void main(String[] args) {

        // Example strings
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();

        // Print string values
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

        // Check for object equality (using ==)
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1 == str3: " + (str1 == str3)); // true
        System.out.println("str2 == str3: " + (str2 == str3)); // true


        //Illustrating another example with slightly different string creation
        String s1 = "Java";           // "Java" will be added to the string pool
        String s2 = "Java";           // s2 will refer to the same object as s1 in the pool.
        String s3 = new String("Java");// Creates a new string object outside the pool.
        String s4 = s3.intern();     // s4 will refer to the object in the pool, if "Java" already present, otherwise, s3 will be added. 

        System.out.println("s1 == s2: " + (s1 == s2)); // true  (Both refer to the same object in the pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (s1 is in the pool, s3 is not)
        System.out.println("s1 == s4: " + (s1 == s4)); // true  (s4 refers to the object in the pool, which is the same as s1)
        System.out.println("s3 == s4: " + (s3 == s4)); // true (after s3.intern() is called in newer Java versions - String Deduplication)


        //Using intern() to get the canonical representation explicitly
        String anyString = new String("Example");
        String canonicalString = anyString.intern();

        System.out.println("anyString == canonicalString: " + (anyString==canonicalString)); // Likely true in modern Java due to string deduplication.


    }
}
