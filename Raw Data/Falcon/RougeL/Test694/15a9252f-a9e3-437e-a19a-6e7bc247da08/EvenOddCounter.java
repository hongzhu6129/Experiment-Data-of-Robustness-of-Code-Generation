public class EvenOddCounter {

    public static void main(String[] args) {
        // Example array - you can change this to test with different arrays
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


        // Example using manual array input within main method
        // (Not ideal for larger arrays or user input)
         /*  int[] numbers2 = new int[5];  // Example size 5 - adjust as needed

        numbers2[0]= 11;
        numbers2[1]= 22;
        numbers2[2]= 33;
        numbers2[3]= 44;
        numbers2[4]= 55;

        int evenCount2 = 0;
        int oddCount2 = 0;


         for(int i=0; i<numbers2.length; i++ ){
             if(numbers2[i]%2 ==0){
                 evenCount2++;
             }
             else{
                 oddCount2++;
             }

         }


        System.out.println("Even numbers in second array: " + evenCount2);
        System.out.println("Odd numbers in second array : " + oddCount2);
         */


    }
}
