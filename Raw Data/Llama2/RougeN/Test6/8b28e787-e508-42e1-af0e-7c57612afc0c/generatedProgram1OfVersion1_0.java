import java.util.Arrays;

public class SwapThreeVariables {

    public static void main(String[] args) {

        // Test case 1: Positive integers
        int a = 10;
        int b = 20;
        int c = 30;
        swap(a, b, c);


        // Test case 2: Negative integers
        a = -5;
        b = 0;
        c = -15;
        swap(a, b, c);


        // Test case 3: Zero values
        a = 0;
        b = 0;
        c = 0;
        swap(a, b, c);



        // Test case 4: Duplicate values
        a = 5;
        b = 5;
        c = 10;
        swap(a, b, c);



        // Test case 5: Large numbers
        a = Integer.MAX_VALUE;
        b = Integer.MIN_VALUE;
        c = 100000;
        swap(a, b, c);

    }


    public static void swap(int a, int b, int c) {
        System.out.println("Original values: a = " + a + ", b = " + b + ", c = " + c);

        int temp = a;
        a = b;
        b = c;
        c = temp;


        System.out.println("Swapped values: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("--------------------");


    }
}
